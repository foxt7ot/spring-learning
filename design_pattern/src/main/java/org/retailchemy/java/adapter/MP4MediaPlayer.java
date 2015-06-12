/**
 * 
 */
package org.retailchemy.java.adapter;

/**
 * @author Ritesh Kumar 12:23:20 AM
 */
public class MP4MediaPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.err.println("Palying MP4 File : " + fileName);
	}

}
