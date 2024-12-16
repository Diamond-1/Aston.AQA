package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  Задание 1
        String[][] str = new String[5][5];

        try{
            MyArray(str);
        } catch (MyArraySizeException e) {
            System.out.println("Массив должен быть 4х4");
        }
    }
    public static void MyArray (String[][] str){
        System.out.println(Arrays.deepToString(str));
    }

}
