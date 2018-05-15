package rappi.solozano.app.pruebarappi.Model;

import java.util.ArrayList;

public class Movie {

    private int ID;
    private int vote_count;
    private int vote_average;
    private String title;
    private int popularity;
    private String lenguage;
    private String original_title;
    private ArrayList<Genre> genre_ids;
    private String poster_path;
    private String backdrop_path;
    private boolean adult;
    private String overview;
    private String release_date;

    public Movie (){}
    public Movie(int ID, int vote_count, int vote_average, String title, int popularity, String lenguage, String original_title, ArrayList<Genre> genre_ids, String poster_path, String backdrop_path, boolean adult, String overview, String release_date) {
        this.ID = ID;
        this.vote_count = vote_count;
        this.vote_average = vote_average;
        this.title = title;
        this.popularity = popularity;
        this.lenguage = lenguage;
        this.original_title = original_title;
        this.genre_ids = genre_ids;
        this.poster_path = poster_path;
        this.backdrop_path = backdrop_path;
        this.adult = adult;
        this.overview = overview;
        this.release_date = release_date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public int getVote_average() {
        return vote_average;
    }

    public void setVote_average(int vote_average) {
        this.vote_average = vote_average;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public ArrayList<Genre> getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(ArrayList<Genre> genre_ids) {
        this.genre_ids = genre_ids;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}
