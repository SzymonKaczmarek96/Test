package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public final class Calculator extends PlusMinus implements Comparator {


    @Override
    public boolean isPositive(int i) {
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public int add(int first, int second) {
        return first + second;
    }

    public int showNumber (int[] numberList) {
        int odd = 0;
        int even = 0;
        boolean checkZeroInTheArray = false;


        for (int i = 0; i < numberList.length; i++) {


            if (numberList[i] == 0) {
                checkZeroInTheArray = true;
            }


            if (numberList[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        if (checkZeroInTheArray) {
            return 0;
        } else if (even > odd) {
            int maxEven = Arrays.stream(numberList)
                    .filter(num -> num % 2 == 0)
                    .max()
                    .orElse(0);

            return maxEven;

        } else if (odd > even) {
            int maxOdd = Arrays.stream(numberList)
                    .filter(num -> num % 2 != 0)
                    .max()
                    .orElse(0);
            return maxOdd;
        }
        return 0;
    }

    public int lenList(ArrayList<String> namesList) {

        int howManyNames = 0;

        for(String name: namesList) {

            if (name != null && !name.isEmpty()){
                howManyNames++;
            };

        }

        return howManyNames;


    }


    public int howManyEmpties(ArrayList<String> namesList) {

        int howManyEmpty = 0;

        for(String name: namesList) {

            if (name == null || name.isEmpty()){
                howManyEmpty++;
            };

        }

        return howManyEmpty;

    }


    public String theLongestName(ArrayList<String> namesList) {

            String theLongestStr;



        return theLongestStr = namesList
                .stream()
                .filter(elements -> elements!= null && !elements.isEmpty())
                .max(java.util.Comparator.comparing(String::length))
                .get();

    }
}
