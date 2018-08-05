package com.igorchmielewski;

public class HurtAttack implements AttackStrategy {

    public void attack (){
        System.out.println("  Niedźwiedź rani niedźwiedzia  ");
    }

    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker + " atakujący rani  " + defender);

    }
}
