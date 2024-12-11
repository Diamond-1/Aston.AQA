package org.example;

public class Animal {
    static String name;
    static int miska = 30;

    public void Run(int runLength) {
        if (runLength <= 0) {
            System.out.println("Ошибка! Введите положительное значение!");
        } else System.out.println(name + " пробежал " + runLength + " метров.");
    }

    public void Swimm(int swimmLength) {
        if (swimmLength <= 0) {
            System.out.println("Ошибка! Введите положительное значение!");
        } else System.out.println(name + " проплыл " + swimmLength + " метров.");
    }

    public void Feed(int miska) {
        miska = miska;
    }
}
