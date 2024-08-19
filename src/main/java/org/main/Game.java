package org.main;

import org.board.Board;
import org.math.Orientator;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        System.out.println("--- Welcome to 3D Chess ---");
        System.out.println("1. Pass and Play\n" +
                "2. Play against AI\n" +
                "3. Rules");

        char input;
        boolean validInput = false;
        while(!validInput) {
            try {

                BufferedReader br =
                        new BufferedReader(new InputStreamReader(System.in));
                input = (char) br.read();
                switch(input){
                    case '1':
                        validInput = true;
                        Board board = new Board(new Board.Dimension(8, 8, 8),
                                        new Orientator());


                    case '2':
                        System.out.println("Unavailable in this current version!");

                        System.out.println("\n\n\n--- Welcome to 3D Chess ---");
                        System.out.println("1. Pass and Play\n" +
                                "2. Play against AI\n" +
                                "3. Rules");
                    case '3':
                        try(FileReader fr = new FileReader("src/main/RULES.txt")){
                            int c;
                            while((c = fr.read()) != -1) System.out.print((char) c);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("\n\n\n--- Welcome to 3D Chess ---");
                        System.out.println("1. Pass and Play\n" +
                                "2. Play against AI\n" +
                                "3. Rules");
                }
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }

    }

    private static String play(String input){
        return "";
    }
}