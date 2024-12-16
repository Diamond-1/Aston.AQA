package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  Задание 1
        String[][] str = new String[4][3];
        try{

            MyArray(str);
        } catch (MyArraySizeException e) {
            System.out.println("Вывод: " + e.getMessage());
        }
    }
    public static void MyArray (String[][] str) throws MyArraySizeException {
        if (str.length != 4 && str[0].length != 4){
            throw new MyArraySizeException("Массив должен быть 4х4");
        }
        System.out.println(Arrays.deepToString(str));
    }

}
