package be.intecbrussel;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WorldChunk {

    private final Room [][] rooms;

    public WorldChunk(){
        this(Config.DEFAULT_CHUNK_SIZE, Config.DEFAULT_CHUNK_SIZE);
    }

    public WorldChunk(int x){
        this(x,x);
    }

    public WorldChunk(int x, int y){
        this.rooms = new Room[x][y];
    }

    public void addingPlayer(Room room, Room[][] rooms) {

        int a = room.getLocation()[0];
        int b = room.getLocation()[1];

        for (int i = 0; i< rooms.length; i++){
            // rooms[i] = new Room[rooms.length];
            for (int j = 0; j<rooms.length; j++){
                rooms[i][j] = new Room(i,j);
                if (rooms[i][j] == rooms[a][b]){
                    rooms[i][j].addPlayer();
                }
            }
        }
        showWorldChunk(rooms);
    }


    public void movePlayer(String direction, Room[][] rooms) {

        Scanner scan = new Scanner(System.in);

        do {

            do {
            System.out.println("ask input");
            direction = scan.nextLine();
        } while (!Pattern.matches(Config.INPUT, direction));


        int x = 0;
        int y = 0;

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms.length; j++) {
                if (rooms[i][j].getWorldDisplay() == '@') {
                    System.out.println("player is at this location" + rooms[i][j].toString());
                    x = i;
                    y = j;
                }
            }
        }

            switch (direction) {
                case "X":
                    System.out.println("See you next time!");
                    break;

                case "N":
                    if (x == 0) {
                        System.out.println("cant go further north");
                    } else {
                        rooms[x][y].removePlayer();
                        rooms[x-1][y].addPlayer();
                    }
                    break;

                case "S":
                    if (x == rooms.length-1) {
                        System.out.println("cant go further south");
                    } else {
                        rooms[x][y].removePlayer();
                        rooms[x+1][y].addPlayer();
                    }
                    break;

                case "E":
                    if (y == 0) {
                        System.out.println("cant go further east");
                    } else {
                        rooms[x][y].removePlayer();
                        rooms[x][y-1].addPlayer();
                    }
                    break;

                case "W":
                    if (y == rooms.length-1) {
                        System.out.println("cant go further west");
                    } else {
                        rooms[x][y].removePlayer();
                        rooms[x][y+1].addPlayer();
                    }
                    break;

                default:
                    System.out.println("Wrong input");

            }
            showWorldChunk(rooms);
        } while (!Pattern.matches("X", direction));

    }


        @Override
        public String toString () {
            final StringBuilder sb = new StringBuilder("WorldChunk{");
            sb.append("rooms=").append(Arrays.toString(rooms));
            sb.append('}');
            return sb.toString();
        }


        public static void showWorldChunk (Room[][]rooms){

            for (Room[] s : rooms) {
                for (Room r : s) {
                    System.out.print((r.getWorldDisplay()));
                }
                System.out.println();
            }
        }

        public static void printWorldChunk (Room[][]rooms){

            for (int i = 0; i < rooms.length; i++) {
                //rooms[i] = new Room[rooms.length];
                for (int j = 0; j < rooms.length; j++) {
                    rooms[i][j] = new Room(i, j);
                    System.out.println(rooms[i][j].getWorldDisplay());
                }
                System.out.println();
            }
        }



}
