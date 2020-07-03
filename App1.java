package be.intecbrussel;

public class App1 {
    public static void main(String[] args) {

        Room room = new Room(2,5);

        char[][] gameArea = new char[0][];

        room.containsPlayer(gameArea);

    }
}
