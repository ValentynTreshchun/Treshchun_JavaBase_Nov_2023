package com.hillel.treshchun.lessons.lesson13.HW15;


public class MainHW13 {

    public static void main(String[] args) {

    MusicStyles[] bands = new MusicStyles[] {
           new PopMusic(),
           new ClassicMusic(),
           new RockMusic() 
    };

        for (MusicStyles style : bands
             ) {
            style.playMusic();
        }
    }

}
