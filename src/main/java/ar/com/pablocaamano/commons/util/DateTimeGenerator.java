package ar.com.pablocaamano.commons.util;

import ar.com.pablocaamano.commons.exception.InternalErrorException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Class to generate now time values
 * @author Pablo Caamaño
 * @since 15/10/2020
 */
public class DateTimeGenerator {
    public static DateTimeGenerator instance = null;

    private final String dateFormat;
    private final String dateTimeFormat;

    private DateTimeGenerator() {
        this.dateFormat = "yyyy-MM-dd";
        this.dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
    }

    public static DateTimeGenerator init() {
        if(instance == null) {
            instance = new DateTimeGenerator();
        }
        return instance;
    }

    /**
     * Generate a LocalDate object with format 'yyyy-MM-dd' and customs values on
     * year, month and day. If any value is null this is set with actual value.
     *
     * @param year Integer (allows null)
     * @param month Integer (value <= 12, allows null)
     * @param day Integer (allows null)
     * @return LocalDate
     */
    public LocalDate generateCustomDate(Integer year, Integer month, Integer day) {
        try {
            return this.generate(year, month, day);
        } catch (Exception exception) {
            throw new InternalErrorException("Error generating custom date", exception);
        }
    }

    /**
     * Generate a String Date with format 'yyyy-MM-dd' and customs values on
     * year, month and day. If any value is null this is set with actual value.
     *
     * @param year Integer (allows null)
     * @param month Integer (value <= 12, allows null)
     * @param day Integer (allows null)
     * @return String
     */
    public String generateCustomDateStr(Integer year, Integer month, Integer day) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            return sdf.format(this.generate(year, month, day));
        } catch (Exception exception) {
            throw new InternalErrorException("Error generating custom String date", exception);
        }
    }

    private LocalDate generate(Integer year, Integer month, Integer day) {
        LocalDate now = LocalDate.now();
        return LocalDate.of(year == null ? now.getYear() : year,
                month == null || month > 12 ? now.getMonth().getValue() : month,
                day == null ? now.getDayOfMonth() : day);
    }

    /**
     * Generate a LocalDateTime object with format 'yyyy-MM-dd HH:mm:ss' and customs values on
     * year, month and day. If any value is null this is set with actual value.
     *
     * @param year Integer (allows null)
     * @param month Integer (value <= 12, allows null)
     * @param day Integer (allows null)
     * @param hour Integer (value <= 23, allows null)
     * @param minute Integer (value <= 59, allows null)
     * @param second Integer (value <= 59, allows null)
     * @return LocalDateTime
     */
    public LocalDateTime generateCustomDateTime(Integer year, Integer month, Integer day,
                                                Integer hour, Integer minute, Integer second) {
        try {
            return this.generate(year, month, day, hour, minute, second);
        } catch (Exception exception) {
            throw new InternalErrorException("Error generating custom dateTime", exception);
        }
    }

    /**
     * Generate a String DateTime with format 'yyyy-MM-dd HH:mm:ss' and customs values on
     * year, month and day. If any value is null this is set with actual value.
     *
     * @param year Integer (allows null)
     * @param month Integer (value <= 12, allows null)
     * @param day Integer (allows null)
     * @param hour Integer (value <= 23, allows null)
     * @param minute Integer (value <= 59, allows null)
     * @param second Integer (value <= 59, allows null)
     * @return LocalDateTime
     */
    public String generateCustomDateTimeStr(Integer year, Integer month, Integer day,
                                            Integer hour, Integer minute, Integer second) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(dateTimeFormat);
            return sdf.format(this.generate(year, month, day, hour, minute, second));
        } catch (Exception exception) {
            throw new InternalErrorException("Error generating custom String dateTime", exception);
        }
    }

    private LocalDateTime generate(Integer y, Integer mon, Integer day, Integer h, Integer min, Integer s) {
        LocalDateTime now = LocalDateTime.now();
        return LocalDateTime.of(y == null ? now.getYear() : y,
                mon == null || mon > 12 ? now.getMonth().getValue() : mon,
                day == null ? now.getDayOfMonth() : day,
                h == null || h > 23 ? now.getHour() : h,
                min == null || min > 59 ? now.getMinute() : min,
                s == null || s > 59 ? now.getSecond() : s);
    }
}
