package com.igorchmielewski;

import java.time.LocalDateTime;

abstract class Animal {

    private String name;
    private int weight;
    LocalDateTime today = LocalDateTime.now();
    private Attack attack;

    public void display() {
        System.out.println("Jestem niedźwiedziiem" + getClass().getSimpleName() + " Waze " + getWeight(weight) + "KG" + "Jadłem : " + getToday());
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight(int weight) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return getToday().isAfter(LocalDateTime.now().minusDays(10));

    }

    public LocalDateTime eat() throws IDontEatExeption {
        System.out.println("Animal eat " + today);
        return today;

    }

    public LocalDateTime getToday() {
        return today;
    }


    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Zwierze " +
                " o imiemiu " +name +
                " wadze " + weight +
                " Ostatnio karmiony  " + today ;

    }
}



