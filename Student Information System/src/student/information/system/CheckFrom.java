/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nguyen
 */
public class CheckFrom {

    public static boolean isPwdUsername(String Value) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(Value);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    //Check a string is numberic
    public static boolean isNumberic(String value) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkDate(String value) {
        String kiemtra = "29-02-2012";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        ParsePosition position = new ParsePosition(0);
        formatter.setLenient(false);
        System.out.println(formatter.parse(kiemtra, position));
        return false;
    }

    //Validate email input
    public static boolean checkEmail(String value) {
        Pattern pattern = Pattern.compile("[a-zA-Z][_]*\\d*@[a-z]{2,5}[.][a-z]{2,3}");
        Matcher matcher = pattern.matcher(value);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    //Validate phone number
    public static boolean checkPhoneNumber(String value) {
        Pattern pattern = Pattern.compile("[0]{1}[1,9]{1}[0-9]{8,9}");
        Matcher matcher = pattern.matcher(value);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkID1(String value) {
        Pattern pattern = Pattern.compile("[GT]+[0-9]{5}$");
        Matcher matcher = pattern.matcher(value);
//        Pattern pattern2 = Pattern.compile("[GC]+[0-9]{5}");
//        Matcher matcher2 = pattern2.matcher(value);
        if (!matcher.find()) {
            return false;
        } 
//         if (!matcher2.find()) {
//            return false;
//
//        } 
        else {
            return true;
        }
    }
    public static boolean checkID2(String value) {
        Pattern pattern = Pattern.compile("[GC]+[0-9]{5}$");
        Matcher matcher = pattern.matcher(value);
//        Pattern pattern2 = Pattern.compile("[GC]+[0-9]{5}");
//        Matcher matcher2 = pattern2.matcher(value);
        if (!matcher.find()) {
            return false;
        } 
//         if (!matcher2.find()) {
//            return false;
//
//        } 
        else {
            return true;
        }
    }
}
