package be.intecbrussel;

import java.util.Arrays;

public class WorldChunk {

    Room [][] rooms;

    WorldChunk(){}

    WorldChunk(int x, int y){}


    private static void movePlayer(String direction){}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorldChunk{");
        sb.append("rooms=").append(Arrays.toString(rooms));
        sb.append('}');
        return sb.toString();
    }
}
