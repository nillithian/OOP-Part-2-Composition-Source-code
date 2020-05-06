package com.timbuchalka;

public class Table {
    private Dimensions dimensions;
    private String colour;
    private boolean extendable;
    private int seats;

    public Table(Dimensions dimensions, String colour, boolean extendable,int seats) {
        this.dimensions = dimensions;
        this.colour = colour;
        this.extendable = extendable;
        this.seats=seats;
    }

    public void extendTable(){
        System.out.println ("Table has been extended." );
    }

    public void foldTable(){
        System.out.println ("Table has been folded." );
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
