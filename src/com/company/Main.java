package com.company;
import java.util.*;
import java.lang.*;
public class Main {


        public static void main(String[] args) {
            System.out.println("Enter Status:");
            Scanner in = new Scanner(System.in);
            enemy baddy = new enemy();
            Player daguy = new Player();
            while (baddy.enemyHealth > 0) {
                String userInput = in.nextLine();
                ArrayList<String> moves = new ArrayList<>();
                moves.add("punch");
                moves.add("kick");
                moves.add("slam");
                moves.add("boom");
                if (moves.contains(userInput)) {
                    baddy.enemyHealth = baddy.enemyHealth - daguy.playerAttack;
                    System.out.println(baddy.enemyHealth);

                }
            }
        }

    }

