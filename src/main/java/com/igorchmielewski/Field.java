package com.igorchmielewski;

import java.util.HashMap;
import java.util.Map;

public class Field {
    private Map<String,Bear> bearGame = new HashMap<>();
    public  void register (Bear bear){
        bear.setField(this);
        bearGame.put(bear.getName(),bear);
    }
    public void sendToFight(Bear from, String to){
        Bear bear = bearGame.get(to);
        from.attack(bear);
    }
}
