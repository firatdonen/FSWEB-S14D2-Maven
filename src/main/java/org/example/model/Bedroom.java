package org.example.model;
import org.example.model.room;

public class Bedroom extends room{
    private Bed bed;
    private Wardrobe wardrobe;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3,
                   Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet,
                   Bed bed, Wardrobe wardrobe) {
        super(wall1, name, wall2, wall3, wall4, ceiling, lamp, carpet);
        this.bed = bed;
        this.wardrobe = wardrobe;
    }
    public void createBedroom(){
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet().lying();
        getWardrobe().add();
    }


    public Bed getBed(){
        return bed;
    }
    public Wardrobe getWardrobe(){
        return wardrobe;
    }
    public String toString(){
        return "Bedroom{"+
                "bed="+bed+
                "wardrobe="+wardrobe+
                ",room="+super.toString()+
                "}";
    }
}

