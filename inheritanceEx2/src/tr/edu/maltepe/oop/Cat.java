package tr.edu.maltepe.oop;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class Cat {
    private String catName;
    public Cat(String catName){
        this.catName=catName;

    }
    public String getCatName(){ return catName;}

    public void speak(){

        try {
            // Load the sound file (replace "meow.wav" with the correct path if needed)
            File soundFile = new File("/Users/ensar/IdeaProjects/sounds/cat.wav");

            // Create an AudioInputStream from the sound file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            // Get a sound clip resource
            Clip clip = AudioSystem.getClip();

            // Open the audio stream for the clip
            clip.open(audioStream);

            // Play the sound clip
            clip.start();

            // Sleep the thread while the sound is playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
