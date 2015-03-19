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

package com.tectonica.jonix.onix3;

import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.DU;
import com.tectonica.jonix.codelist.ProductFormFeatureTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class ProductFormFeature
{
	public static final String refname = "ProductFormFeature";
	public static final String shortname = "productformfeature";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public ProductFormFeatureType productFormFeatureType; // Required
	public ProductFormFeatureValue productFormFeatureValue; // Optional
	public List<ProductFormFeatureDescription> productFormFeatureDescriptions; // ZeroOrMore

	public static ProductFormFeature fromDoc(org.w3c.dom.Element element)
	{
		final ProductFormFeature x = new ProductFormFeature();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = RecordSourceTypes.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(ProductFormFeatureType.refname) || name.equals(ProductFormFeatureType.shortname))
					x.productFormFeatureType = ProductFormFeatureType.fromDoc(element);
				else if (name.equals(ProductFormFeatureValue.refname) || name.equals(ProductFormFeatureValue.shortname))
					x.productFormFeatureValue = ProductFormFeatureValue.fromDoc(element);
				else if (name.equals(ProductFormFeatureDescription.refname) || name.equals(ProductFormFeatureDescription.shortname))
					x.productFormFeatureDescriptions = DU.addToList(x.productFormFeatureDescriptions,
							ProductFormFeatureDescription.fromDoc(element));
			}
		});

		return x;
	}

	public ProductFormFeatureTypes getProductFormFeatureTypeValue()
	{
		return (productFormFeatureType == null) ? null : productFormFeatureType.value;
	}

	public String getProductFormFeatureValueValue()
	{
		return (productFormFeatureValue == null) ? null : productFormFeatureValue.value;
	}

	public List<String> getProductFormFeatureDescriptionValues()
	{
		if (productFormFeatureDescriptions != null)
		{
			List<String> list = new ArrayList<>();
			for (ProductFormFeatureDescription i : productFormFeatureDescriptions)
				list.add(i.value);
			return list;
		}
		return null;
	}
}