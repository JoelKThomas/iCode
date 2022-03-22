package com.iLearn.lowleveldesign.bookmyshow.user;

import com.iLearn.lowleveldesign.bookmyshow.movie.Movie;
import com.iLearn.lowleveldesign.bookmyshow.movie.Show;

public abstract class Admin extends Person {
    public abstract boolean addMovie(Movie movie);
    public abstract boolean addShow(Show show);
    public abstract boolean blockUser(Customer customer);

}
