package org.coursera.mypentagram;

/**
 * Created by TouxStudio on 07/03/2017.
 */

public class Pets {
    private String name;
    private int pic;
    private int rate;

    public Pets (String name, int pic, int rate){

        this.name = name;
        this.pic = pic;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
