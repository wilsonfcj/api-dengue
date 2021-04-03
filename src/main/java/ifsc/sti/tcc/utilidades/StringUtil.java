/*
 * Created on 24/09/2004 16:52:52
 */
package ifsc.sti.tcc.utilidades;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * 
 * @version 1.0
 */
public class StringUtil {

	public static final String NUMERIC_CHARS = "0123456789";
	public static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static String replace(String source, String pattern, String replace) {
		int s = 0;
		int e = 0;
		int pl = pattern.length();
		StringBuilder result = new StringBuilder();
		while ((e = source.indexOf(pattern, s)) >= 0) {
			result.append(source.substring(s, e));
			result.append(replace);
			s = e + pl;
		}
		result.append(source.substring(s));
		return result.toString();
	}

	public static String overlay(String source, String overlay, int start,
			int end) {
		if (source == null)
			return null;
		if (overlay == null)
			overlay = "";
		int length = source.length();
		if (start < 0)
			start = 0;
		if (start > length)
			start = length;
		if (end < 0)
			end = 0;
		if (end > length)
			end = length;
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		return new StringBuilder(length + start - end + overlay.length() + 1)
				.append(source.substring(0, start)).append(overlay)
				.append(source.substring(end)).toString();
	}

	public static String removeChars(String source, String charsToRemove) {
		StringBuilder sb = new StringBuilder(source.length());
		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			if (charsToRemove.indexOf(c) == -1)
				sb.append(c);
		}
		return sb.toString();
	}

	public static String removeNonNumericChars(String source) {
		return preserveChars(source, NUMERIC_CHARS);
	}

	public static String preserveChars(String source, String charsToPreserve) {
		StringBuilder sb = new StringBuilder(source.length());
		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			if (charsToPreserve.indexOf(c) != -1)
				sb.append(c);
		}
		return sb.toString();
	}

	public static boolean containOnyTheseChars(String source, String chars) {
		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			if (chars.indexOf(c) == -1)
				return false;
		}
		return true;
	}

	public static boolean isNumeric(String source) {
		return isNumeric(source, false);
	}

	public static boolean isNumeric(String source, boolean signIsValid) {
		if (isEmpty(source))
			return false;
		if (signIsValid && source.charAt(0) == '-')
			return containOnyTheseChars(source.substring(1), NUMERIC_CHARS);
		else
			return containOnyTheseChars(source, NUMERIC_CHARS);
	}

	public static String fill(String source, int quantity) {
		StringBuilder sb = new StringBuilder(quantity);
		for (int i = 1; i <= quantity; i++) {
			sb.append(source);
		}
		return sb.toString();
	}

	public static String center(String source, String str, int length) {
		if (source.length() >= length)
			return source.substring(0, length);
		int l = (length - source.length()) / 2;
		int r = (length - source.length() - l);
		String left = fill(str, l).substring(0, l);
		String right = fill(str, r).substring(0, r);
		return new StringBuilder(length).append(left).append(source)
				.append(right).toString();
	}

	public static String insertLeftString(String source, String leftString,
			int length) {
		String str = fill(leftString, length) + source;
		return str.substring(str.length() - length, str.length());
	}

	public static String insertRightString(String source, String rightString,
			int length) {
		return (source + fill(rightString, length)).substring(0, length);
	}

	public static String justify(String source, String str, int length,
			int leftCenterRight) {
		if (leftCenterRight == -3)
			return insertLeftString(source, str, length);
		else if (leftCenterRight == -2)
			return center(source, str, length);
		else
			return insertRightString(source, str, length);
	}

	public static String justify(String source, String str, int length,
			char leftCenterRight) {
		if (leftCenterRight == 'r')
			return insertLeftString(source, str, length);
		else if (leftCenterRight == 'c')
			return center(source, str, length);
		else
			return insertRightString(source, str, length);
	}

	public static String substringBetween(String str, String open, String close) {
		return substringBetween(str, open, close, 0);
	}

	public static String substringBetween(String str, String open,
			String close, int fromIndex) {
		if (str == null || open == null || close == null) {
			return null;
		}
		int start = str.indexOf(open, fromIndex);
		if (start != -1) {
			int end = str.indexOf(close, start + open.length());
			if (end != -1) {
				return str.substring(start + open.length(), end);
			}
		}
		return null;
	}

	public static String substringFlex(String source, int beginIndex,
			int endIndex) {
		if (source == null)
			return "";
		int length = source.length();
		if (beginIndex < 0 || beginIndex >= length)
			return "";
		if (endIndex > length)
			endIndex = length;
		if (endIndex < beginIndex)
			return "";
		return source.substring(beginIndex, endIndex);
	}

	//@SuppressLint("DefaultLocale")
	public static String toFirstLetterUpperCase(String source) {
		int l = source.length();
		if (l > 0) {
			return source.substring(0, 1).toUpperCase()
					+ (l > 1 ? source.substring(1) : "");
		} else {
			return source;
		}
	}

	public static String toFirstLetterUpperCase(String source, String regex) {
		if (regex == null) {
			return toFirstLetterUpperCase(source);
		} else {
			StringBuilder sb = new StringBuilder();
			String words[] = source.split(regex);
			for (int i = 0; i < words.length; i++) {
				if (i > 0) {
					sb.append(regex);
				}
				sb.append(toFirstLetterUpperCase(words[i]));
			}
			return sb.toString();
		}
	}

	//@SuppressLint("DefaultLocale")
	public static String toFirstLetterLowerCase(String source) {
		int l = source.length();
		if (l > 0) {
			return source.substring(0, 1).toLowerCase()
					+ (l > 1 ? source.substring(1) : "");
		} else {
			return source;
		}
	}

	public static String toFirstLetterLowerCase(String source, String regex) {
		if (regex == null) {
			return toFirstLetterLowerCase(source);
		} else {
			StringBuilder sb = new StringBuilder();
			String words[] = source.split(regex);
			for (int i = 0; i < words.length; i++) {
				if (i > 0) {
					sb.append(regex);
				}
				sb.append(toFirstLetterLowerCase(words[i]));
			}
			return sb.toString();
		}
	}

	public static boolean isNull(String str) {
		return (str == null);
	}

	public static boolean isEmpty(String str) {
		return !(str != null && str.length() > 0);
	}

	public static boolean isNotEmpty(String str) {
		return (str != null && str.length() > 0);
	}

	public static String removePrefixFromListValues(String listValues,
			char separator) {
		String values[] = listValues.split(",");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			if (i > 0)
				sb.append(", ");
			int pos = values[i].indexOf(separator);
			if (pos != -1)
				sb.append(values[i].substring(pos + 1));
		}
		return sb.toString();
	}

	public static int countChar(String source, char charToCount) {
		int count = 0;
		int length = source.length();
		for (int i = 0; i < length; i++) {
			if (source.charAt(i) == charToCount)
				count++;
		}
		return count;
	}

	public static char lastChar(String source) {
		return (source.charAt(source.length() - 1));
	}

	public static final int multiplyDigits(String source, int[] multipliers) {
		int sum = 0;
		for (int i = 0; i < source.length(); i++) {
			sum += Integer.parseInt("" + source.charAt(i)) * multipliers[i];
		}
		return sum;
	}

	public static String concat(String separator, String... source) {
		StringBuilder sb = new StringBuilder();
		for (String str : source) {
			if (!StringUtil.isEmpty(str)) {
				if (sb.length() > 0)
					sb.append(separator);
				sb.append(str);
			}
		}
		return sb.toString();
	}

	public static String textAsSingleLine(String text) {
		return replace(text, "\n", " ");
	}

	public static String textAsSingleLine(String text, String replace) {
		return replace(text, "\n", replace);
	}

	public static boolean isFemale(char letter) {
		switch (letter) {
		case 'a':
			return true;
		case 'e':
			return true;
		}
		return false;
	}

	public static String convertIsoToUTF8(String isoString) {
		String utf8String = null;
		if (null != isoString && !isoString.equals("")) {
			try {
				byte[] stringBytesISO = isoString.getBytes("ISO-8859-1");
				utf8String = new String(stringBytesISO, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// Mostra exceção mas devolve a mesma String
				System.out.println("UnsupportedEncodingException: "
						+ e.getMessage());
				utf8String = convertASCToUTF8(isoString);
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());
				utf8String = convertASCToUTF8(isoString);
			}
		} else {
			utf8String = isoString;
		}

		utf8String = replaceMaiusculas(utf8String);

		return utf8String;
	}

	public static String convertASCToUTF8(String ascString) {
		String utf8String = null;
		if (null != ascString && !ascString.equals("")) {
			try {
				byte[] stringBytesISO = ascString.getBytes("ANSI");
				utf8String = new String(stringBytesISO, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// Mostra exceção mas devolve a mesma String
				System.out.println("UnsupportedEncodingException: "
						+ e.getMessage());
				utf8String = ascString;
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());
				utf8String = ascString;
			}
		} else {
			utf8String = ascString;
		}
		return utf8String;
	}
	
	public static String convertToUTF8(String string) {
		String utf8String = null;
		
		if (null != string && !string.equals("")) {
			try {
				byte[] stringBytesISO = string.getBytes();
				utf8String = new String(stringBytesISO, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				System.out.println("UnsupportedEncodingException: " + e.getMessage());
				utf8String = string;
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());
				utf8String = string;
			}
		} else {
			utf8String = string;
		}
		
		return utf8String;
	}

	private static String replaceMaiusculas(String utf8String) {

		utf8String = utf8String.replace(" ?E", "ÕE");
		utf8String = utf8String.replace("ARUJ ?", "ARUJÁ");
		utf8String = utf8String.replace(" ?A", "ÇA");
		utf8String = utf8String.replace("S ?O", "SÃO");
		utf8String = utf8String.replace("TAUBAT ?", "TAUBATÉ");
		utf8String = utf8String.replace("VE ?CULOS", "VEÍCULOS");
		utf8String = utf8String.replace("JORD ?O", "JORDÃO");
		utf8String = utf8String.replace("DO  ?", "DO Ó");
		utf8String = utf8String.replace("do  ?", "do Ó");
		utf8String = utf8String.replace("DEP ?SITO", "DEPÓSITO");
		utf8String = utf8String.replace("A ? ?O", "AÇÃO");
		utf8String = utf8String.replace("A ? ?E", "AÇÕE");
		utf8String = utf8String.replace("JACARE ?", "JACAREÍ");
		utf8String = utf8String.replace(" ?O", "ÃO");
		utf8String = utf8String.replace("JOS ?", "JOSÉ");

		utf8String = utf8String.replace("S ?", "SÉ");

		return utf8String;
	}

	public static String insertIntoPosition(String source, String toInsert, int position) {
		String sub1 = source.substring(0, position);
		String sub2 = source.substring(position);
		return sub1 + toInsert + sub2;
	}
	
	public static String replaceSpecial(String string) {
		if (StringUtil.isEmpty(string))
			return "";
		
		string = string.replaceAll("[ÂÀÁÄÃ]", "A");
		string = string.replaceAll("[âãàáä]", "a");
		string = string.replaceAll("[ÊÈÉË]", "E");
		string = string.replaceAll("[êèéë]", "e");
		string = string.replaceAll("[ÎÍÌÏ]", "I");
		string = string.replaceAll("[îíìï]", "i");
		string = string.replaceAll("[ÔÕÒÓÖ]", "O");
		string = string.replaceAll("[ôõòóö]", "o");
		string = string.replaceAll("[ÛÙÚÜ]", "U");
		string = string.replaceAll("[ûúùü]", "u");
		string = string.replaceAll("Ç", "C");
		string = string.replaceAll("ç", "c");
		string = string.replaceAll("[ýÿ]", "y");
		string = string.replaceAll("Ý", "Y");
		string = string.replaceAll("ñ", "n");
		string = string.replaceAll("Ñ", "N");
		string = string.replaceAll("['<>\\|/]", "");
		return string;
	}

    public static String shuffle(String toShuffle, int key)
    {
        int size = toShuffle.length();
        char[] chars = toShuffle.toCharArray();
        int[] exchanges = getShuffleExchanges(size, key);
        for (int i = size - 1; i > 0; i--)
        {
            int n = exchanges[size - 1 - i];
            char tmp = chars[i];
            chars[i] = chars[n];
            chars[n] = tmp;
        }
        return new String(chars);
    }

    private static int[] getShuffleExchanges(int size, long key)
    {
        int[] exchanges = new int[size - 1];
        Random rand = new Random(key);
        for (int i = size - 1; i > 0; i--)
        {
            int n = rand.nextInt(i + 1);
            exchanges[size - 1 - i] = n;
        }
        return exchanges;
    }
}
