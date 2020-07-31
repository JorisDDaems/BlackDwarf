package be.intecbrussel;

import java.util.Arrays;

public class Room {

    private int [] location;
    private boolean containsPlayer;
    private boolean containsLoot;
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

    public boolean containsLoot(){
        return this.containsLoot;
    }

    public void addLoot(){
        this.containsLoot = true;
    }


    public char getWorldDisplay(){
        if (this.containsPlayer) {
            return '@';
        } else if (this.containsLoot) {
            return 'C';
        } else {
            return '.';
        }
    }


    public int[] getLocation() {
        return location;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room{");
        sb.append("location=").append(Arrays.toString(location));
        sb.append(", containsPlayer=").append(containsPlayer);
        sb.append(", containsLoot=").append(containsLoot);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
