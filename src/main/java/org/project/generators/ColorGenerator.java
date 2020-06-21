package org.project.generators;

import java.awt.*;
import org.project.api.Generator;

public class ColorGenerator implements Generator {
    private int red;
    private int green;
    private int blue;

    public ColorGenerator(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public Object generate(ColorGenerator a) {

        return new Color(a.getRed(),a.getGreen(),a.getBlue());
    }


}
