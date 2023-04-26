package ie.tudublin;
 
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	String[] words;
	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();

       
	}
	public void loadFile(){
		String[] line=loadStrings("small.txt");
		for(int i=0;i<line.length;i++)
		{
			words = split(line[i],' ');
			words[i].replaceAll("[^\\w\\s]","");
			words[i].toLowerCase();
		}
		
	}

	public String findWord(String s){
		int count=0;
		for (int i=0;i<words.length;i++)
		{
			if(s==words[i])
			{
				count++;
				return words[i];
			}
			if(count==0){
				return "Word not found";
			}
		}
		return null;//"Word not found";
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
		//loadFile();
		
        
	}
}
