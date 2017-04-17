package org.joyofcoding.objectcalisthenics;

public class Item {
    private String name;
    private SellIn sellIn;
    private Quality quality;

    public Item(String name, SellIn sellIn, Quality quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateItem() {
        if (!isAgedBrie() && !isTAFKAL80ETC() &&qualityIsBiggerThanZero() && !isSulfuras())
            quality.substractQuality(1);

        if ((isAgedBrie() || isTAFKAL80ETC()) && qualityIsSmallerThanFifty())
            quality.addQuality(1);

        if (isTAFKAL80ETC() && sellInIsSmallerThan(11) && qualityIsSmallerThanFifty())
            quality.addQuality(1);

        if (isTAFKAL80ETC() && sellInIsSmallerThan(6) && qualityIsSmallerThanFifty())
            quality.addQuality(1);

        if (!isSulfuras())
            sellIn.setSellIn(sellIn.getSellIn() - 1);

        if (sellInIsSmallerThan(0) && !isAgedBrie() && !isTAFKAL80ETC() && qualityIsBiggerThanZero() && !isSulfuras())
            quality.substractQuality(1);

        if (isTAFKAL80ETC() && !isAgedBrie() && sellInIsSmallerThan(0))
            quality.setQuality(0);

        if (sellInIsSmallerThan(0) && !isAgedBrie() && qualityIsSmallerThanFifty() && isAgedBrie())
            quality.addQuality(1);

    }

    public boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }

    public boolean isTAFKAL80ETC() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    public boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    public boolean qualityIsSmallerThanFifty(){
        return quality.getQuality() < 50;
    }

    public boolean qualityIsBiggerThanZero(){
        return quality.getQuality() > 0;
    }

    public boolean sellInIsSmallerThan(int sellInCheck){
        return sellIn.getSellIn() < sellInCheck;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() { return sellIn.getSellIn(); }

    public int getQuality() { return quality.getQuality(); }
}
