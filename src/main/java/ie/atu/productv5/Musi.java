package ie.atu.productv5;;

import ie.atu.productv5.Product;

public class Musi extends Product
{
    private String artist;
    private String label;

    public Musi() {
        super();
        artist = "";
        label = "";
        count++;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return super.toString() + " " + artist;
    }
}
