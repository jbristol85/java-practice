package com.joshbristol;

public class Main {

    public static void main(String[] args) {
    int newScore = calculateScore("Josh", 20);
        System.out.println(newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName +"Scored "+ score + " Points");
        return score *1000;
    }

    public static int calculateScore( int score){
        System.out.println("Unnamed Player Scored "+ score + " Points");
        return score *1000;
    }

    public static int calculateScore(){
        System.out.println("no player and no score");
        return 0;
    }

}
