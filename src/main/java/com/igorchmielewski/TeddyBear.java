package com.igorchmielewski;

import java.time.LocalDateTime;

public class TeddyBear extends Animal {
    public TeddyBear(String name) {
        super(name, 0);
    }

    @Override
    public LocalDateTime eat() throws IDontEatExeption {
        throw new IDontEatExeption();
    }
}
