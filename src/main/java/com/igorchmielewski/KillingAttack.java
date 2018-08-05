package com.igorchmielewski;

public class KillingAttack implements AttackStrategy{

    public void attack (){
        System.out.println("Niedźwiedź Polarny zabija" );
    }

    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker + " zabija " + defender);
    }
}
