package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {

        Input scan = new Input();
        Movie[] movies = MoviesArray.findAll();
        int userSelection;
        do {


            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            userSelection = scan.getInt("Enter your choice: ");


            if (userSelection == 0) {
                System.out.println("Bye Felicia");
            } else if (userSelection == 1) {
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                System.out.println("---");
            } else if (userSelection == 2) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName());
                    }
                }
                System.out.println("---");
            } else if (userSelection == 3) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName());
                    }
                }
                System.out.println("---");
            } else if (userSelection == 4) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName());
                    }
                }
                System.out.println("---");
            } else if (userSelection == 5) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName());
                    }
                }
                System.out.println("---");
            }


        }while(userSelection != 0);
    }

}
