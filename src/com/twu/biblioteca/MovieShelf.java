package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieShelf {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<Movie> rentoutMovies = new ArrayList<Movie>();
    public MovieShelf(){
        for (int i=0; i<6; i++)
        {
            int initial_yy = 2000;
            Movie currentMovie  = new Movie("Movie"+(i+1),"Author"+(i+1), i +initial_yy,i );
            this.movies.add(i,currentMovie);
        }

    }
    public MovieShelf(ArrayList<Movie> movies){
        this.movies = movies;
    }

    public void printBooksName() {
        System.out.println("Currently available books are: ");
        System.out.printf("%10s     %10s     %10s    %4s\n","Book Id","Book Name","Author","Year");
        for (Movie movie : movies)
        {
            System.out.printf("%10d     %10s     %10s    %4d\n",movie.getId(), movie.getName(),movie.getAuthor(),
                    movie.getPublishedYear());
        }
    }
    public boolean checkoutBook(int index) {
        for (Movie movie : this.movies) {
            //Check the existence of the movie
            if (movie.getId() == index) {
                this.rentoutMovies.add(movie);
                this.movies.remove(movie);
                return true;
            }
        }return false;
    }
    public boolean returnBook(int index) {
        for (Movie movie : this.rentoutMovies) {
            //Check the existence of the book
            if (movie.getId() == index) {
                this.movies.add(movie);
                this.rentoutMovies.remove(movie);
                return true;
            }
        }return false;
    }
}
