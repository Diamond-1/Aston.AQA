package org.example;

public class Animal {
    static String Name;
    static int Miska = 30;

    public void Run(int runLength) {
        if (runLength <= 0) {
            System.out.println("Ошибка! Введите положительное значение!");
        } else System.out.println(Name + " пробежал " + runLength + " метров.");
    }

    public void Swimm(int swimmLength) {
        if (swimmLength <= 0) {
            System.out.println("Ошибка! Введите положительное значение!");
        } else System.out.println(Name + " проплыл " + swimmLength + " метров.");
    }

    public void Feed(int miska) {
        Miska = miska;
    }
}
