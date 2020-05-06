package com.timbuchalka;

public class Chair {

    private Dimensions dimensions;
    private String colour;
    private boolean extendable;
    private boolean isUnderTable;

    public Chair(Dimensions dimensions, String colour, boolean extendable, boolean isUnderTable) {
        this.dimensions = dimensions;
        this.colour = colour;
        this.extendable = extendable;
        this.isUnderTable = isUnderTable;
    }

    public void setUnderTable(boolean underTable) {
        isUnderTable = underTable;
    }

    public void moveChair(){
        if (isUnderTable){
            System.out.println ("Chair is under the table" );
        } else {
            System.out.println ("Chair is next to the table." );
        }
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

    public boolean isUnderTable() {
        return isUnderTable;
    }
}
