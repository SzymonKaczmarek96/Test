package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.isPositive(20));

        System.out.println(calc.add(20,15));

        System.out.println();

        System.out.println(calc.showNumber(new int[]{5,10,8,3,9,2,2,3}));




        ArrayList<String> practice = new ArrayList<>();
        practice.add("Szymon");
        practice.add("Szymon");
        practice.add("Szymon");
        practice.add("Aleksander");
        practice.add(null);
        practice.add(null);
        practice.add("");
        practice.add("");
        practice.add("Aleksander");
        practice.add("Aleksander");
        practice.add("Aleksander");



        System.out.println(calc.lenList(practice));
        System.out.println(calc.howManyEmpties(practice));
        System.out.println(calc.theLongestName(practice));

        String[] board = new String[5];
        board[0] = "Szymon";
        board[1] = "Piotr";
        board[2] = "Eryk";
        board[3] = "Pawel";
        board[4] = "Aleksander";



        String[] result = FilterOfString.notLonger(board,2);

        for (String element : result) {
            System.out.println(element);
        }

        ArrayList<String> resultSetName = FilterOfString.recurring(practice);

        for (String setName: resultSetName) {

            System.out.println(setName);

        }


    }
}