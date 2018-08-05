package com.igorchmielewski;

public class BlackBeer extends Bear{

    private AttackStrategy attackStrategy;
    public BlackBeer(String name ) {
        super(name);
        attackStrategy = new HurtAttack();
    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this,animal);
    }
}

