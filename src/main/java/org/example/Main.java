package org.example;


public class Main {
    public static void main(String[] args) {
        //  Задание 1
        System.out.println("Задание 1:");
        Animal animal = new Animal();
        animal.Feed(50);
        Dog dog = new Dog("Бобик");
        dog.Run(19);
        Cat cat = new Cat("Гарфилд", 10);
        cat.Swimm(20);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Гоча", 10);
        cats[1] = new Cat("Сигма", 30);
        cats[2] = new Cat("Маня", 20);
        // Звдвние 2
        System.out.println("Задание 2:");
        Circle circle = new Circle("Крансый", "Зеленый", 12);
        Square square = new Square("Синий", "Беылй",5);
        Triangle triangle = new Triangle("Фиолетовый", "Серый", 4,3,2);
        circle.Perimetr();
        circle.Area();
        square.Perimetr();
        square.Area();
        triangle.Perimetr();
        triangle.Area();
        circle.showInfo();
        square.showInfo();
        triangle.showInfo();
    }


}
