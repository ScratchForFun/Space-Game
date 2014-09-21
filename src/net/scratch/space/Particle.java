package net.scratch.space;

import java.awt.*;

/**
 * Created by Scratch on 9/21/2014.
 */
public class Particle {

    public float x;
    public float y;

    public int age;
    public int maxAge;

    public Color color;

    public Particle(Color color, int maxAge, int x, int y){
        this.color = color;
        this.maxAge = maxAge;
        this.x = x;
        this.y = y;
    }

}
