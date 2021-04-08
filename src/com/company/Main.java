package com.company;
public class Main {

    public static void main(String[] args) {

        Creature troll = new Creature("Moomy-Troll");
        Light light = new Light(LightType.STRONG);
        Ruby ruby = new Ruby(DiamondColor.PINK);
                 troll.TurnHead();
                light.shineAt(ruby);
                 ruby.changeColor(DiamondColor.DARK_RED);
                 ruby.changeColor(DiamondColor.BLACK_TULIPAN);

    }
}
