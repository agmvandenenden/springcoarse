package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	// create an array of Strings to hold the data from the file
	private List<String> data = new ArrayList<String>();
	
	@PostConstruct
	public void readFile () {
		
		// print message
		System.out.println(">>FileFortuneService: inside (PostConstruct)readFile");
		
		// read file
		BufferedReader br = null;
				
		try {
			// copy content fortunes.txt
			br = new BufferedReader(new FileReader("fortunes.txt"));
			String regel = br.readLine();
			while ( regel != null) {
				data.add(regel);				
				regel = br.readLine();
			}
		}
		catch (FileNotFoundException ex) {
			System.out.println("bestand niet gevonden");
		}
		catch (IOException ex) {
			System.out.println("IOException");
		}
		finally {
			if (br != null) {
				try {
					br.close();
				}
				catch (IOException ex) {}
				}
			}
	}
	
	@Override
	public String getFortune() {
		// pick a random fortune from the array
		// create a random number generator
	    Random myRandom = new Random();
		int index = myRandom.nextInt(data.size());
		String theFortune = data.get(index);
				return theFortune;
	}

}
