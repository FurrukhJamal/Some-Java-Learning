package Beatbox;

import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;

public class MiniMiniMusicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();

	}
	
	public void play() {
		try
		{

			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			Sequence sequence = new Sequence(Sequence.PPQ, 4);
			Track track = sequence.createTrack();
			
			ShortMessage msg1 = new ShortMessage();
			msg1.setMessage(NOTE_ON, 1, 44, 100);
			MidiEvent noteon = new MidiEvent(msg1,4);
			track.add(noteon);
			
			ShortMessage msg2 = new ShortMessage();
			msg1.setMessage(NOTE_OFF,1 ,44, 100);
			MidiEvent noteoff = new MidiEvent(msg2,16);
			track.add(noteoff);
			
			ShortMessage msg3 = new ShortMessage();
			msg3.setMessage(192, 1, 102,50);
			MidiEvent anothernote = new MidiEvent(msg3, 32);
			track.add(anothernote);
			
			
			sequencer.setSequence(sequence);
			sequencer.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}

}
