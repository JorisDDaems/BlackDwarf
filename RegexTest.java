package be.intecbrussel;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String direction ;
        String regex = "[N,S,E,W,X]";

        do {
            System.out.println("ask input");
            direction = scan.nextLine();
        } while (!Pattern.matches(Config.INPUT,direction));


        System.out.println(Pattern.matches(Config.INPUT, direction));



    }
}
