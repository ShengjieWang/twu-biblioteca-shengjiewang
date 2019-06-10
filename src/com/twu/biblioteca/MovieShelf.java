package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Random;

public class MovieShelf {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<Movie> rentoutMovies = new ArrayList<Movie>();
    public MovieShelf(){
        Random randomGenerator = new Random();
        for (int i=0; i<6; i++)
        {
            int initial_yy = 2000;
            int rating = randomGenerator.nextInt(10) + 1;
            Movie currentMovie  = new Movie("Movie"+(i+1),"Director"+(i+1), i +initial_yy,i,
                    rating);
            this.movies.add(i,currentMovie);
        }

    }
    public MovieShelf(ArrayList<Movie> movies){
        this.movies = movies;
    }

    public void printMoviesName() {
        System.out.println("Currently available movies are: ");
        System.out.printf("%10s     %10s    %4s     %10s    %10s\n","Movie Id","Movie Name","Year","Director","Rating");
        for (Movie movie : movies)
        {
            System.out.printf("%10d     %10s     %4d    %10s    %10d\n",movie.getId(), movie.getName(),movie.getPublishedYear(),
                    movie.getDirector(),movie.getRating());
        }
    }
    public boolean checkoutMovie(int index) {
        for (Movie movie : this.movies) {
            //Check the existence of the movie
            if (movie.getId() == index) {
                this.rentoutMovies.add(movie);
                this.movies.remove(movie);
                return true;
            }
        }return false;
    }
    public boolean returnMovie(int index) {
        for (Movie movie : this.rentoutMovies) {
            //Check the existence of the movie
            if (movie.getId() == index) {
                this.movies.add(movie);
                this.rentoutMovies.remove(movie);
                return true;
            }
        }return false;
    }
}
