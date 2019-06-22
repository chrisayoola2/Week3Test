package com.example.week3test;

public class Problem2 {
    static int count = 0;

    public static void main(String[] args) {


        String checkString= "ccatcatcow";
        String checkSubString = "cat";
        int n = 3;
        strCopies(checkString, checkSubString, n);
    }

    public static void strCopies(String checkString, String subString, int n){

        if (checkString.contains(subString)) {
            count++;
            String replacedString = checkString.replaceFirst(subString, subString.substring(0,1));
          //  System.out.println(replacedString);
            strCopies(replacedString,subString,n);
        }
        else if (n == count) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        }
    }



