package org.example;

public class Cat extends Animal {
    boolean satiety = false;
    private String satietyTxt;

    @Override
    public void Run(int runLength) {
        if (runLength > 200) {
            System.out.println(name + " пробежал больше чем 200 метров и умер.");
        } else super.Run(runLength);
    }

    @Override
    public void Swimm(int swimmLength) {
        if (swimmLength > 0) {
            System.out.println(name + " не умеет плавать, поэтому он утонул.");
        } else super.Swimm(swimmLength);
    }

    public Cat(String name1, int need) {
        name = name1;
        System.out.println("Создан новый кот: " + name);
        if (satiety == true) {
            satietyTxt = " сыт.";
        } else satietyTxt = " голоден.";

        if (need > miska) {
            System.out.println(name + satietyTxt + " Добавьте еды в миску.");
            satiety = false;
        } else {
            satiety = true;
            if (satiety == true) {
                satietyTxt = " сыт.";
            } else {
                satietyTxt = " голоден.";
            }

            miska = miska - need;
            System.out.println(name + satietyTxt);
        }
        System.out.println("В миске осталось " + miska + " еды");
    }

}

