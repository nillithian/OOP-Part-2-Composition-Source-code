package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

        System.out.println ( );
        Dimensions dimensionsChair = new Dimensions ( 20,10,10 );
        Dimensions dimensionsSofa = new Dimensions ( 100,100,50 );
        Table theTable = new Table ( dimensions,"brown",true,4 );
        Chair theChair = new Chair ( dimensionsChair,"Red",true,true );
        Sofa theSofa = new Sofa ( dimensionsSofa,"Green", true );
        Room theRoom = new Room ( theSofa, theTable, theChair );

        theRoom.getChair ().setUnderTable ( true );
        theRoom.getChair ().moveChair ();
        theRoom.getChair ().setUnderTable ( false );
        theRoom.getChair ().moveChair ();
        theRoom.getSofa ().closeSofa ();
        theRoom.getSofa ().extendSofa ();
        theRoom.getTable ().extendTable ();
        theRoom.getTable ().foldTable ();
    }
}
