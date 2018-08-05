package com.igorchmielewski;

abstract class Bear extends Animal implements Attack {


    private Field field;



    public void setField(Field field) {
        this.field = field;
    }

    public Bear(String name ) {
        super(name,100);
    }
    public void attackBear (String defenderName){
        field.sendToFight(this, defenderName);
    }
}
