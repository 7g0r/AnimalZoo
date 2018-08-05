package com.igorchmielewski;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Bear bear1 = new PolarBear("Koralgol");
        Bear bear2 = new BlackBeer("Uszatek");
        Bear bear3 = new BrownBear("Puchatek");

        field.register(bear1);
        field.register(bear2);
        field.register(bear3);

        bear1.attackBear("Uszatek");
        bear2.attackBear("Puchatek");
        bear3.attackBear("Koralgol");








    }
}
