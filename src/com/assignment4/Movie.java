package com.assignment4;

public class Movie {
    private String name;
    private String oneLiner;
    private String starringActor;


    public Movie(String name, String oneLiner, String starringActor){
        this.name = name;
        this.oneLiner = oneLiner;
        this.starringActor = starringActor;
    }

    public static void displayMovieInfo(Movie m, int number){
        System.out.println("Movie #" + number + ": " + m.name);
        System.out.println("A One-Liner: " + m.oneLiner);
        System.out.println("Actor: " + m.starringActor);
        System.out.println();
    }
}
