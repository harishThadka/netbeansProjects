/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapSetList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Harish Thadka
 */
public class SongList {

    private LinkedList<Song> songList;

    /**
     * This Constructor sets instance variable to empty linked list
     */
    public SongList() {
        songList = new LinkedList<>();
    }

    /**
     * This method returns song list of all song objects
     *
     * @return song list
     */
    public LinkedList<Song> getSongList() {
        return songList;
    }

    /**
     * This method reads required song details from text file using scanner
     * object then creates instance of song object with details and adds each
     * song object into song list.
     *
     * @throws FileNotFoundException Exception thrown if file not found
     */
    public void addSongs() throws FileNotFoundException {

        Scanner scan = new Scanner(new File("songs_15.txt"));
        while (scan.hasNext()) {
            int rank = scan.nextInt();
            scan.nextLine();// To move scanner cursor to the next line
            String songName = scan.nextLine();
            String artistName = scan.nextLine();
            int year = scan.nextInt();
            scan.nextLine();// To move scanner cursor to the next line
            String misFormatgenres = scan.nextLine();
            // Calling formatGenre method to format genres properly refer below method
            String[] genres = formatGenres(misFormatgenres);
            Song song = new Song(rank, songName, artistName, year, genres);
            songList.add(song); // Adding song object in song list
        }
    }

    /**
     * This method iterate song list using for-each loop and prints all the
     * songs details such as rank, song name, artist name, released year, genres
     * by using toString method of song object
     */
    public void displaySongs() {

        System.out.println("*******Displaying " + songList.size()
                + " songs from song list********");
        // Printing songs list from linked list of song objects 
        for (Song song : songList) {
            System.out.println(song);
        }
        System.out.println("***************End of song list***************");
    }

    /**
     * Textual Manipulation: This method used to format genres. It takes input
     * as string and split by comma then string converts to array. After, it
     * removes extra leading and trailing spaces from array of genres. Finally,
     * all genres converted to lower case words and returns array of genres.
     *
     * @param misFormatgenres genres in misformat
     * @return array of genres
     */
    public String[] formatGenres(String misFormatgenres) {

        String[] extraSpacesGenre = misFormatgenres.split(",");
        String[] genres = new String[extraSpacesGenre.length];
        for (int i = 0; i < extraSpacesGenre.length; i++) {
            genres[i] = extraSpacesGenre[i].trim().toLowerCase();
        }
        return genres;
    }

    /**
     * Textual Manipulation: This method finds particular song object from songs
     * list by using song name as parameter and removes it. Firstly, initialize
     * a variable of type list iterator for song list using list iterator method
     * then iterates using while then checks whether each song name from songs
     * list matches with the given song name. If song name matches then it
     * removes and prints Success message and break the loop
     *
     * @param songName Removed song name
     */
    public void removeSongbyName(String songName) {

        // List iterator to iterate through linked list
        ListIterator<Song> myIterator = songList.listIterator();
        while (myIterator.hasNext()) {
            Song song = myIterator.next();
            if (song.getSongName().equalsIgnoreCase(songName)) {
                myIterator.remove();
                System.out.println("Sucess: " + songName + " song with rank "
                        + song.getRank() + " is removed from song list");
                break;
            }
        }
    }

    /**
     * Textual Manipulation: This method updates serially rank after removal of
     * songs. Firstly, it initialize a count variable with value zero and
     * iterate song list using for-each loop and increasing count by 1 and
     * updating same to song rank using setter method
     */
    public void rankUpdate() {
        int count = 0;
        for (Song song : songList) {
            count++;
            song.setRank(count);
        }
    }

    /**
     * Textual Manipulation: This method updates all songs name to lower case.
     * Iterate song list using for-each loop and retrieve song name from song
     * object then changing to lower case and updating using setter method.
     */
    public void songNameLowerCase() {

        for (Song song : songList) {
            song.setSongName(song.getSongName().toLowerCase());
        }

    }

    /**
     * Textual Manipulation: This method replaces target character with replace
     * character and replaces special character with underscore. Firstly,
     * iterate song list using for-each loop then initialize a variable of type
     * String with value of artist name in lower case and replace target
     * character with replace character. Also, replaces any special characters
     * with underscore using replace All method. Finally, last artist name sets
     * to song object using setter method.
     *
     * @param target target character
     * @param replace replace character
     */
    public void artistNameReplace(char target, char replace) {

        for (Song song : songList) {
            String artistName = song.getArtistName().toLowerCase();
            artistName = artistName.replace(target, replace);
            // \\W is regex for any special characters such as .!?_ etc.
            artistName = artistName.replaceAll("\\W", "_");
            song.setArtistName(artistName);
        }
    }

