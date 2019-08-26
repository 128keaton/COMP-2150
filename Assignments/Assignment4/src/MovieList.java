import java.util.Random;

import com.keaton.Assignment4.Movies.*;
import com.keaton.Assignment4.Movie;

public class MovieList {
    public static void main(String[] args){
        Movie[] movies = new Movie[5];

        movies[0] = new AmericanPsycho();
        movies[1] = new Speed();
        movies[2] = new ThelmaAndLouise();
        movies[3] = new Twister();
        movies[4] = new UncleBuck();

        System.out.println("---- run 1");
        printRandomMovies(movies);

        System.out.println("---- run 2");
        printRandomMovies(movies);

    }

    /**
     * Prints the passed movies array in random order
     * @param orderedMovies Array of movies
     */
    private static void printRandomMovies(Movie[] orderedMovies){
        int[] chosenIndexes = new int[orderedMovies.length];
        int loop = 1;

        Random index = new Random();


        while (loop <= orderedMovies.length){
            int randomIndex = index.nextInt(orderedMovies.length) + 1;

            if(isUnique(chosenIndexes, randomIndex)){
                Movie randomMovie = orderedMovies[randomIndex - 1];
                chosenIndexes[loop - 1] = randomIndex;
                System.out.println("Random number generated: " + (randomIndex - 1));
                Movie.displayMovieInfo(randomMovie, loop);
                loop++;
            }
        }
    }

    /**
     * Checks if an array value does not exists in the array
     * @param array Array of integers
     * @param v Element to check if exists
     * @return true if the param v does not exist, false if otherwise
     */
    private static boolean isUnique(final int[] array, final int v) {
        boolean result = true;

        for(int i : array){
            if(i == v){
                result = false;
                break;
            }
        }

        return result;
    }
}
