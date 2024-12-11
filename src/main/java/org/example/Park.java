package org.example;

public class Park {
    private String name;
    private String city;
    private int numberAttraction;

    public Park(String name, String city, int numberAttraction) {
        this.name = name;
        this.city = city;
        this.numberAttraction = numberAttraction;
    }

    public class Attraction {
        private String attrName;
        private String workTime;
        private String cost;

        public Attraction(String attrName, String workTime, String cost) {
            this.attrName = attrName;
            this.workTime = workTime;
            this.cost = cost;
        }
    }
}
