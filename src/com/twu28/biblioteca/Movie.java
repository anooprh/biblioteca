package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/22/12
 * Time: 8:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {

    private static final int NA = -1;

    String movieName;
    String directorName;
    int rating;
    private static final int MAX_RATING = 10;

    public Movie() {
        this.setMovieName("");
        this.setDirectorName("");
        this.setRating(-1);
    }

    public Movie(String movieName, String directorName) {
        this.setMovieName(movieName);
        this.setDirectorName(directorName);
        this.setRating(-1);
    }

    public Movie(String movieName, String directorName, int rating) {
        this.setMovieName(movieName);
        this.setDirectorName(directorName);
        this.setRating(rating);
    }


    private String getMovieName() {
        return this.movieName;
    }

    private void setMovieName(String movieName) {
        this.movieName = movieName;
        return;
    }

    private String getDirectorName() {
        return this.directorName;
    }

    private void setDirectorName(String directorName) {
        this.directorName = directorName;
        return;
    }

    private int getRating() {
        return this.rating;
    }

    private void setRating(int rating) {
        this.rating = rating;
        return;
    }

    public boolean viewMovieDetails() {
        if(this.getRating()== -1)
            System.out.println(this.getMovieName() + "\t" + this.getDirectorName()+ "\t" + "NA");
        else   {
            System.out.print(this.getMovieName() + "\t" + this.getDirectorName() + "\t" );
            for (int loop = 0 ; loop < this.getRating() ; loop++){
                System.out.print('*');
            }
            for (int loop = this.getRating() ; loop < MAX_RATING ; loop++){
                System.out.print(' ');
            }
            System.out.println(" " + this.getRating() + " / " + MAX_RATING);

        }
        return  true;
    }
}
