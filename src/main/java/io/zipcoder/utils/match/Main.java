package io.zipcoder.utils.match;

import io.zipcoder.utils.Item;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "The Quick Brown";
        String patternString = "^The";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        for (int i = 0; matcher.find(); i++) {
            System.out.println(new StringBuilder()
                    .append("\n-------------------")
                    .append("\nValue = " + matcher.group())
                    .append("\nMatch Number = " + i)
                    .append("\nStarting index = " + matcher.start())
                    .append("\nEnding index = " + matcher.end())
                    .toString());
        }
    }
//
//    public void LetsSee() {
//        String line = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##NAMe:eggs;price:1.24;type:Food;expiration:2/25/2015##";
//        String singleItemMy = line.toLowerCase();
//
//        String singleItemMy = line.toLowerCase();
//        Pattern pattern = Pattern.compile("(?<=).*?(?=[#])");
//        Matcher matcher = pattern.matcher(singleItemMy);
//
//        ArrayList<Item> list = new ArrayList<>();
//
//        while (matcher.find()) {
//            list.add(pa);
//        }


//
//       Item i =parseSingleItem(valueToParse);
////       list.add(i);
//        System.out.println(list);
//    }
//
//}

    }