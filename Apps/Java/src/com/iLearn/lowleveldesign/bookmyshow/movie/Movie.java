package com.iLearn.lowleveldesign.bookmyshow.movie;

import com.iLearn.lowleveldesign.bookmyshow.user.Admin;

import java.util.Date;
import java.util.List;

public abstract class Movie {
    private String title;
    private String description;
    private int durationHours;
    private String language;
    private String genre;
    private String country;
    private Date releaseDate;
    private Admin addedBy;
    List<Show> shows;

    public abstract List<Show> getShows();
}
