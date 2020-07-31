package be.intecbrussel;

import java.util.Random;

public class Loot {

    public void addingLoot(Room room, int lootAmount, Room[][] rooms) {


        for (int k = 0; k<lootAmount*2; k++){
            rooms[k] = new Room[rooms.length];

            for (int j = 0; j<lootAmount*2;j++) {
                rooms[k][j] = new Room(k, j);

                int random = (int) (Math.random() * rooms.length-1);
                int random1 = (int) (Math.random() * rooms.length-1);

                rooms[random][random1].addLoot();
                System.out.println(rooms[random][random1].toString());

            }
        }
    }
}
