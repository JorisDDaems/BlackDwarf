package be.intecbrussel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //WorldChunk worldChunk = new WorldChunk();
        //WorldChunk [][] worldChunk = new WorldChunk[][];
        //worldChunk.rooms = new WorldChunk[][];

        Room room = new Room(2,5);

        char[][] worldChunk = new char[Config.DEFAULT_CHUNK_SIZE][Config.DEFAULT_CHUNK_SIZE];
        String input;
        int x = 3;
        int y = 3;

/*
        - Maak een (world)chunk
                - Voeg de speler toe aan de chunk op positie 0,0
                - Loop:
        - Vraag input
                - Als input == x >> Exit programma
                - Als input in (nsew) >> verplaats speler
                - Alle andere input >> Ongeldige input
        - end loop

 */

        createPlayfield(worldChunk,x,y);
        Room.addPlayer(worldChunk,0,0);

        printPlayfield(worldChunk);


        askInput();
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        processInput(worldChunk, x,y,input);


        printPlayfield(worldChunk);

        /*
        Removing player again

        Room.removePlayer(worldChunk);
        System.out.println(Room.getWorldDisplay(worldChunk));

        printPlayfield(worldChunk);

         */

    }


    private static void createPlayfield(char [][] gamearea, int x, int y) {
        for (int i = 0; i < gamearea.length; i++) {
            for (int j = 0; j < gamearea.length; j++) {
                gamearea[i][j] = '.';
            }
        }
        gamearea[x][y] = Config.PLAYER;
    }

    private static void printPlayfield(char[][] gameArea) {
        for (char[] c : gameArea) {
            for (char k : c) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    private static void askInput(){
        System.out.println("Welcome! What direction do you want to go:");
        System.out.println("Possible directions: (N)orth, (S)outh, (E)ast, (W)est.");
        System.out.println("Press (X) to quit.");
    }

    private static void processInput(char[][] gameArea, int x, int y, String answer) {

        int upDown =0;
        int leftRight=0;

        switch (answer) {

            case "X":
                System.out.println("See you next time!");
                break;

            case "N":
                if (x > 0) {
                    upDown = -1;
                    movePawn(gameArea,x,y,upDown,leftRight);
                } else {
                    System.out.println("cant go further north");
                }
                break;

            case "S":
                if (x < gameArea.length) {
                    upDown = 1;
                    movePawn(gameArea,x,y,upDown,leftRight);
                } else {
                    System.out.println("cant go further south");
                }
                break;

            case "W":
                if (y > 0) {
                    leftRight = -1;
                    movePawn(gameArea,x,y,upDown,leftRight);
                } else {
                    System.out.println("cant go further west");
                }
                break;

            case "E":
                if (y < gameArea.length) {
                    leftRight = 1;
                    movePawn(gameArea,x,y,upDown,leftRight);
                } else {
                    System.out.println("cant go further east");
                }
                break;

            default:
                System.out.println("wrong input");
                System.out.println("\n");
                break;
        }
    }

    private static void movePawn(char[][] gameArea, int x, int y, int updown, int leftright){

        char temps = gameArea[x][y];
        gameArea[x][y] = gameArea[x + updown][y + leftright];
        gameArea[x + updown][y + leftright] = temps;

    }


}
