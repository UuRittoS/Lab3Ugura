package com.company;

import java.util.Objects;

public class Light implements LightSkills{
         LightType type;

         Light(LightType defaultType){
            this.type = defaultType;
         }

    @Override
    public void shineAt(Object target) {
        System.out.println("The Light of " + this.type
                + " type shines at "+ target.toString());
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
