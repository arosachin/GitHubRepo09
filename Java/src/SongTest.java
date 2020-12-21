import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SongTest {

    public static void main(String[] args) throws IOException {

        ArrayList<Song> songList = new ArrayList<>();
        TreeSet<Song> ts = new TreeSet<>();
        ArtistComparator artistComparator = new ArtistComparator();
        TreeSet<Song> tArtistSet = new TreeSet<>(artistComparator);


        String line ;

        try ( BufferedReader br = new BufferedReader(new FileReader("D:\\JavaIO\\InputFile.txt")) )
        {
            while( (line = br.readLine()) != null)
            { String[] myarray = line.split("/");
                Song s = new Song(myarray[0],myarray[1],myarray[2]);
                ts.add(s);
                //songList.add(s);
            }
        }



        tArtistSet.addAll(ts);

        System.out.println(ts);
        System.out.println(tArtistSet);

        System.out.println("First element is : "  + ts.first());
        System.out.println("Last element is : "  + ts.last());

        System.out.println("Comparator is : "  + tArtistSet.comparator() + "\n" );

        //Collections.sort(songList);
        //System.out.println(songList);

        //Collections.sort(songList,artistComparator);
        //System.out.println(songList);

    }


}
