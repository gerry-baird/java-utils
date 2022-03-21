package com.gerry.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegexHelperTest {

    @Test
    void findSimplePattern() {

        String pattern = "slim";
        String src = "slime";

        boolean result = RegexHelper.patternFound(src,pattern);

        assertTrue(result);
    }

    @Test
    void simpleMatch() {

        String pattern = ".*is.*"; // string contains "is"
        String src = "regex is fun";

        boolean result = RegexHelper.patternMatches(src,pattern);

        assertTrue(result);
    }

    @Test
    void simpleDigitMatch(){
        String pattern = "\\d{4}-\\d{4}-\\d{2}";
        String src = "1111-2222-22";

        boolean result = RegexHelper.patternMatches(src,pattern);

        assertTrue(result);
    }

    @Test
    void catMatchWordBoundary() {

        String pattern = "\\b[Cc][Aa][Tt]\\b";
        String src = "cat";

        boolean result = RegexHelper.patternMatches(src,pattern);

        assertTrue(result);
    }

    @Test
    void simpleCount() {

        String pattern = "is"; // string contains "is"
        String src = "if it is raining then regex is fun";

        int result = RegexHelper.matchesCount(src,pattern);

        assertEquals(2,result);
    }

    @Test
    void ipMatch(){
        String pattern = "(\\d{1,3}\\.){3}\\d{1,3}";
        String src = "123.123.123.122";

        boolean result = RegexHelper.patternMatches(src,pattern);

        assertTrue(result);
    }

    @Test
    void getMatches(){
        String pattern = "foo";
        String src = "do foo ffo foo foo ddo";

        List<String> result = RegexHelper.getMatches(src,pattern);

        assertEquals(result.size(), 3);
    }

}