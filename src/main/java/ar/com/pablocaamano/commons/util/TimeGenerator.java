package ar.com.pablocaamano.commons.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class to generate now time values
 * @author Pablo Caamaño
 * @since 15/10/2020
 */
public class TimeGenerator {

    /**
     * Get now time in String type with format: YYYY-MM-DD HH:MM:SS
     * @return String
     */
    public static String generateStringDateTime() {
        return generateStringDateTimeWithFormat("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * Get now time in String type with custom format
     * @param format String param, example: "yyyy-MM-dd HH:mm:ss"
     * @return String
     */
    public static String generateStringDateTimeWithFormat(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    /**
     * Get now time in Date
     * @return Date
     */
    public static Date generateDateTimeWithFormat() {
        return new Date(System.currentTimeMillis());
    }
}
