package com.gerry.utils;

import com.ibm.rules.engine.annotations.PureFunction;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AgeHelper {

    @PureFunction
    public static int getAge(LocalDate now, LocalDate dateOfBirth) {

        if ((dateOfBirth != null) && (now != null)) {
            long years = ChronoUnit.YEARS.between(dateOfBirth, now);
            return (int)years;
        } else {
            return 0;
        }
    }
}
