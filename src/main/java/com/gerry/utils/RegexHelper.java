package com.gerry.utils;

import com.ibm.rules.engine.annotations.PureFunction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHelper {

    @PureFunction
    public static boolean patternFound(String str, String ptn) {

        Pattern myPattern = Pattern.compile(ptn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = myPattern.matcher(str);

        //If it matches then it does match
        return matcher.find();
    }

    @PureFunction
    public static boolean patternNotFound(String str, String ptn) {

        Pattern myPattern = Pattern.compile(ptn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = myPattern.matcher(str);

        return !matcher.find();
    }
}
