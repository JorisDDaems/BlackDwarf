package be.intecbrussel;

import java.util.Arrays;

public class WorldChunk {

    private Room [][] rooms;


    public WorldChunk(){
        this(Config.DEFAULT_CHUNK_SIZE, Config.DEFAULT_CHUNK_SIZE);
    }

    public WorldChunk(int x){
        this(x,x);
    }

    public WorldChunk(int x, int y){
        this.rooms = new Room[x][y];
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
