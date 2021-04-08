package com.company;

import java.util.Objects;

public class Creature implements CreatureSkills{
        private String name;

        Creature(){
                this.name ="noName";
        }

        Creature(String creatureName){
                this.name = creatureName;
        }


        @Override
        public void TurnHead() {
                System.out.println("The Creature " + this.name+ " Turned its head");
        }

        public String getName(){
                return this.name;
        }



        @Override
        public String toString() {
                return this.name;
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


