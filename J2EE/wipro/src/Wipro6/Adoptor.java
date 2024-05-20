package Wipro6;
import java.io.File;

//Step 1

interface MediaPlayer{

	public void play(String audioType,String fileName);

}

interface AdvanceMediaPlayer{

	public void playVLC(String fileName);

	public void playMp4(String fileName);

}

//step 2

class VLCPlayer implements AdvanceMediaPlayer{

	@Override

	public void playVLC(String fileName) {

		System.out.println("Playing VLC File name:"+fileName);

	}

	@Override

	public void playMp4(String fileName) {

	  //do nothing

	}

}

class Mp4Player implements AdvanceMediaPlayer{

	@Override

	public void playVLC(String fileName) {

		//do nothing

	}

	@Override

	public void playMp4(String fileName) {

		System.out.println("Playing MP4 for file name:"+fileName);

	}

}



//step 3

class MediaAdapter implements MediaPlayer{

	AdvanceMediaPlayer advanceplayer;

	public MediaAdapter(String audioType) {

		if(audioType.equalsIgnoreCase("vlc"))

			advanceplayer=new VLCPlayer();

		else if (audioType.equalsIgnoreCase("mp4"))

			advanceplayer = new Mp4Player();
		}

	@Override

	public void play(String audioType , String fileName) {

		if(audioType.equalsIgnoreCase("mp4"))

			advanceplayer.playMp4(fileName);

		else if (audioType.equalsIgnoreCase("vlc"))

			advanceplayer.playVLC(fileName);
	}

}

//step 4

class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;

	@Override

	public void play(String audioType,String fileName) {

		if (audioType.equalsIgnoreCase("mp3"))

			System.out.println("Playing Mp3 for the file name"+fileName);

		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {

			mediaAdapter = new MediaAdapter(audioType);//Runtime polymorphism is created

			mediaAdapter.play(audioType, fileName);

			}//corresponding file is created

		else

			System.out.println("Invalid Media... ");

		}

	}

//Step 5

public class Adoptor {

public static void main(String[] args) {

	AudioPlayer audioPlayer = new AudioPlayer();

	audioPlayer.play("mp3", "123 Files..");

	audioPlayer.play("mp4", "2563 Files..");

	audioPlayer.play("vlc", "vlc Files..");

	audioPlayer.play("avi", "avi Files..");

}



}




		