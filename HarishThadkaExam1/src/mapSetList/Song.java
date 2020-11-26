/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapSetList;

/**
 *
 * @author Harish Thadka
 */
public class Song {

    private int rank;
    private String songName;
    private String artistName;
    private int year;
    private String[] genres;

    /**
     * This constructor sets instance variables with below parameters
     *
     * @param rank rank
     * @param songName song name
     * @param artistName artist name
     * @param year released year
     * @param genres genres
     */
    public Song(int rank, String songName, String artistName, int year, String[] genres) {
        this.rank = rank;
        this.songName = songName;
        this.artistName = artistName;
        this.year = year;
        this.genres = genres;
    }

    /**
     * This method returns rank of song
     *
     * @return rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * This method sets rank with given parameter
     *
     * @param rank rank of song
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * This method returns song name
     *
     * @return song name
     */
    public String getSongName() {
        return songName;
    }

    /**
     * Method sets song name with below parameter
     *
     * @param songName song name
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }

    /**
     * Method return artist name of song
     *
     * @return artist name
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Method sets artist name of song with below parameter
     *
     * @param artistName artist name
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * Method return released year of song
     *
     * @return released year
     */
    public int getYear() {
        return year;
    }

    /**
     * Method sets released year of song with below parameter
     *
     * @param year released year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Method returns array of genres of song
     *
     * @return array of genres
     */
    public String[] getGenres() {
        return genres;
    }

    /**
     * Method sets array of genres of song with below parameter
     *
     * @param genres array of genres
     */
    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    /**
     * Textual Manipulation: This method converts genres array into string
     * format
     *
     * @return genres in string format
     */
    public String getStringGenres() {
        String genresString = genres[0];
        for (int i = 1; i < genres.length; i++) {
            genresString = genresString + ", " + genres[i];
        }
        return genresString;
    }

    /**
     * Method overrides toString method and returns output in specified format
     *
     * @return String in below format
     */
    @Override
    public String toString() {

        return "Rank: " + rank + ", Song Name: " + songName + ", Artist Name: "
                + artistName + ", Released year: " + year
                + ", Genres: " + getStringGenres();
    }

}
