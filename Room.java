package be.intecbrussel;

public class Room {

    int [] location;
    boolean containsPlayer;
    int x;
    int y;


    public Room (int x , int y){
        this.x = x;
        this.y = y;
    }

    private static boolean containsPlayer(char[][] gamearea){
        for (char[] chars : gamearea) {
            for (int j = 0; j < gamearea.length; j++) {
                if (chars[j] == '@') {
                    return true;
                }
            }
        }
        return false;
    }

    private static void addPlayer(char[][] gamearea){

    }

    private static void removePlayer(char[][] gamearea){
        for (char[] chars : gamearea) {
            for (int j = 0; j < gamearea.length; j++) {
                if (chars[j] == '@') {
                    chars[j] = '.';
                }
            }
        }
    }

    private static char getWorldDisplay(char[][] world){
        if (containsPlayer(world)== true) {
            return '@';
        } else {
            return '.';
        }
    }






}
