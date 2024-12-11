package org.example;

public class Dog extends Animal {

    public Dog(String name1) {
        name = name1;
        System.out.println("Создан новый пес: " + name);
    }

    @Override
    public void Run(int runLength) {
        if (runLength > 500) {
            System.out.println(name + " пробежал больше чем 500 метров и умер.");
        } else super.Run(runLength);
    }

    @Override
    public void Swimm(int swimmLength) {
        if (swimmLength > 10) {
            System.out.println(name + " проплыл больше 10 метров и утонул.");
        } else super.Swimm(swimmLength);
    }
}

