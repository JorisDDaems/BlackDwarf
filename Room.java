package be.intecbrussel;

import java.util.Arrays;

public class Room {

    private int [] location;
    private boolean containsPlayer;
    private int x;
    private int y;

    public Room (int x , int y){
        this.x = x;
        this.y = y;
        this.location = new int[]{x,y};
    }


    public boolean containsPlayer(){
        return this.containsPlayer;
    }

    public void addPlayer(){
        this.containsPlayer = true;
    }
    
    public void removePlayer(){
        this.containsPlayer = false;
    }

    public char getWorldDisplay(){
        if (this.containsPlayer) {
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
