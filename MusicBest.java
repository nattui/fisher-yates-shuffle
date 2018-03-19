package sjsu.nguyen.cs146.project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class MusicBest {

	// Shuffles the playlist
	public static void shuffle(String[] array) {
		int n = array.length;

		Random r = new Random();
		r.setSeed(20);
		for (int i = n - 1; i > 0; i--) {

			// returns range 0 to i-1
			int j = r.nextInt(i);

			// Swaps
			String temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	public static void main(String[] args) throws IOException {
		// Unshuffled Songs
		BufferedReader br1 = new BufferedReader(new FileReader("Playlist.txt"));

		// For initial size
		int lineNum = 1;
		while (br1.readLine() != null) {
			lineNum++;
		}

		br1.close();

		BufferedReader br2 = new BufferedReader(new FileReader("Playlist.txt"));

		// Creates the playlist in Array
		String[] a = new String[lineNum];
		int count = 0;
		while ((a[count] = br2.readLine()) != null) {
			count++;
		}

		br2.close();

		a = Arrays.copyOf(a, a.length - 1);

		// Print each songs
		for (int i = 0; i < a.length; i++) {
			// System.out.println(i+1 + ": " + a[i]);
		}

		// Shuffles the playlist
		shuffle(a);

		// Print shuffled playlist
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + 1 + ": " + a[i]);
		}

		// Creates the new playlist
		PrintWriter pw = new PrintWriter("NguyenNhatPlaylist.txt");
		for (int i = 0; i < a.length; i++) {
			pw.println(a[i]);
		}
		pw.close();

	}
}
