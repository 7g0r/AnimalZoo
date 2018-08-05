package com.igorchmielewski;

public class PolarBear extends Bear{

    private AttackStrategy attackStrategy;

    public PolarBear(String name) {
        super(name);
        attackStrategy = new KillingAttack();
        getWeight(50);

    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this,animal);
    }
}
