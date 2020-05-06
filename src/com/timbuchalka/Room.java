package com.timbuchalka;

public class Room {
    private Sofa sofa;
    private Table table;
    private Chair chair;

    public Room(Sofa sofa, Table table, Chair chair) {
        this.sofa = sofa;
        this.table = table;
        this.chair = chair;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Table getTable() {
        return table;
    }

    public Chair getChair() {
        return chair;
    }
}
