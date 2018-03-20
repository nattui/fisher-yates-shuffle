package sjsu.nguyen.cs146.project1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class MusicBestJUnit {

	// @Test
	// void test() {
	// fail("Not yet implemented");
	// }

	@Test
	public void test() throws IOException {

		@SuppressWarnings("resource")
		BufferedReader shuffledOutput = new BufferedReader(new FileReader("NguyenNhatPlaylist.txt"));
		@SuppressWarnings("resource")
		BufferedReader target = new BufferedReader(new FileReader("target2.txt"));

		String expectedLine;
		String actualLine;
		while ((expectedLine = target.readLine()) != null) {
			actualLine = shuffledOutput.readLine();
			assertEquals(expectedLine, actualLine);
		}

	}
}
