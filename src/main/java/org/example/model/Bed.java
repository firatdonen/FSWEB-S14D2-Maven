package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style,int pillows,int height,int sheets,int quilt){
        this.style=style;
        this.pillows=pillows;
        this.height=height;
        this.sheets=sheets;
        this.quilts=quilts;
    }
     public String getStyle(){
        return style;
     }
    public int getHeight(){
        return height;
    }
    public int getPillows(){
        return pillows;
    }
    public  int getSheets(){
        return sheets;
    }
    public int getQuilts(){
        return quilts;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }
    public String toString(){
        return "Bed{"+
                "style= "+ style + "\'" +
                ", pillows=" + pillows +
                ", height=" +height +
                ", sheets=" + sheets +
                ", quilt=" + quilts +
                "}";
    }
    

}