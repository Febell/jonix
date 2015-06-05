/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tectonica.jonix.basic.BasicContributor;
import com.tectonica.jonix.basic.BasicPrice;
import com.tectonica.jonix.basic.BasicProduct;
import com.tectonica.jonix.basic.BasicSalesRights;
import com.tectonica.jonix.basic.BasicSubject;
import com.tectonica.jonix.basic.BasicText;
import com.tectonica.jonix.basic.BasicTitle;
import com.tectonica.jonix.codelist.ContributorRoles;
import com.tectonica.jonix.codelist.CountryCodeIso31661s;
import com.tectonica.jonix.codelist.LanguageRoles;
import com.tectonica.jonix.codelist.PriceTypes;
import com.tectonica.jonix.codelist.ProductIdentifierTypes;
import com.tectonica.jonix.codelist.RightsRegions;
import com.tectonica.jonix.codelist.SalesRightsTypes;
import com.tectonica.jonix.codelist.SubjectSchemeIdentifiers;
import com.tectonica.jonix.codelist.TextTypes;
import com.tectonica.jonix.codelist.TitleTypes;
import com.tectonica.jonix.struct.JonixLanguage;
import com.tectonica.jonix.struct.JonixProductIdentifier;

public enum BasicColumn implements JonixColumn
{
	ISBN13("ISBN13", 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractProductId(fieldData, ProductIdentifierTypes.ISBN_13, product);
		}

