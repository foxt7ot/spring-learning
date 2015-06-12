/**
 * 
 */
package org.retailchemy.java.adapter;

/**
 * @author Ritesh Kumar 12:43:24 AM
 */
public class AudioPlayer implements MediaPlayer {

	MediaPlayerAdapter mediaPlayerAdapter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.retailchemy.java.adapter.MediaPlayer#play(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		// Inbuilt Support to play mp3 file
		if (audioType.equalsIgnoreCase("mp3")) {
			System.err.println("Playing mp3 file :" + fileName);
		} else if (audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4")) {
			mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
			mediaPlayerAdapter.play(audioType, fileName);
		} else {
			System.err.println("Invalid Media :" + audioType
					+ " not supported....");
		}
	}

}
