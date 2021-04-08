package com.company;

public abstract class Diamond implements DiamondSkills{
            private DiamondColor color;

            Diamond(DiamondColor defaultColor){
                this.color = defaultColor;
            }


    @Override
    public void changeColor(DiamondColor newColor) {
        System.out.println("Diamond color has been changed from: "+this.color
                            +" To "+newColor
        );
        this.color = newColor ;
    }

    public DiamondColor getDiamondColor(){
        return this.color;
    }

}
