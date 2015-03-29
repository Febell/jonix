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

package com.tectonica.jonix.codelist;

import java.util.Map;
import java.util.HashMap;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

/**
 * Enum that corresponds to ONIX's CodeList96
 * <p>
 * Currency code – ISO 4217
 * 
 * @see http://www.editeur.org/14/code-lists/
 */
public enum CurrencyCodeIso4217s
{
	/**
	 * United Arab Emirates.
	 */
	UAE_Dirham("AED"), //

	/**
	 * DEPRECATED, replaced by AFN.
	 */
	Afghani("AFA"), //

	/**
	 * Afghanistan (prices normally quoted as integers).
	 */
	Afghani_("AFN"), //

	/**
	 * Albania (prices normally quoted as integers).
	 */
	Lek("ALL"), //

	/**
	 * Armenia (prices normally quoted as integers).
	 */
	Armenian_Dram("AMD"), //

	/**
	 * Curaçao, Sint Maarten.
	 */
	Netherlands_Antillian_Guilder("ANG"), //

	/**
	 * Angola.
	 */
	Angolan_Kwanza("AOA"), //

	/**
	 * Argentina.
	 */
	Argentine_Peso("ARS"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Austria_Schilling("ATS"), //

	/**
	 * Australia, Christmas Island, Cocos (Keeling) Islands, Heard Island and McDonald Islands, Kiribati, Nauru, Norfolk Island, Tuvalu.
	 */
	Australian_Dollar("AUD"), //

	/**
	 * Aruba.
	 */
	Aruban_Florin("AWG"), //

	/**
	 * Azerbaijan.
	 */
	Azerbaijanian_Manat("AZN"), //

	/**
	 * Bosnia and Herzegovina.
	 */
	Convertible_Marks("BAM"), //

	/**
	 * Barbados.
	 */
	Barbados_Dollar("BBD"), //

	/**
	 * Bangladesh.
	 */
	Taka("BDT"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Belgium_Franc("BEF"), //

	/**
	 * DEPRECATED, replaced by BGN.
	 */
	Lev("BGL"), //

	/**
	 * Bulgaria.
	 */
	Lev_("BGN"), //

	/**
	 * Bahrain (prices normally quoted with 3 decimal places).
	 */
	Bahraini_Dinar("BHD"), //

	/**
	 * Burundi (prices normally quoted as integers).
	 */
	Burundi_Franc("BIF"), //

	/**
	 * Bermuda.
	 */
	Bermuda_Dollar("BMD"), //

	/**
	 * Brunei Darussalam.
	 */
	Brunei_Dollar("BND"), //

	/**
	 * Bolivia.
	 */
	Boliviano("BOB"), //

	/**
	 * Brazil.
	 */
	Brazilian_Real("BRL"), //

	/**
	 * Bahamas.
	 */
	Bahamian_Dollar("BSD"), //

	/**
	 * Bhutan.
	 */
	Ngultrun("BTN"), //

	/**
	 * Botswana.
	 */
	Pula("BWP"), //

	/**
	 * Belarus (prices normally quoted as integers).
	 */
	Belarussian_Ruble("BYR"), //

	/**
	 * Belize.
	 */
	Belize_Dollar("BZD"), //

	/**
	 * Canada.
	 */
	Canadian_Dollar("CAD"), //

	/**
	 * Congo (Democratic Republic of the).
	 */
	Franc_Congolais("CDF"), //

	/**
	 * Switzerland, Liechtenstein.
	 */
	Swiss_Franc("CHF"), //

	/**
	 * Chile (prices normally quoted as integers).
	 */
	Chilean_Peso("CLP"), //

	/**
	 * China.
	 */
	Yuan_Renminbi("CNY"), //

	/**
	 * Colombia (prices normally quoted as integers).
	 */
	Colombian_Peso("COP"), //

	/**
	 * Costa Rica (prices normally quoted as integers).
	 */
	Costa_Rican_Colon("CRC"), //

	/**
	 * Deprecated, replaced by RSD.
	 */
	Serbian_Dinar("CSD"), //

	/**
	 * Cuba (alternative currency).
	 */
	Cuban_Convertible_Peso("CUC"), //

	/**
	 * Cuba.
	 */
	Cuban_Peso("CUP"), //

	/**
	 * Cabo Verde (prices normally quoted as integers).
	 */
	Cabo_Verde_Escudo("CVE"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Cyprus_Pound("CYP"), //

	/**
	 * Czech Republic.
	 */
	Czech_Koruna("CZK"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Germany_Mark("DEM"), //

	/**
	 * Djibouti (prices normally quoted as integers).
	 */
	Djibouti_Franc("DJF"), //

	/**
	 * Denmark, Faroe Islands, Greenland.
	 */
	Danish_Krone("DKK"), //

	/**
	 * Dominican Republic.
	 */
	Dominican_Peso("DOP"), //

	/**
	 * Algeria.
	 */
	Algerian_Dinar("DZD"), //

	/**
	 * Estonia – now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Kroon("EEK"), //

	/**
	 * Egypt.
	 */
	Egyptian_Pound("EGP"), //

	/**
	 * Eritrea.
	 */
	Nakfa("ERN"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro (prices normally quoted as
	 * integers).
	 */
	Spain_Peseta("ESP"), //

	/**
	 * Ethiopia.
	 */
	Ethiopian_Birr("ETB"), //

	/**
	 * Eurozone: Andorra, Austria, Belgium, Cyprus, Estonia, Finland, France, Fr Guiana, Fr S Territories, Germany, Greece, Guadeloupe, Holy
	 * See (Vatican City), Ireland, Italy, Latvia, Lithuania, Luxembourg, Martinique, Malta, Mayotte, Monaco, Montenegro, Netherlands,
	 * Portugal, Réunion, St Pierre and Miquelon, San Marino, Spain.
	 */
	Euro("EUR"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Finland_Markka("FIM"), //

	/**
	 * Fiji.
	 */
	Fiji_Dollar("FJD"), //

	/**
	 * Falkland Islands (Malvinas).
	 */
	Falkland_Islands_Pound("FKP"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	France_Franc("FRF"), //

	/**
	 * United Kingdom, Isle of Man, Channel Islands, South Georgia, South Sandwich Islands, British Indian Ocean Territory.
	 */
	Pound_Sterling("GBP"), //

	/**
	 * Georgia.
	 */
	Lari("GEL"), //

	/**
	 * Deprecated, replaced by GHS.
	 */
	Cedi("GHC"), //

	/**
	 * Ghana.
	 */
	Cedi_("GHS"), //

	/**
	 * Gibraltar.
	 */
	Gibraltar_Pound("GIP"), //

	/**
	 * Gambia.
	 */
	Dalasi("GMD"), //

	/**
	 * Guinea (prices normally quoted as integers).
	 */
	Guinea_Franc("GNF"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Greece_Drachma("GRD"), //

	/**
	 * Guatemala.
	 */
	Quetzal("GTQ"), //

	/**
	 * Now replaced by the CFA Franc BCEAO XOF use only for historical prices that pre-date use of the CFA Franc.
	 */
	Guinea_Bissau_Peso("GWP"), //

	/**
	 * Guyana (prices normally quoted as integers).
	 */
	Guyana_Dollar("GYD"), //

	/**
	 * Hong Kong, Macao.
	 */
	Hong_Kong_Dollar("HKD"), //

	/**
	 * Honduras.
	 */
	Lempira("HNL"), //

	/**
	 * Croatia.
	 */
	Croatian_Kuna("HRK"), //

	/**
	 * Haiti.
	 */
	Gourde("HTG"), //

	/**
	 * Hungary (prices normally quoted as integers).
	 */
	Forint("HUF"), //

	/**
	 * Indonesia (prices normally quoted as integers).
	 */
	Rupiah("IDR"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Ireland_Punt("IEP"), //

	/**
	 * Israel.
	 */
	Israeli_Sheqel("ILS"), //

	/**
	 * India (prices normally quoted as integers).
	 */
	Indian_Rupee("INR"), //

	/**
	 * Iraq (prices normally quoted as integers).
	 */
	Iraqi_Dinar("IQD"), //

	/**
	 * Iran (Islamic Republic of) (prices normally quoted as integers).
	 */
	Iranian_Rial("IRR"), //

	/**
	 * Iceland (prices normally quoted as integers).
	 */
	Iceland_Krona("ISK"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro (prices normally quoted as
	 * integers).
	 */
	Italy_Lira("ITL"), //

	/**
	 * Jamaica.
	 */
	Jamaican_Dollar("JMD"), //

	/**
	 * Jordan (prices normally quoted with 3 decimal places).
	 */
	Jordanian_Dinar("JOD"), //

	/**
	 * Japan (prices normally quoted as integers).
	 */
	Yen("JPY"), //

	/**
	 * Kenya.
	 */
	Kenyan_Shilling("KES"), //

	/**
	 * Kyrgyzstan.
	 */
	Som("KGS"), //

	/**
	 * Cambodia.
	 */
	Riel("KHR"), //

	/**
	 * Comoros (prices normally quoted as integers).
	 */
	Comoro_Franc("KMF"), //

	/**
	 * Korea (Democratic People’s Republic of) (prices normally quoted as integers).
	 */
	North_Korean_Won("KPW"), //

	/**
	 * Korea (Republic of) (prices normally quoted as integers).
	 */
	Won("KRW"), //

	/**
	 * Kuwait (prices normally quoted with 3 decimal places).
	 */
	Kuwaiti_Dinar("KWD"), //

	/**
	 * Cayman Islands.
	 */
	Cayman_Islands_Dollar("KYD"), //

	/**
	 * Kazakstan.
	 */
	Tenge("KZT"), //

	/**
	 * Lao People’s Democratic Republic (prices normally quoted as integers).
	 */
	Kip("LAK"), //

	/**
	 * Lebanon (prices normally quoted as integers).
	 */
	Lebanese_Pound("LBP"), //

	/**
	 * Sri Lanka.
	 */
	Sri_Lanka_Rupee("LKR"), //

	/**
	 * Liberia.
	 */
	Liberian_Dollar("LRD"), //

	/**
	 * Lesotho.
	 */
	Loti("LSL"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Lithuanian_Litus("LTL"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro (prices normally quoted as
	 * integers).
	 */
	Luxembourg_Franc("LUF"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Latvian_Lats("LVL"), //

	/**
	 * Libyan Arab Jamahiriya (prices normally quoted with 3 decimal places).
	 */
	Libyan_Dinar("LYD"), //

	/**
	 * Morocco, Western Sahara.
	 */
	Moroccan_Dirham("MAD"), //

	/**
	 * Moldova, Republic of.
	 */
	Moldovan_Leu("MDL"), //

	/**
	 * Madagascar (0 or 1 – 1 iraimbilanja = Ar0.2).
	 */
	Ariary("MGA"), //

	/**
	 * Now replaced by the Ariary (MGA) (prices normally quoted as integers).
	 */
	Malagasy_Franc("MGF"), //

	/**
	 * Macedonia (former Yugoslav Republic of).
	 */
	Denar("MKD"), //

	/**
	 * Myanmar (prices normally quoted as integers).
	 */
	Kyat("MMK"), //

	/**
	 * Mongolia (prices normally quoted as integers).
	 */
	Tugrik("MNT"), //

	/**
	 * Macau.
	 */
	Pataca("MOP"), //

	/**
	 * Mauritania (0 or 1 – 1 khoums = UM0.2).
	 */
	Ouguiya("MRO"), //

	/**
	 * Malta – now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Maltese_Lira("MTL"), //

	/**
	 * Mauritius (prices normally quoted as integers).
	 */
	Mauritius_Rupee("MUR"), //

	/**
	 * Maldives.
	 */
	Rufiyaa("MVR"), //

	/**
	 * Malawi.
	 */
	Kwacha("MWK"), //

	/**
	 * Mexico.
	 */
	Mexican_Peso("MXN"), //

	/**
	 * Malaysia.
	 */
	Malaysian_Ringgit("MYR"), //

	/**
	 * Mozambique.
	 */
	Metical("MZN"), //

	/**
	 * Namibia.
	 */
	Namibia_Dollar("NAD"), //

	/**
	 * Nigeria.
	 */
	Naira("NGN"), //

	/**
	 * Nicaragua.
	 */
	Cordoba_Oro("NIO"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Netherlands_Guilder("NLG"), //

	/**
	 * Norway, Bouvet Island, Svalbard and Jan Mayen.
	 */
	Norwegian_Krone("NOK"), //

	/**
	 * Nepal.
	 */
	Nepalese_Rupee("NPR"), //

	/**
	 * New Zealand, Cook Islands, Niue, Pitcairn, Tokelau.
	 */
	New_Zealand_Dollar("NZD"), //

	/**
	 * Oman (prices normally quoted with 3 decimal places).
	 */
	Rial_Omani("OMR"), //

	/**
	 * Panama.
	 */
	Balboa("PAB"), //

	/**
	 * Peru.
	 */
	Nuevo_Sol("PEN"), //

	/**
	 * Papua New Guinea.
	 */
	Kina("PGK"), //

	/**
	 * Philippines.
	 */
	Philippine_Peso("PHP"), //

	/**
	 * Pakistan (prices normally quoted as integers).
	 */
	Pakistan_Rupee("PKR"), //

	/**
	 * Poland.
	 */
	Zloty("PLN"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Portugal_Escudo("PTE"), //

	/**
	 * Paraguay (prices normally quoted as integers).
	 */
	Guarani("PYG"), //

	/**
	 * Qatar.
	 */
	Qatari_Rial("QAR"), //

	/**
	 * Deprecated, replaced by RON.
	 */
	Old_Leu("ROL"), //

	/**
	 * Romania.
	 */
	New_Leu("RON"), //

	/**
	 * Serbia (prices normally quoted as integers).
	 */
	Serbian_Dinar_("RSD"), //

	/**
	 * Russian Federation.
	 */
	Russian_Ruble("RUB"), //

	/**
	 * DEPRECATED, replaced by RUB.
	 */
	Russian_Ruble_("RUR"), //

	/**
	 * Rwanda (prices normally quoted as integers).
	 */
	Rwanda_Franc("RWF"), //

	/**
	 * Saudi Arabia.
	 */
	Saudi_Riyal("SAR"), //

	/**
	 * Solomon Islands.
	 */
	Solomon_Islands_Dollar("SBD"), //

	/**
	 * Seychelles.
	 */
	Seychelles_Rupee("SCR"), //

	/**
	 * Now replaced by the Sudanese Pound (SDG).
	 */
	Sudanese_Dinar("SDD"), //

	/**
	 * Sudan.
	 */
	Sudanese_Pound("SDG"), //

	/**
	 * Sweden.
	 */
	Swedish_Krona("SEK"), //

	/**
	 * Singapore.
	 */
	Singapore_Dollar("SGD"), //

	/**
	 * Saint Helena.
	 */
	Saint_Helena_Pound("SHP"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Tolar("SIT"), //

	/**
	 * Now replaced by the Euro (EUR): use only for historical prices that pre-date the introduction of the Euro.
	 */
	Slovak_Koruna("SKK"), //

	/**
	 * Sierra Leone (prices normally quoted as integers).
	 */
	Leone("SLL"), //

	/**
	 * Somalia (prices normally quoted as integers).
	 */
	Somali_Shilling("SOS"), //

	/**
	 * Suriname.
	 */
	Surinam_Dollar("SRD"), //

	/**
	 * DEPRECATED, replaced by SRD.
	 */
	Suriname_Guilder("SRG"), //

	/**
	 * São Tome and Principe (prices normally quoted as integers).
	 */
	Dobra("STD"), //

	/**
	 * El Salvador.
	 */
	El_Salvador_Colon("SVC"), //

	/**
	 * Syrian Arab Republic (prices normally quoted as integers).
	 */
	Syrian_Pound("SYP"), //

	/**
	 * Swaziland.
	 */
	Lilangeni("SZL"), //

	/**
	 * Thailand.
	 */
	Baht("THB"), //

	/**
	 * Tajikistan.
	 */
	Somoni("TJS"), //

	/**
	 * Deprecated, replaced by TMT (prices normally quoted as integers).
	 */
	Manat("TMM"), //

	/**
	 * Turkmenistan.
	 */
	Manat_("TMT"), //

	/**
	 * Tunisia (prices normally quoted with 3 decimal places).
	 */
	Tunisian_Dinar("TND"), //

	/**
	 * Tonga.
	 */
	Pa_anga("TOP"), //

	/**
	 * NO LONGER VALID, Timor-Leste now uses the US Dollar.
	 */
	Timor_Escudo("TPE"), //

	/**
	 * Deprecated, replaced by TRY (prices normally quoted as integers).
	 */
	Turkish_Lira_old("TRL"), //

	/**
	 * Turkey, from 1 January 2005.
	 */
	Turkish_Lira_new("TRY"), //

	/**
	 * Trinidad and Tobago.
	 */
	Trinidad_and_Tobago_Dollar("TTD"), //

	/**
	 * Taiwan (Province of China).
	 */
	New_Taiwan_Dollar("TWD"), //

	/**
	 * Tanzania (United Republic of) (prices normally quoted as integers).
	 */
	Tanzanian_Shilling("TZS"), //

	/**
	 * Ukraine.
	 */
	Hryvnia("UAH"), //

	/**
	 * Uganda (prices normally quoted as integers).
	 */
	Uganda_Shilling("UGX"), //

	/**
	 * United States, American Samoa, British Indian Ocean Territory, Ecuador, Guam, Marshall Is, Micronesia (Federated States of), Northern
	 * Mariana Is, Palau, Puerto Rico, Timor-Leste, Turks and Caicos Is, US Minor Outlying Is, Virgin Is (British), Virgin Is (US).
	 */
	US_Dollar("USD"), //

	/**
	 * Uruguay.
	 */
	Peso_Uruguayo("UYU"), //

	/**
	 * Uzbekistan (prices normally quoted as integers).
	 */
	Uzbekistan_Sum("UZS"), //

	/**
	 * Deprecated, replaced by VEF.
	 */
	Bolivar("VEB"), //

	/**
	 * Venezuela.
	 */
	Bolivar_fuerte("VEF"), //

	/**
	 * Viet Nam (prices normally quoted as integers).
	 */
	Dong("VND"), //

	/**
	 * Vanuatu (prices normally quoted as integers).
	 */
	Vatu("VUV"), //

	/**
	 * Samoa.
	 */
	Tala("WST"), //

	/**
	 * Cameroon, Central African Republic, Chad, Congo, Equatorial Guinea, Gabon (prices normally quoted as integers).
	 */
	CFA_Franc_BEAC("XAF"), //

	/**
	 * Anguilla, Antigua and Barbuda, Dominica, Grenada, Montserrat, Saint Kitts and Nevis, Saint Lucia, Saint Vincent and the Grenadines.
	 */
	East_Caribbean_Dollar("XCD"), //

	/**
	 * Benin, Burkina Faso, Côte D’Ivoire, Guinea-Bissau, Mali, Niger, Senegal, Togo (prices normally quoted as integers).
	 */
	CFA_Franc_BCEAO("XOF"), //

	/**
	 * French Polynesia, New Caledonia, Wallis and Futuna (prices normally quoted as integers).
	 */
	CFP_Franc("XPF"), //

	/**
	 * Yemen (prices normally quoted as integers).
	 */
	Yemeni_Rial("YER"), //

	/**
	 * DEPRECATED, replaced by CSD.
	 */
	Yugoslavian_Dinar("YUM"), //

	/**
	 * South Africa.
	 */
	Rand("ZAR"), //

	/**
	 * Deprecated, replaced with ZMW (prices normally quoted as integers).
	 */
	Kwacha_("ZMK"), //

	/**
	 * Zambia.
	 */
	Zambian_Kwacha("ZMW"), //

	/**
	 * Deprecated, replaced with ZWL (prices normally quoted as integers).
	 */
	Zimbabwe_Dollar("ZWD"), //

	/**
	 * Zimbabwe.
	 */
	Zimbabwe_Dollar_("ZWL");

	public final String value;

	private CurrencyCodeIso4217s(String value)
	{
		this.value = value;
	}

	private static Map<String, CurrencyCodeIso4217s> map;

	private static Map<String, CurrencyCodeIso4217s> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (CurrencyCodeIso4217s e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static CurrencyCodeIso4217s byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}