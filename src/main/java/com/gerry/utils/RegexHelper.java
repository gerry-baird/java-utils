package com.gerry.utils;

import com.ibm.rules.engine.annotations.PureFunction;

import java.util.ArrayList;
import java.util.List;
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
    public static boolean patternMatches(String str, String ptn) {


        Pattern myPattern = Pattern.compile(ptn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = myPattern.matcher(str);

        return matcher.matches();
    }

    @PureFunction
    public static int matchesCount(String str, String ptn) {

        Pattern myPattern = Pattern.compile(ptn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = myPattern.matcher(str);

        int count = 0;
        while(matcher.find()) {
            count++;
        }
        return count;
    }

    @PureFunction
    public static List<String> getMatches(String str, String ptn) {

        Pattern myPattern = Pattern.compile(ptn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = myPattern.matcher(str);

        ArrayList<String> matches = new ArrayList<String>();

        int count = 0;
        while(matcher.find()) {
            matches.add(matcher.group());
        }
        return matches;
    }


}
