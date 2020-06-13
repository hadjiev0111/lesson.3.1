package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i= i + 1){ // i++; i+=2 => i = i + 2
            System.out.println(i);
        }
        System.out.println("____________");
        System.out.println(" ");
        for (int i = 1; i <= 10; i++) { //i = i + 10
            System.out.println(7 + " x " + i + " = " +  (7 *i));
        }
        System.out.println(" ");

        for (int i = 10; i > 0 ; i--) {
            System.out.println(9 + " x " + i + " = " +  (9 *i));
        }
        System.out.println(" ");

        int a = 0;
        while (a < 3){
            System.out.println(a);
            a++;
        }
        System.out.println(" ");

        String str = "#";
        while (str.length() < 10){
            str = str + "#";
            System.out.println(str);
        }
        System.out.println("**********");
        int[] numbers = {1,5,7,9,0,-45,77, 912 ,-66};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers [i]);
            if (numbers[i] < 0) {
                continue;
            }
            System.out.println("Конец круга");
        }
        System.out.println("**********");

        for (int tempValue: numbers) {
            System.out.println(tempValue * 3);
        }
        System.out.println(" ");

        String[] names = {"Azim","Aziz","Aziret"};
        for (String word : names) {
            System.out.println("Hi " + word);

        }
        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Наружный цикл");
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("Вложенный цикл");
                System.out.println("j = " +j);

            }

        }
    }
}
