package com.accenture.test.matias.util;

/**
 * Util class to do recurring validations.
 * 
 * @author Matias Gomez Arancibia.
 *
 */
public class AccentureUtils {

    /**
     * Method that indicates if a string is null or empty.
     * 
     * @param text Text to analyze.
     * @return true if the text is null or empty, false any other case.
     */
    public static boolean isNullOrEmpty(String text) {

        return text == null || text.isEmpty();
    }

}
