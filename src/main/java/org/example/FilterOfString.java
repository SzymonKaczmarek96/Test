package org.example;

import java.util.ArrayList;

public class FilterOfString {

    public static String[] notLonger(String[] strList,int number) {

        if(number > strList.length) {
            throw new IllegalArgumentException("Number must be less than board length");
        }

            String[] strBoard = new String[number];

            for (int i = 0; i < number; i++) {

                strBoard[i] = strList[i];

            }

        return strBoard;
    }


    public static ArrayList<String> recurring(ArrayList<String> namesRecurring) {

        ArrayList<String> setList = new ArrayList<>();


        for (String name: namesRecurring) {

            if(name!= null && !name.isEmpty()) {


                if (!setList.contains(name)) {

                    setList.add(name);
                }
            }


        }

        return setList;


    }

}
