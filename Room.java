package be.intecbrussel;

import java.util.Arrays;

public class Room {

    int [] location;
    boolean containsPlayer;
    int x;
    int y;

    public Room (int x , int y){
        this.x = x;
        this.y = y;
    }

    public static boolean containsPlayer(char[][] gamearea){
        for (char[] chars : gamearea) {
            for (int j = 0; j < gamearea.length; j++) {
                if (chars[j] == Config.PLAYER) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void addPlayer(char[][] gamearea, int x ,int y){

        // om te checken of er al een speler is + boodschap te geven
        if (containsPlayer(gamearea)== false){
            gamearea[x][y] = Config.PLAYER;
        } else {
            System.out.println("-There is already a player in this room-");
        }

        /* om extra player toe te voegen op specifieke locatie
        if (gamearea[x][y] == Config.PLAYER){
            System.out.println("-There is already a player at this location-");
        } else {
            gamearea[x][y] = Config.PLAYER;
        }
         */
    }


    public static void removePlayer(char[][] gamearea){

        // veegt heel het bord leeg

        if (containsPlayer(gamearea)){
            for (char[] chars : gamearea) {
                for (int j = 0; j < gamearea.length; j++) {
                    if (chars[j] == Config.PLAYER) {
                        chars[j] = '.';
                    }
                }
            }
        } else {
            System.out.println("-There is no player in this room-");
        }
    }

    public static char getWorldDisplay(char[][] world){
        if (containsPlayer(world)== true) {
            return '@';
        } else {
            return '.';
        }
    }


    @Override
    public String toString() {
        return "Room{" +
                "location=" + Arrays.toString(location) +
                ", containsPlayer=" + containsPlayer +
                '}';
    }
}
