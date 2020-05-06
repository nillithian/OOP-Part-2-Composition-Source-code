package com.timbuchalka;

public class Sofa {
    private Dimensions dimensions;
    private String colour;
    private boolean extendable;

    public Sofa(Dimensions dimensions, String colour, boolean extendable) {
        this.dimensions = dimensions;
        this.colour = colour;
        this.extendable = extendable;
    }

    public void extendSofa(){
        System.out.println ("Sofa has been extended." );
    }

    public void closeSofa(){
        System.out.println ("Sofa has been closed." );
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColour() {
        return colour;
    }

    public boolean isExtendable() {
        return extendable;
    }
}
