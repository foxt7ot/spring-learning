/**
 * 
 */
package org.retailchemy.java.adapter;

/**
 * @author Ritesh Kumar 12:34:23 AM
 */
public class MediaPlayerAdapter implements MediaPlayer {
	AdvanceMediaPlayer amp;

	public MediaPlayerAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			amp = new VlcMediaPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			amp = new MP4MediaPlayer();
		} else {

		}
	}

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("vlc")) {
			amp.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			amp.playMp4(fileName);
		}

	}

}