		private boolean extractProductId(String[] fieldData, ProductIdentifierTypes stdType, BasicProduct product)
		{
			JonixProductIdentifier prodId = product.info.findProductId(stdType);
			if (prodId != null)
			{
				fieldData[0] = prodId.idValue;
				return true;
			}
			return false;
		}
	},

	Title(new String[] { "Title", "SubTitle" }, 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractTitle(fieldData, TitleTypes.Distinctive_title_book, product);
		}

		private boolean extractTitle(String[] fieldData, TitleTypes stdType, BasicProduct product)
		{
			BasicTitle title = product.titles.findTitle(stdType);
			if (title != null)
			{
				fieldData[0] = title.titleText;
				fieldData[1] = title.subtitle;
				return true;
			}
			return false;
		}
	},

	SeriesTitle("SeriesTitle", 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			if (product.collections.size() > 0)
			{
				fieldData[0] = product.collections.get(0).mainTitle;
				return true;
			}
			// NOTE: we should probably drill down to the 'titles' member of the series if 'titleOfSeries' is blank
			return false;
		}
	},

	Author("Author", 3)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractContributors(fieldData, ContributorRoles.By_author, product);
		}
	},

	Editor("Editor", 2)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			if (!extractContributors(fieldData, ContributorRoles.Edited_by, product))
			{
				if (!extractContributors(fieldData, ContributorRoles.Volume_editor, product))
				{
					if (!extractContributors(fieldData, ContributorRoles.Series_edited_by, product))
					{
						if (!extractContributors(fieldData, ContributorRoles.Editor_in_chief, product))
						{
							if (!extractContributors(fieldData, ContributorRoles.Managing_editor, product))
							{
								return extractContributors(fieldData, ContributorRoles.Guest_editor, product);
							}
						}
					}
				}
			}
			return true;
		}
	},

	Language("Language", 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractLanguage(fieldData, LanguageRoles.Language_of_text, product);
		}

		private boolean extractLanguage(String[] fieldData, LanguageRoles stdType, BasicProduct product)
		{
			JonixLanguage language = product.description.findLanguage(stdType);
			if (language != null)
			{
				fieldData[0] = language.languageCode.name();
				return true;
			}
			return false;
		}
	},

	NumOfPages("NumOfPages", 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			fieldData[0] = product.description.numberOfPages;
			return true;
		}
	},

	Publisher("Publisher", 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			if (product.publishers.size() > 0)
			{
				fieldData[0] = product.publishers.get(0).publisherName;
				return true;
			}
			// NOTE: maybe we should look at the 'publisherRole' as well?
			return false;
		}
	},

	PublicationDate("PublicationDate", 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			fieldData[0] = product.publishingDetails.publicationDate;
			return true;
		}
	},

	Dewey("Dewey", 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractSubjects(fieldData, SubjectSchemeIdentifiers.Dewey, product);
		}
	},

	BISAC("BISAC", 5)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractSubjects(fieldData, SubjectSchemeIdentifiers.BISAC_Subject_Heading, product);
		}
	},

	BIC("BIC", 5)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractSubjects(fieldData, SubjectSchemeIdentifiers.BIC_subject_category, product);
		}
	},

	Keywords("Keywords", 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractSubjects(fieldData, SubjectSchemeIdentifiers.Keywords, product);
		}
	},

	PriceAmount(new String[] { "PriceType", "PriceAmount", "CurrencyCode" }, 3)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractPrices(fieldData, RECOMMENDED_RETAIL_PRICES, product);
		}

		private boolean extractPrices(String[] fieldData, Set<PriceTypes> stdTypes, BasicProduct product)
		{
			List<BasicPrice> prices = product.supplyDetails.findPrices(stdTypes);
			int pos = 0;
			for (BasicPrice price : prices)
			{
				fieldData[pos + 0] = price.priceType.name();
				fieldData[pos + 1] = price.priceAmountAsStr;
				fieldData[pos + 2] = price.currencyCode.name();
				pos += 3;
				if (pos >= fieldData.length)
					break;
			}
			return pos > 0;
		}
	},

	SalesAllowedIn("SalesAllowed", 3)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractSalesRights(fieldData, UNRESTRICTED_SALES_RIGHTS, product);
		}
	},

	SalesBannedIn("SalesBanned", 3)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractSalesRights(fieldData, NO_SALES_RIGHTS, product);
		}
	},

	Description(new String[] { "Description", "DescriptionFormat" }, 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractOtherText(fieldData, TextTypes.Description, product);
		}
	},

	ShortDescription(new String[] { "ShortDescription", "ShortDescriptionFormat" }, 1)
	{
		@Override
		public boolean extractTo(String[] fieldData, BasicProduct product)
		{
			return extractOtherText(fieldData, TextTypes.Short_description_annotation, product);
		}
	};

	private final int repetition;
	private final String[] subColumnNames;

	@Override
	public int getRepetitions()
	{
		return repetition;
	}

	@Override
	public String[] getSubColumnNames()
	{
		return subColumnNames;
	}

	private BasicColumn(String[] subColumnNames, int repetition)
	{
		this.subColumnNames = subColumnNames;
		this.repetition = repetition;
	}

	private BasicColumn(String columnName, int repetition)
	{
		this(new String[] { columnName }, repetition);
	}

	public static final JonixColumn[] all = values();

	// //////////////////////////////////////////////////////////////////////////////////////////////

	private static boolean extractContributors(String[] fieldData, ContributorRoles stdRole, BasicProduct product)
	{
		List<BasicContributor> contributors = product.contributors.findContributors(stdRole);
		int pos = 0;
		for (BasicContributor contributor : contributors)
		{
			String displayName = contributor.displayName;
			if (displayName == null)
				continue;
			fieldData[pos] = displayName;
			if (++pos == fieldData.length)
				break;
		}
		return pos > 0;
	}

	private static boolean extractSubjects(String[] fieldData, SubjectSchemeIdentifiers stdScheme, BasicProduct product)
	{
		List<BasicSubject> subjects = product.subjects.findSubjects(stdScheme);
		int pos = 0;
		for (BasicSubject subject : subjects)
		{
			fieldData[pos] = (subject.subjectCode != null) ? subject.subjectCode : subject.subjectHeadingText;
			if (++pos == fieldData.length)
				break;
		}
		return pos > 0;
	}

	private static boolean extractSalesRights(String[] fieldData, Set<SalesRightsTypes> stdTypes, BasicProduct product)
	{
		List<BasicSalesRights> salesRightss = product.salesRightss.findSalesRights(stdTypes);
		int pos = 0;
		for (BasicSalesRights salesRights : salesRightss)
		{
			StringBuffer sb = new StringBuffer();
			if (salesRights.regions != null)
				sb.append(salesRights.regions).append("#");
			sb.append("|");
			if (salesRights.countries != null)
				for (Set<CountryCodeIso31661s> cc : salesRights.countries)
					sb.append(cc).append(";");
			sb.append("|");
			if (salesRights.rightRegions != null)
				for (RightsRegions rr : salesRights.rightRegions)
					sb.append(rr.name()).append(",");
			fieldData[0] = sb.toString(); // .toUpperCase();
			if (++pos == fieldData.length)
				break;
		}
		return pos > 0;
	}

	private static boolean extractOtherText(String[] fieldData, TextTypes stdType, BasicProduct product)
	{
		BasicText otherText = product.texts.findText(stdType);
		if (otherText != null)
		{
			fieldData[0] = otherText.text;
			if (otherText.textFormat != null)
				fieldData[1] = otherText.textFormat.name();
			return true;
		}
		return false;
	}

	private static final Set<PriceTypes> RECOMMENDED_RETAIL_PRICES = new HashSet<>(Arrays.asList(new PriceTypes[] {
			PriceTypes.RRP_including_tax, PriceTypes.RRP_excluding_tax }));

	private static final Set<SalesRightsTypes> NO_SALES_RIGHTS = new HashSet<>(
			Arrays.asList(new SalesRightsTypes[] {
					SalesRightsTypes.Not_for_sale_in_the_specified_countries_or_territories_reason_unspecified,
					SalesRightsTypes.Not_for_sale_in_the_specified_countries_but_publisher_holds_exclusive_rights_in_those_countries_or_territories,
					SalesRightsTypes.Not_for_sale_in_the_specified_countries_publisher_holds_non_exclusive_rights_in_those_countries_or_territories,
					SalesRightsTypes.Not_for_sale_in_the_specified_countries_because_publisher_does_not_hold_rights_in_those_countries_or_territories }));

	private static final Set<SalesRightsTypes> UNRESTRICTED_SALES_RIGHTS = new HashSet<>(
			Arrays.asList(new SalesRightsTypes[] {
					SalesRightsTypes.For_sale_with_exclusive_rights_in_the_specified_countries_or_territories,
					SalesRightsTypes.For_sale_with_non_exclusive_rights_in_the_specified_countries_or_territories,
					SalesRightsTypes.For_sale_with_exclusive_rights_in_the_specified_countries_or_territories_sales_restriction_applies,
					SalesRightsTypes.For_sale_with_non_exclusive_rights_in_the_specified_countries_or_territories_sales_restriction_applies }));
}