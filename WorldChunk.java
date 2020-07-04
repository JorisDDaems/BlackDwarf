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


    private void movePlayer(String direction){

        // player present?
        // findPlayer through objectsearch
        // safe location
        // take input in form of direction string
        // move the player

        Room room = new Room(0,0);

        for (int i = 0; i<rooms.length; i++ ){
            for (int j = 0; j < rooms.length; j++) {
                if (room.containsPlayer()){
                    Room rooms = new Room(i,j);
                }
            }
        }



    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorldChunk{");
        sb.append("rooms=").append(Arrays.toString(rooms)); // dit moet nog aangepast worden
        sb.append('}');
        return sb.toString();
    }
}
