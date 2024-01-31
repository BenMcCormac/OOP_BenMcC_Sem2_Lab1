package ie.atu.productv5;

import ie.atu.productv5.Product;

public class TV extends Product
{
    private String screenSize;
    private String manufature;

    public TV() {
        super();
        screenSize = "";
        manufature = "";
        count++;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String artist) {
        this.screenSize = artist;
    }

    public String getManufature() {
        return manufature;
    }

    public void setManufature(String label) {
        this.manufature = label;
    }

    @Override
    public String toString() {
        return super.toString() + " " + screenSize;
    }
}
