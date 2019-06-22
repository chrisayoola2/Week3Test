package com.example.week3test;

import java.util.regex.Pattern;

public class Problem1 {

    public static void main(String[] args) {

        String brackets = "({)}";

        // System.out.println(checkBrackets);
        System.out.println(brackets);
        System.out.println(checkBrackets(brackets));
        //System.out.println(checkString(checkBrackets));
    }

    public static boolean checkBrackets(String aString) {
        String givenString = aString;
        if(aString.isEmpty()){
            return true;
        }
        //boolean b = false;
//
        if (givenString.indexOf('}') == 0) {
            return false;
        }
        if (givenString.indexOf(')') == 0) {
            return false;
        }
        if (givenString.indexOf(']') == 0) {
            return false;
        }

        if ((givenString.indexOf('{') < givenString.indexOf('}')) && (givenString.contains("{")) && (givenString.contains("}"))) {
            givenString = givenString.replaceFirst(Pattern.quote("{"), "");
            givenString = givenString.replaceFirst("}", "");
            System.out.println(givenString);
            return checkBrackets(givenString);
        }
        if ((givenString.indexOf('(') < givenString.indexOf(')')) && (givenString.contains("(")) && (givenString.contains(")"))) {
            givenString = givenString.replaceFirst(Pattern.quote("("), "");
            givenString = givenString.replaceFirst(Pattern.quote(")"), "");
            System.out.println(givenString);
            return checkBrackets(givenString);
        }
        if ((givenString.indexOf('[') < givenString.indexOf(']')) && (givenString.contains("[")) && (givenString.contains("]"))) {
            //b = true;
            givenString = givenString.replaceFirst(Pattern.quote("["), "");
            givenString = givenString.replaceFirst(Pattern.quote("]"), "");
            System.out.println(givenString);
           // System.out.println("bbb");//empty
            return checkBrackets(givenString);
        }
        if (givenString.isEmpty()){
            aString = givenString;
            return true;
        } else
            return false;
    }
}


