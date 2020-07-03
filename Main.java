package be.intecbrussel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] gameArea = new char[10][10];
        int x = 3;
        int y = 3;
        String answer;

        createPlayfield(gameArea,x,y);
        printPlayfield(gameArea);

        askInput();
        Scanner scan = new Scanner(System.in);
        answer = scan.nextLine();

        processInput(gameArea, x,y,answer);
        printPlayfield(gameArea);

    }


    private static void createPlayfield(char[][] gamearea, int x, int y) {
        for (int i = 0; i < gamearea.length; i++) {
            for (int j = 0; j < gamearea.length; j++) {
                gamearea[i][j] = '.';
            }
        }
        gamearea[x][y] = '@';
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
