package be.intecbrussel;

public class Main {
    public static void main(String[] args) {

        WorldChunk worldChunk = new WorldChunk();

        Room[][] world = new Room[10][10];

        Room room = new Room(2,0);

        /*
        for (Room[] s : world) {
            for (Room r : s) System.out.print(room.getWorldDisplay());
            System.out.println();
        }
         */

        //waarom null Exception hieronder = opgelost: niet elk element was gedefinieerd
        // wordt nog onder elkaar afgeprint.. hoezo??
        // WorldChunk.printWorldChunk(world);


        worldChunk.addingPlayer(room, world);
        // zit mee in method hierboven
        //WorldChunk.showWorldChunk(world);


        worldChunk.movePlayer("", world);

    }
}



