/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapSetList;

import java.io.FileNotFoundException;

/**
 *
 * @author Harish Thadka
 */
public class SongDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException Exception thrown if file not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        SongList songList1 = new SongList();
        songList1.addSongs();
        songList1.displaySongs();

        System.out.println("\n*************************STATISTICAL METHODS********************");

        System.out.println("*****Unique Genre Sort Method*******");
        songList1.uniqueGenresSort();

        System.out.println("\n*****Genres frequency Method*******");
        System.out.println("Frequency of genres of all the songs: \n" + songList1.genresFrequency());
        System.out.println("Number of distinct Genres: " + songList1.genresFrequency().size());

        System.out.println("\n*****Most used Genre Method*******");
        songList1.mostUsedGenre();

        System.out.println("\n*****Find old songs Method*******");
        songList1.findOldSongs(1970);

        System.out.println("\n*****Song starts with Method*******");
        songList1.songsStartsWith('S');

        System.out.println("\n*****Music player Method*******");
        songList1.musicPlayer("SHAPE OF YOU");

        System.out.println("\n********************TEXTUAL MANIPULATION METHODS****************");

        System.out.println("\n*********Format Genre method with example******** ");
        String misFormatGenre = "pOp, lAtin rOck, danCe, elEctroNic";
        String[] genres = songList1.formatGenres(misFormatGenre);
        for (int i = 1; i < genres.length; i++) {
            System.out.println(i + " " + genres[i]);
        }

        System.out.println("\n*******Song remove method by song name*********");
        songList1.removeSongbyName("THE TWIST");
        songList1.removeSongbyName("MACK THE KNIFE");
        songList1.removeSongbyName("SHAPE OF YOU");
        songList1.removeSongbyName("HOW DEEP IS YOUR LOVE");
        songList1.removeSongbyName("TOO CLOSE");
        System.out.println("After removing songs from songs list:");
        songList1.displaySongs();

        System.out.println("\n********Rank Update method************");
        songList1.rankUpdate();
        System.out.println("After invoke rank update method:");
        songList1.displaySongs();

        System.out.println("\n*********Songs name lower case method********");
        songList1.songNameLowerCase();
        System.out.println("After invoke song name lower case method");
        songList1.displaySongs();

        System.out.println("\n*********Artist name replace method**********");
        songList1.artistNameReplace('a', 'Z');
        System.out.println("After invoke Artist name replace method");
        songList1.displaySongs();

    }
}
