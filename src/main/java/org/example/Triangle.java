package org.example;

public class Triangle implements Figura {
    private String zalivkaColor;
    private String borderColor;
    private int storona1;
    private int storona2;
    private int storona3;
    private double perimeter;
    private double area;

    public Triangle(String zalivkaColor, String borderColor, int storona1, int storona2, int storona3){
        this.zalivkaColor = zalivkaColor;
        this.borderColor = borderColor;
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }

    @Override
    public void Perimetr() {
        perimeter = storona1 + storona2 + storona3;
    }

    @Override
    public void Area() {
        double polPerimeter = storona1 + storona2 + storona3/2;
        area = Math.sqrt(polPerimeter*(polPerimeter-storona1)*(polPerimeter-storona2)*(polPerimeter-storona3));
    }

    @Override
    public void showInfo() {
        System.out.println("Круг: Периметр - " + perimeter + ";" + " Площадь - " + area + ";" + " Цвет залвки - " + zalivkaColor + ";" + " Цвет границ - " + borderColor + ";");
    }
}
