package com.igorchmielewski;

public class BrownBear extends Bear {

    private AttackStrategy attackStrategy;
    public BrownBear(String name) {
       super(name);
       attackStrategy = new HurtAttack();
        getWeight(100);
    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this,animal);
    }
}
