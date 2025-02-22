package ie.tudublin;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class DANI extends PApplet {

	String[] words;
	String[] line;

	public void settings() {
		size(1000, 1000);
		// fullScreen(SPAN);
	}

	String[] sonnet;

	public String[] writeSonnet() {
		return null;
	}

	public void setup() {
		colorMode(HSB);
		loadFile();
		PrintModel();

	}

	public void loadFile() {
		line = loadStrings("small.txt");
		List<String> wordsList = new ArrayList<>();
		for (int i = 0; i < line.length; i++) {
			System.out.println(line[i]);
			String[] words = split(line[i], ' ');
			for (int j = 0; j < words.length; j++) {
				// words[j].replaceAll("[^\\w\\s]","");
				wordsList.add(words[j].toLowerCase());
			}
		}
		words = wordsList.toArray(new String[0]); // Assign the array to global variable
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public void PrintModel() {
		for (int i = 0; i < words.length - 1; i++) { // Use words.length - 1 to avoid out-of-bounds error
			int count = findWord(words[i]);
			System.out.println(words[i] + ": " + words[i + 1] + "(" + count + ")");
		}

	}

	public int findWord(String s) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (s.equals(words[i])) { // Use equals() method to compare strings
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Word not found");
		}
		return count;
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
		textAlign(CENTER, CENTER);
		// loadFile();

	}
}
