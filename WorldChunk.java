package be.intecbrussel;

import java.util.Arrays;

public class WorldChunk {

    Room [][] rooms;
    int x;
    int y;

    WorldChunk(){
        this(Config.DEFAULT_CHUNK_SIZE, Config.DEFAULT_CHUNK_SIZE);
    }

    WorldChunk(int x, int y){
        this.x = x;
        this.y = y;
    }


    private static void movePlayer(String direction){
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorldChunk{");
        sb.append("rooms=").append(Arrays.toString(rooms));
        sb.append('}');
        return sb.toString();
    }
}
