/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author nam57
 */
public class JavaApplication15 {

    static Scanner sc = new Scanner(System.in);
    static int PlayerX, PlayerY;
    static int EndX, EndY;
    static char[][] MAP = new char[5][5];
    static int Turn = 10;
    static boolean status = true;
    static int EnemyX, EnemyY;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayerX = 2;
        PlayerY = 2;

        do {
            EndX = (int) (Math.random() * 4);
            EndY = (int) (Math.random() * 4);
        } while (EndX == PlayerX && EndY == PlayerY);

        for (int x = 0; x < MAP.length; x++) {
            for (int y = 0; y < MAP[0].length; y++) {
                if (x == PlayerX && y == PlayerY) {
                    MAP[x][y] = 'X';
                } else if (x == EndX && y == EndY) {
                    MAP[x][y] = 'O';
                } else {
                    MAP[x][y] = '-';
                }
            }
        }

        while (status == true) {
            loadMap();
            char input = input();
            System.out.println("Ng dung nhap vao:" + input);
            move(input);
            check();
            if (status == false) {
                System.out.println("The End");
            }

        }
    }

    private static void loadMap() {
        for (int x = 0; x < MAP.length; x++) {
            for (int y = 0; y < MAP[0].length; y++) {
                System.out.print(MAP[x][y] + " ");
            }
            System.out.println();
        }
    }

    private static void move(char input) {
        switch (input) {
            case 'S':
                MAP[PlayerX][PlayerY] = '-';
                PlayerX = (PlayerX + 1 + 5) % 5;
                MAP[PlayerX][PlayerY] = 'X';
                break;
            case 'W':
                MAP[PlayerX][PlayerY] = '-';
                PlayerX = (PlayerX - 1 + 5) % 5;
                MAP[PlayerX][PlayerY] = 'X';
                break;
            case 'A':
                MAP[PlayerX][PlayerY] = '-';
                PlayerY = (PlayerY - 1 + 5) % 5;
                MAP[PlayerX][PlayerY] = 'X';
                break;
            case 'D':
                MAP[PlayerX][PlayerY] = '-';
                PlayerY = (PlayerY + 1) % 5;
                MAP[PlayerX][PlayerY] = 'X';
                break;
            case ' ':

        }
        Turn--;

    }

    private static void check() {

        if (Turn == 0) {
            System.out.println("You Lose");
            status = false;
        } else if (PlayerX == EndX && PlayerY == EndY && Turn > 0) {
            System.out.println("You Win");
            status = false;
        }

    }

    private static char input() {
        System.out.println("Nhap vao W/A/S/D:");
        String value = sc.nextLine();
        return value.charAt(0);

    }

}
