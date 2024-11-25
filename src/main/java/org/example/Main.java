package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        printThreeWords();
        System.out.println("Задание 2:");
        chekSumSign();
        System.out.println("Задание 3:");
        printColor();
        System.out.println("Задание 4:");
        compareNumbers();
        System.out.println("Задание 5:");
        test5();
        System.out.println("Задание 6:");
        test6(-6);
        System.out.println("Задание 7:");
        test7(23);
        System.out.println("Задание 8:");
        test8("ZXC",3);
        System.out.println("Задание 9:");
        test9(2004);
        System.out.println("Задание 10:");
        test10();
        System.out.println("Задание 11:");
        test11();
        System.out.println("Задание 12:");
        test12();
        System.out.println("Задание 13:");
        test13();
        System.out.println("Задание 14:");
        test14(3,2);
    }
    //Первое задание
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Второе задание
    public static void chekSumSign(){

        int a = 1,b = -2;
            if (a + b >= 0 ){
                System.out.println("Сумма положительная");
            }
            else System.out.println("Сумма отрицательная");

    }
    //Третье задание
    public static void printColor() {

        int value = 12;
            if (value <= 0 ){
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Желтый");
            } else if (value > 100 ){
                System.out.println("Зеленый");
            }

    }
    //Четвертое задание
    public static void compareNumbers(){

        int a = 1, b = 2;
            if ( a >= b ){
            System.out.println("a >= b");
            }else System.out.println("a < b");

    }
    //Пятое задание
    public  static void test5(){

        int a = 1,b = 2;
        boolean c;
            if (a + b >= 10 && a + b <= 20){
                c = true;
            }else c = false;
        System.out.println(c);

    }
    //Шестое задание
    public static int test6(int a){

        if( a >= 0 ){
                System.out.println("Число положиетльное");
        }else System.out.println("Число отрицательное");

        return a;
    }
    //Седьмое задание
    public static int test7(int a){

        boolean b;

            if ( a <= 0){
            b = false;
            }else b = true;

        System.out.println(b);

        return a;
    }
    //Восьмое задание
    public static String test8(String a, int b){

        for (int i = 0; i < b; i++){
            System.out.println(a);
        }

        return a;
    }
    //Девятое задание
    public static int test9(int year){

        boolean a;

            if ( year % 4 == 0 ){
                a = true;
            }
            else if ( year % 100 == 0 ){
                a = false;
            }
            else if (  year % 400 ==0 ){
                a = true;
            }
            else a = false;

        System.out.println(a);
        return year;
    }
    //Десятое задание
    public static void test10(){

        int[] arr =  {0,1,1,0,1,0};

            for (int i = 0; i < arr.length; i++){
                if( arr[i] == 0){
                    arr[i] = 1;
                }else arr[i] = 0;

                System.out.println(arr[i]);
            }
    }
    //Одинадцатое задание
    public static void test11(){

        int[] arr = new int[101];
            for (int i = 1; i < arr.length; i++){
                arr[i] = i;
                System.out.println(arr[i]);
            }
    }
    //Двенадцатое задание
    public static void test12(){

        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }
    //Тринадцатое задане
    public static void test13(){

        int[][] arr = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if ( i == j) {

                        arr[i][j] = 1;

                    }
                    if (i + j == 3 - 1) {

                        arr[i][j] = 1;

                    }

                    System.out.println(arr[i][j]);
                }

            }
    }
    //Четырнадцатое задание
    public static int test14(int len, int initialValue){

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;

            System.out.println(arr[i]);
        }
        return arr[len];
    }

}
