package Beatbox;
import javax.sound.midi.*;

public class MusicTest1 {

	public void play() {
		try
		{
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("sequencer created");
		}
		catch(MidiUnavailableException e)
		{
			System.out.println("Something went wrong");
		}
		
		
	}
	
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();

	}

}
