package com.priklady.zakladyobjektovehoprogramovania.ovocie;

public class Apple {
    String colour;
    int size;

    // constructors
    public Apple(){
        size = 0;
        colour = "";
    }

    public Apple(int s){
        size = s;
        colour = "";
    }

    public Apple(int s, String c){
        size = s;
        colour = c;
    }

    // methods
    public String rot(int rotTime, String rotColour){
        while (rotTime > 0){
            System.out.println("rotting...");
            --rotTime;
        }
        colour = rotColour;
        return "The apple is rotten.";
    }

    // getters and setters
    public String getColour(){
        return colour;
    }

    public int getSize() {
        return size;
    }

    public void setColour(String c) {
        colour = c;
    }

    public void setSize(int s) {
        size = s;
    }
}