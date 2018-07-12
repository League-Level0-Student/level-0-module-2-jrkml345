package methods;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
String animal = JOptionPane.showInputDialog("What animal do you want?" );

	/* 2. Make it so that the user can keep entering new animals. */
if(animal.equalsIgnoreCase("cow")) {
	playMoo();  
}
if(animal.equalsIgnoreCase("dog")) {
playWoof();
}
if(animal.equalsIgnoreCase("llama")) {
playllama();
}
if(animal.equalsIgnoreCase("duck")) {
	playQuack();
}


}

void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}

void playllama() {
	playNoise(llamaFile);
}

String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 AudioClip clip = JApplet.newAudioClip(getClass().getResource(soundFile));
		 clip.play();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

