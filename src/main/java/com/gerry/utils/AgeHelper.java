package com.gerry.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AgeHelper {

    public static int getAge(Date now, Date dateOfBirth) {
        LocalDate currentDate = convertToLocalDateViaSqlDate(now);
        LocalDate birthDate = convertToLocalDateViaSqlDate(dateOfBirth);

        if ((birthDate != null) && (currentDate != null)) {
            //return Period.between(birthDate, currentDate).getYears();
            long years = ChronoUnit.YEARS.between(birthDate, currentDate);
            return (int)years;
        } else {
            return 0;
        }
    }

    private static LocalDate convertToLocalDateViaSqlDate(Date dateToConvert) {
        return new java.sql.Date(dateToConvert.getTime()).toLocalDate();
    }
}
