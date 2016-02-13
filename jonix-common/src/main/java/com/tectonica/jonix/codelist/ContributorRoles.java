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

import java.util.HashMap;
import java.util.Map;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 17</b>
 * <p>
 * Description: Contributor role code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum ContributorRoles
{
	/**
	 * Author of a textual work
	 */
	By_author("A01"), //

	/**
	 * With or as told to: &#8216;ghost&#8217; author of a literary work
	 */
	With("A02"), //

	/**
	 * Writer of screenplay or script (film or video)
	 */
	Screenplay_by("A03"), //

	/**
	 * Writer of libretto (opera): see also A31
	 */
	Libretto_by("A04"), //

	/**
	 * Author of lyrics (song): see also A31
	 */
	Lyrics_by("A05"), //

	/**
	 * Composer of music
	 */
	By_composer("A06"), //

	/**
	 * Visual artist when named as the primary creator of, eg, a book of reproductions of artworks
	 */
	By_artist("A07"), //

	/**
	 * Photographer when named as the primary creator of, eg, a book of photographs
	 */
	By_photographer("A08"), //

	Created_by("A09"), //

	From_an_idea_by("A10"), //

	Designed_by("A11"), //

	/**
	 * Artist when named as the creator of artwork which illustrates a text, or the originator (sometimes
	 * &#8216;penciller&#8217; for collaborative art) of the artwork of a graphic novel or comic book
	 */
	Illustrated_by("A12"), //

	/**
	 * Photographer when named as the creator of photographs which illustrate a text
	 */
	Photographs_by("A13"), //

	/**
	 * Author of text which accompanies art reproductions or photographs, or which is part of a graphic novel or comic
	 * book
	 */
	Text_by("A14"), //

	/**
	 * Author of preface
	 */
	Preface_by("A15"), //

	/**
	 * Author of prologue
	 */
	Prologue_by("A16"), //

	/**
	 * Author of summary
	 */
	Summary_by("A17"), //

	/**
	 * Author of supplement
	 */
	Supplement_by("A18"), //

	/**
	 * Author of afterword
	 */
	Afterword_by("A19"), //

	/**
	 * Author of notes or annotations: see also A29
	 */
	Notes_by("A20"), //

	/**
	 * Author of commentaries on the main text
	 */
	Commentaries_by("A21"), //

	/**
	 * Author of epilogue
	 */
	Epilogue_by("A22"), //

	/**
	 * Author of foreword
	 */
	Foreword_by("A23"), //

	/**
	 * Author of introduction: see also A29
	 */
	Introduction_by("A24"), //

	/**
	 * Author/compiler of footnotes
	 */
	Footnotes_by("A25"), //

	/**
	 * Author of memoir accompanying main text
	 */
	Memoir_by("A26"), //

	/**
	 * Person who carried out experiments reported in the text
	 */
	Experiments_by("A27"), //

	/**
	 * Author of introduction and notes: see also A20 and A24
	 */
	Introduction_and_notes_by("A29"), //

	/**
	 * Writer of computer programs ancillary to the text
	 */
	Software_written_by("A30"), //

	/**
	 * Author of the textual content of a musical drama: see also A04 and A05
	 */
	Book_and_lyrics_by("A31"), //

	/**
	 * Author of additional contributions to the text
	 */
	Contributions_by("A32"), //

	/**
	 * Author of appendix
	 */
	Appendix_by("A33"), //

	/**
	 * Compiler of index
	 */
	Index_by("A34"), //

	Drawings_by("A35"), //

	/**
	 * Use also for the cover artist of a graphic novel or comic book if named separately
	 */
	Cover_design_or_artwork_by("A36"), //

	/**
	 * Responsible for preliminary work on which the work is based
	 */
	Preliminary_work_by("A37"), //

	/**
	 * Author of the first edition (usually of a standard work) who is not an author of the current edition
	 */
	Original_author("A38"), //

	/**
	 * Maps drawn or otherwise contributed by
	 */
	Maps_by("A39"), //

	/**
	 * Use for secondary creators when separate persons are named as having respectively drawn and
	 * inked/colored/finished artwork, eg for a graphic novel or comic book. Use with A12 for &#8216;drawn by&#8217;.
	 * Use A40 for &apos;finished by&apos;, but prefer more specific codes A46 to A48 instead of A40 unless the more
	 * specific secondary roles are inappropriate, unclear or unavailable
	 */
	Inked_or_colored_by("A40"), //

	/**
	 * Designer of pop-ups in a pop-up book, who may be different from the illustrator
	 */
	Pop_ups_by("A41"), //

	/**
	 * Use where a standard work is being continued by somebody other than the original author
	 */
	Continued_by("A42"), //

	Interviewer("A43"), //

	Interviewee("A44"), //

	/**
	 * Writer of dialogue, captions in a comic book (following an outline by the primary writer) &lt;p&gt;NOTE:
	 * Introduced in Onix3
	 */
	Comic_script_by("A45"), //

	/**
	 * Renders final comic book line art based on work of the illustrator or penciller. Preferred to code A40
	 * &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Inker("A46"), //

	/**
	 * Provides comic book color art and effects. Preferred to code A40 &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Colorist("A47"), //

	/**
	 * Creates comic book text balloons and other text elements (where this is a distinct role from script writer and/or
	 * illustrator) &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Letterer("A48"), //

	/**
	 * Other type of primary creator not specified above
	 */
	Other_primary_creator("A99"), //

	Edited_by("B01"), //

	Revised_by("B02"), //

	Retold_by("B03"), //

	Abridged_by("B04"), //

	Adapted_by("B05"), //

	Translated_by("B06"), //

	As_told_by("B07"), //

	/**
	 * This code applies where a translator has provided a commentary on issues relating to the translation. If the
	 * translator has also provided a commentary on the work itself, codes B06 and A21 should be used
	 */
	Translated_with_commentary_by("B08"), //

	/**
	 * Name of a series editor when the product belongs to a series
	 */
	Series_edited_by("B09"), //

	Edited_and_translated_by("B10"), //

	Editor_in_chief("B11"), //

	Guest_editor("B12"), //

	Volume_editor("B13"), //

	Editorial_board_member("B14"), //

	Editorial_coordination_by("B15"), //

	Managing_editor("B16"), //

	/**
	 * Usually the founder editor of a serial publication: Begruendet von
	 */
	Founded_by("B17"), //

	Prepared_for_publication_by("B18"), //

	Associate_editor("B19"), //

	/**
	 * Use also for &#8216;advisory editor&#8217;, &#8216;series advisor&#8217;, &#8216;editorial consultant&#8217; etc
	 */
	Consultant_editor("B20"), //

	General_editor("B21"), //

	Dramatized_by("B22"), //

	/**
	 * In Europe, an expert editor who takes responsibility for the legal content of a collaborative law volume
	 */
	General_rapporteur("B23"), //

	/**
	 * An editor who is responsible for establishing the text used in an edition of a literary work, where this is
	 * recognised as a distinctive role (in Spain, &#8216;editor literario&#8217;)
	 */
	Literary_editor("B24"), //

	Arranged_by_music("B25"), //

	/**
	 * Responsible for the technical accuracy and language, may also be involved in coordinating and preparing technical
	 * material for publication
	 */
	Technical_editor("B26"), //

	Thesis_advisor_or_supervisor("B27"), //

	Thesis_examiner("B28"), //

	/**
	 * Responsible overall for the scientific content of the publication &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Scientific_editor("B29"), //

	/**
	 * Other type of adaptation or editing not specified above
	 */
	Other_adaptation_by("B99"), //

	/**
	 * For puzzles, directories, statistics, etc
	 */
	Compiled_by("C01"), //

	/**
	 * For textual material (eg for an anthology)
	 */
	Selected_by("C02"), //

	/**
	 * Eg for a collection of photographs etc &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Non_text_material_selected_by("C03"), //

	/**
	 * Eg for an exhibition &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Curated_by("C04"), //

	/**
	 * Other type of compilation not specified above
	 */
	Other_compilation_by("C99"), //

	Producer("D01"), //

	Director("D02"), //

	/**
	 * Conductor of a musical performance
	 */
	Conductor("D03"), //

	/**
	 * Other type of direction not specified above
	 */
	Other_direction_by("D99"), //

	Actor("E01"), //

	Dancer("E02"), //

	Narrator("E03"), //

	Commentator("E04"), //

	/**
	 * Singer etc
	 */
	Vocal_soloist("E05"), //

	Instrumental_soloist("E06"), //

	/**
	 * Reader of recorded text, as in an audiobook
	 */
	Read_by("E07"), //

	/**
	 * Name of a musical group in a performing role
	 */
	Performed_by_orchestra_band_ensemble("E08"), //

	/**
	 * Of a speech, lecture etc
	 */
	Speaker("E09"), //

	/**
	 * Introduces and links other contributors and material, eg within a documentary &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Presenter("E10"), //

	/**
	 * Other type of performer not specified above: use for a recorded performance which does not fit a category above,
	 * eg a performance by a stand-up comedian
	 */
	Performed_by("E99"), //

	/**
	 * Cinematographer, etc
	 */
	Filmed_photographed_by("F01"), //

	Editor_film_or_video("F02"), //

	/**
	 * Other type of recording not specified above
	 */
	Other_recording_by("F99"), //

	/**
	 * May be associated with any contributor role, and placement should therefore be controlled by contributor sequence
	 * numbering
	 */
	Assisted_by("Z01"), //

	/**
	 * null &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Honored_dedicated_to("Z02"), //

	/**
	 * For use ONLY with &#8216;et al&#8217; or &#8216;Various&#8217; within &lt;UnnamedPersons&gt;, where the roles of
	 * the multiple contributors vary
	 */
	_Various_roles("Z98"), //

	/**
	 * Other creative responsibility not falling within A to F above
	 */
	Other("Z99");

	public final String value;

	private ContributorRoles(String value)
	{
		this.value = value;
	}

	private static Map<String, ContributorRoles> map;

	private static Map<String, ContributorRoles> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (ContributorRoles e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static ContributorRoles byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
