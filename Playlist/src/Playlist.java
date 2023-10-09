import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
// A program creating and manipulating a playlist
    // Practicing with Arraylist

    public static void main(String[] args){

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // Creating a new playlist for my holiday
        desertIslandPlaylist.add("Cold as Ice - Foreigner");
        desertIslandPlaylist.add("Henry Lee - Nick Cave and the Bad Seeds");
        desertIslandPlaylist.add("Bulletproof - La Roux");
        desertIslandPlaylist.add("I Can't Dance - Genesis");
        desertIslandPlaylist.add("Iris - The Goo Goo Dolls");
        desertIslandPlaylist.add("Impossible - Nothing But Thieves");
        desertIslandPlaylist.add("Feel Good Inc. - Gorillaz");

        System.out.println(desertIslandPlaylist);

        // Cutting down to 5 songs, checking size
        System.out.println(desertIslandPlaylist.size());

        // Removing songs, checking size again
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(3);
        System.out.println(desertIslandPlaylist.size());

        // Swapping the order around
        System.out.println(desertIslandPlaylist.indexOf("I Can't Dance - Genesis"));
        System.out.println(desertIslandPlaylist.indexOf("Cold as Ice - Foreigner"));
        desertIslandPlaylist.set(0, "I Can't Dance - Genesis");
        desertIslandPlaylist.set(2, "Cold as Ice - Foreigner");
        System.out.println(desertIslandPlaylist);

        //Shuffling the list
        Collections.shuffle(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);

        //Reversing list order
        Collections.reverse(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);
    }
}
