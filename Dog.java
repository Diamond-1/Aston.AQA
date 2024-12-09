package org.example;

public class Dog extends Animal {

    public Dog(String name) {
        Name = name;
        System.out.println("Создан новый пес: " + Name);
    }

    @Override
    public void Run(int runLength) {
        if (runLength > 500) {
            System.out.println(Name + " пробежал больше чем 500 метров и умер.");
        } else super.Run(runLength);
    }

    @Override
    public void Swimm(int swimmLength) {
        if (swimmLength > 10) {
            System.out.println(Name + " проплыл больше 10 метров и утонул.");
        } else super.Swimm(swimmLength);
    }
}
