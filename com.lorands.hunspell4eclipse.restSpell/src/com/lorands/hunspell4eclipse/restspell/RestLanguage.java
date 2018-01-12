/*******************************************************************************
 * Copyright (c) 2011 isandlaTech, Thomas Calmant
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thomas Calmant (isandlaTech) - initial API and implementation
 *******************************************************************************/

package com.lorands.hunspell4eclipse.restspell;

/**
 * Definition of the main constants describing the ReST language for scanners.
 * 
 * @author Thomas Calmant
 * @author Olivier Gattaz
 */
public interface RestLanguage {

	/** Bold marker */
	String BOLD_MARKER = "**";

	/** ReST and Sphinx directives */
	String[] DIRECTIVES = {
			// Admonitions:
			"attention", "caution", "danger", "error", "hint", "important", "note", "tip", "warning", "admonition",

			// Images:
			"image", "figure",

			// Substitutions
			"replace",

			// Additional body elements:
			"contents", "container", "rubric", "topic", "sidebar", "parsed-literal", "epigraph", "highlights",
			"pull-quote", "compound",

			// Special tables:
			"table", "csv-table", "list-table",

			// Special directives:
			"raw", "include", "class",

			// HTML specifics:
			"meta", "title",

			// Influencing markup:
			"default-role", "role" };

	/** Emphasis marker */
	String EMPHASIS_MARKER = "*";

	/** Escape character */
	char ESCAPE_CHARACTER = '\\';

	String FIELD_MARKER = ":";

	/** Characters composing a grid border line */
	char[] GRID_TABLE_BORDERS_CHARACTERS = { '+', '-', '=' };

	/** Beginning and end of a grid border line */
	char GRID_TABLE_MARKER = '+';

	/** Beginning (and end) of a row line */
	char GRID_TABLE_ROW_MARKER = '|';

	/** In-line Literal marker */
	String INLINE_LITERAL_MARKER = "``";

	/** Beginning of a link */
	String LINK_BEGIN = "`";

	/** End of a link */
	String LINK_END = "`_";

	/** Beginning of a footnote link */
	String LINK_FOOTNOTE_BEGIN = "[#";

	/** Beginning of a footnote link definition in a literal block */
	String LINK_FOOTNOTE_DEF_BEGIN = "[#";

	/** End of a footnote link definition in a literal block */
	String LINK_FOOTNOTE_DEF_END = "]";

	/** End of a footnote link */
	String LINK_FOOTNOTE_END = "]_";

	/** Beginning of a reference link */
	String LINK_REFERENCE_BEGIN = "[";

	/** Beginning of a reference link definition in a literal block */
	String LINK_REFERENCE_DEF_BEGIN = "[";

	/** End of a reference link definition in a literal block */
	String LINK_REFERENCE_DEF_END = "]";

	/** End of a reference link */
	String LINK_REFERENCE_END = "]_";

	/** List markers (with the trailing space) */
	String[] LIST_MARKERS = { "* ", "+ ", "- ", "\u2022 " /* bullet */, "\u2023 " /* triangular bullet */, "⁃ ", "#. ",
			"#) ", "(#) " };

	/** Line prefixes of literal blocks */
	String[] LITERAL_BLOCK_PREFIXES = { ".. ", "   ", "\t" };

	/** Python standard for section markers */
	String PYTHON_SECTION_MARKERS = "#*=-^\"";

	/** In-line role content marker */
	String ROLE_CONTENT_MARKER = "`";

	/** In-line role marker */
	String ROLE_MARKER = ":";

	/** Possible decorations for a ReST section */
	char[] SECTION_DECORATIONS = { '#', '*', '=', '-', '^', '"', '!', '$', '%', '&', '\'', '(', ')', '+', ',', '.', '/',
			':', ';', '<', '>', '?', '@', '[', '\\', ']', '_', '`', '{', '|', '}', '~' };

	/** ReST simple table line marker */
	char SIMPLE_TABLE_MARKER = '=';

	/** Line prefixes of source code blocks */
	String[] SOURCE_BLOCK_PREFIXES = { "   ", "\t" };

	/** Sphinx specific directives */
	String[] SPHINX_DIRECTIVES = { "toctree", "versionadded", "versionchanged", "deprecated", "seealso", "centered",
			"hlist", "index", "glossary", "productionlist", "literalinclude", "sectionauthor", "codeauthor", "only",
			"tabularcolumns", "code-block", "highlight" };

	/** Sphinx extensions' directives */
	String[] SPHINX_EXTENSIONS_DIRECTIVES = { "todo", "todolist" };

	/** ReST global substitution marker */
	String SUBSTITUTION_MARKER = "|";
}
