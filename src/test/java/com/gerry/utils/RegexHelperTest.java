package com.gerry.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexHelperTest {

    @Test
    void find_1() {

        String pattern = "slim";
        String src = "slime";

        boolean result = RegexHelper.patternFound(src,pattern);

        assertTrue(result);
    }

    @Test
    void dont_find_1() {

        String pattern = "jug";
        String src = "slime";

        boolean result = RegexHelper.patternNotFound(src,pattern);

        assertTrue(result);
    }
}