package org.example;

public class Cat extends Animal {

    boolean Satiety = false;
    String satiety;

    @Override
    public void Run(int runLength) {
        if (runLength > 200) {
            System.out.println(Name + " пробежал больше чем 200 метров и умер.");
        } else super.Run(runLength);
    }

    @Override
    public void Swimm(int swimmLength) {
        if (swimmLength > 0) {
            System.out.println(Name + " не умеет плавать, поэтому он утонул.");
        } else super.Swimm(swimmLength);
    }

    public Cat(String name, int need) {
        Name = name;
        System.out.println("Создан новый кот: " + Name);
        if (Satiety == true) {
            satiety = " сыт.";
        } else satiety = " голоден.";

        if (need > Miska) {
            System.out.println(Name + satiety + " Добавьте еды в миску.");
            Satiety = false;
        } else {
            Satiety = true;
            if (Satiety == true) {
                satiety = " сыт.";
            } else {
                satiety = " голоден.";
            }

            Miska = Miska - need;
            System.out.println(Name + satiety);
        }
        System.out.println("В миске осталось " + Miska + " еды");
    }

}
