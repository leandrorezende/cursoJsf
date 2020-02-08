package br.com.devdojo.maratonajsf.taglibfunction;

import org.apache.commons.lang3.text.WordUtils;

public class TagLibFunctions {
	public static String capitalize(String str) {
		return WordUtils.capitalizeFully(str);
	}
}
