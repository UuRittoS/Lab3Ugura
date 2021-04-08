package com.company;

import java.util.Objects;

public class Ruby extends Diamond{

    Ruby(DiamondColor defaultColor){
        super(defaultColor);
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }

}
