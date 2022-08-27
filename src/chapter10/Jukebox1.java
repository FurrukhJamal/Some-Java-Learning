package chapter10;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {

	public void go() {
		List<String> songList = MockSongs.getSongString();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
	
	public static void main(String[] args) {
		new Jukebox1().go();
		

	}

}
