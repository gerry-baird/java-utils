package com.gerry.utils;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class AgeHelperTest {
    @Test
    void testGetAge50() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String sNow="28/06/2021";
        String sDob="15/06/1971";

        LocalDate dob = LocalDate.parse(sDob, formatter);
        LocalDate now = LocalDate.parse(sNow, formatter);

        int age = AgeHelper.getAge(now, dob);

        assertEquals(50, age);
    }
    @Test
    void testGetAge5() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String sNow="01/05/2021";
        String sDob="15/06/2015";

        LocalDate dob = LocalDate.parse(sDob, formatter);
        LocalDate now = LocalDate.parse(sNow, formatter);

        int age = AgeHelper.getAge(now, dob);

        assertEquals(5, age);
    }

    @Test
    void testGetAge16() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String sNow="04/10/2021";
        String sDob="26/09/2005";

        LocalDate dob = LocalDate.parse(sDob, formatter);
        LocalDate now = LocalDate.parse(sNow, formatter);

        int age = AgeHelper.getAge(now, dob);

        assertEquals(16, age);
    }
}