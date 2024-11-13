package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Model!");
        Lamp lamp = new Lamp(LampType.NEON,true,50);
        lamp.turnOn();
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed  = new Bed("double",2,2,1,1);
        bed.make();
        Wall northWall= new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall= new Wall("West");
        Wall southWall = new Wall("South");
        Wall[] walls = new Wall[]{northWall,eastWall, westWall,southWall}; //array içine ekle



        // bırada yukarıdaki objeleri atıyoruz.
        Bedroom bedroom= new Bedroom( "Bedroom",northWall,westWall,eastWall,southWall,ceiling,
                lamp,new Carpet(2,3,PaintColor.WHITE), bed,
                 new Wardrobe(2,3,45)
                );

        bedroom.createBedroom();

    }
}