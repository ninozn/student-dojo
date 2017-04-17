package org.joyofcoding.objectcalisthenics;

public class Quality {
    private int quality;

    public Quality(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void addQuality(int quantity){
        quality += quantity;
    }

    public void substractQuality(int quantity){
        quality -= quantity;
    }
}