    /**
     * Statistical Method: This method find unique genres of all the songs in sorted order.
     * Firstly, create a variable of type set then iterate song list using
     * For-each loop, Again in for-each loop iterate genres using for-each loop
     * then add each genre to set variable.
     */
    public void uniqueGenresSort() {

        // Tree set is created to find unique elements of all genres in sorted order
        Set<String> uniqueGenres = new TreeSet<>();

        for (Song song : songList) {
            for (String genre : song.getGenres()) {// Iterate genres using for-each loop
                uniqueGenres.add(genre); // set adds only unique elements
            }
        }

        System.out.println("Unique Genres of all the songs: \n" + uniqueGenres);
    }

    /**
     * Statistical Method: This method finds frequency of genres of all the
     * songs and returns it. Firstly, create a variable of type Map with
     * arguments as String and integer then iterate through song list using
     * for-each loop, again iterate through genres using for-each loop. Here,
     * Check whether genre is found in map or not if not found add genre to map
     * with count 1 else add genre with increase count + 1. By this way,
     * frequency of genre can be found.
     *
     * @return mao of genres frequency
     */
    public Map<String, Integer> genresFrequency() {

        // Map created to find frequency of genres of all the songs
        Map<String, Integer> hashFreqGenre = new HashMap<>();

        for (Song song : songList) {
            for (String genre : song.getGenres()) {
                // Chceking whether respected genre contained in map or not
                if (hashFreqGenre.containsKey(genre)) {
                    Integer count = hashFreqGenre.get(genre) + 1;
                    hashFreqGenre.put(genre, count);
                } else {
                    hashFreqGenre.put(genre, 1);
                }
            }
        }

        return hashFreqGenre;
    }

    /**
     * Statistical Method: This method find most used genre with max count of
     * all the songs. Firstly, initialize a variable of type map with arguments
     * as string and integer, with value genres frequency method. Next,
     * initialize 2 variables of type integer and string with value 0 and empty.
     * Iterate through map and checks whether max count greater than other
     * previous max count and assign max value and count to the variables.
     * Finally, prints most used genre and max count.
     */
    public void mostUsedGenre() {

        // Map create to find most used genre from genresFrequency method
        Map<String, Integer> hashFreqGenre = genresFrequency();
        int maxCount = 0;
        String usedGenre = "";
        // Each key and values of hash map iterates using for-each loop
        for (Map.Entry<String, Integer> map : hashFreqGenre.entrySet()) {
            if (maxCount < map.getValue()) {
                maxCount = map.getValue();
                usedGenre = map.getKey();
            }
        }
        System.out.println("Most used genre of all the songs is '"
                + usedGenre.toUpperCase() + "' with maximum frequency " + maxCount);
    }

    /**
     * Statistical Method: This method finds the songs with released year less
     * than given year and prints it.Create a variable of count with value zero
     * and type list iterator with value song list using list iterator method
     * then iterate through song list using while and checks whether song
     * release year less than given year, if true then increases count and
     * prints song name, count and year.
     *
     * @param beforeYear release before year
     */
    public void findOldSongs(int beforeYear) {

        System.out.println("List of songs before released before year " + beforeYear);
        int count = 0;
        // List iterator to iterate through linked list
        ListIterator<Song> myIterator = songList.listIterator();
        while (myIterator.hasNext()) {
            Song song = myIterator.next();
            // Checking song release year less than given year or not
            if (song.getYear() < beforeYear) {
                count++;
                System.out.println(count + ". " + song.getSongName()
                        + " is release in the year " + song.getYear());
            }
        }
    }

    /**
     * Statistical Method: This method finds all songs starts with the given
     * letter and prints it. Initialize a variable count of type integer with
     * value zero then iterate song list using for-each loop. Inside loop,
     * initialize a variable of type char to store first letter of song name
     * with lower case then checks with given letter , if true increases count
     * and prints count and song name.
     *
     * @param letter target letter
     */
    public void songsStartsWith(char letter) {

        System.out.println("List of songs starts with letter '" + letter + "'");
        int count = 0;
        for (Song song : songList) {
            char songFirstLetter = song.getSongName().toUpperCase().charAt(0);
            if (songFirstLetter == letter) {
                count++;
                System.out.println(count + ". " + song.getSongName());
            }
        }

    }

    /**
     * Statistical Method: This method finds particular song and prints required
     * details of song.It acts like a music player in mobile app. Firstly, list
     * iterator instance is created for song list using list iterator method
     * then iterate instance using while then checks whether matching with song
     * name if matches prints required details such as song name, artist name,
     * released year, genres.
     *
     * @param playSong Play song
     */
    public void musicPlayer(String playSong) {

        System.out.println("Song details: ");

        // List iterator to iterate through linked list
        ListIterator<Song> myIterator = songList.listIterator();
        while (myIterator.hasNext()) {
            Song song = myIterator.next();
            // checks whether song name matching with given name by ignoring case
            if (song.getSongName().equalsIgnoreCase(playSong)) {
                System.out.println("Playing song: " + song.getSongName());
                System.out.println("Artist Name: " + song.getArtistName());
                System.out.println("Released Year: " + song.getYear());
                System.out.println("Genres: " + song.getStringGenres());
                break;
            }
        }
    }

}
