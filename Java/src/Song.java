import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Song implements Comparable<Song>  {

    String title;
    String artist;
    String album;

    public Song(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public String getTitle() {
        return title;

    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String toString() {
        return album;
    }


    public int compareTo(Song o) {   return album.compareTo(o.getAlbum());    }

}



class ArtistComparator implements Comparator<Song>
{
    @Override
    //public int compare(Song o1, Song o2) {  return o1.getArtist().compareTo(o2.getArtist()); }

    public int compare(Song o1, Song o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}