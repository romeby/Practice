package com.roman.learn.locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalePractice {

    public static void main(String[] args) {
        Locale localeBY = new Locale("by","BY");
        Locale localeDE = new Locale("de","DE");
        ResourceBundle resourceBundleBY = ResourceBundle.getBundle("data", localeBY);
        ResourceBundle resourceBundleDE = ResourceBundle.getBundle("data", localeDE);
        System.out.println(resourceBundleBY.getString("submit1"));
        System.out.println(resourceBundleDE.getString("submit2"));

        /* Date locale */

        Date date = new Date();
        double d = 10_200_100.891;
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale loc: locales) {
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, loc);
            /* Number format locale */
            NumberFormat numberFormatUS = NumberFormat.getNumberInstance(loc);
            /* Number format close*/
            System.out.print(numberFormatUS.format(d) + "^^^^^^^^^^^ ");
            System.out.println(loc.toString() + "---> " + dateFormat.format(date));
        }



    }
}
