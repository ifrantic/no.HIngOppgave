package no.apto.java.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
//Denne klassen har en metode som tar en fil som argument, og returnerer en String
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadFileToString {
private static	String line ="";//string for å holde hver linje av filen, midlertidig
private static String tekst="";

public static String defaultCharacterEncoding = System.getProperty("file.encoding");//finner default encoding for systemet, for å sette dette til filen
public static Charset charset= Charset.forName(defaultCharacterEncoding);//definerer charset for filen, fikk kun feilmeldinger ved å bruke utf-8


	public ReadFileToString(){	
		
	}
	
	
	//metode som tar en fil som argument, returnerer en String av innholdet i filen.
	//fungerer ikke, trenger den heller ikke. bedre med array
	public static String returnString(Path source){
		final Path fil=source;		//legger sti til angitt fil 
		String output="";
		
	
		ArrayList<String> lines = readFileToArray(fil);
		
		try //(BufferedWriter writer = Files.newBufferedWriter(path, cs, options)
		{
			Iterator<String> iterator =lines.iterator();//oppretter en iterator for å loope gjennom tabellen med linjer fra filen
			output=output+iterator.next(); //legger hver linje med tekst fra filen til String output
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		//System.out.println("ReadFileToString metoden "+ output);
		
		return output; //returnerer en String av tekst ut fra innholdet i filen
	}


	//leser en fil, returnerer en array av strings hvor hver linje er en rad
	public static ArrayList<String> readFileToArray(Path fil) {
		ArrayList<String> lines= new ArrayList<>();//oppretter en tabell av String
		
		try (BufferedReader reader = Files.newBufferedReader(fil, charset))//deklarerer og initialiserer bufferedreader
		{
		
			while ((line=reader.readLine())!=null) {//loop gjennom filen for å lese hver enkelt linje og legge hver linje i en tabell
				//System.out.println(line);
				lines.add(line);
			}
		} catch (IOException e) {
			System.err.println(e.getMessage()+" " + e.getCause());
		}//ferdig å lese filen
		return lines;
	}
	
	//skriver ut filen, linje for linje
	public static void writeFile(ArrayList<String> lines){
		
		try 
				//BufferedWriter writer =Files.newBufferedWriter(path, charset);
				
		{
			Iterator<String> iterator =lines.iterator();
			while (iterator.hasNext()) {
				String s=iterator.next();
				System.out.println(s);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

	//fjerner alle ] og [ fra tekstlinjen, returnerer tekstlinjen
public static String cleanUp(String s){
	String output="";
	
	
	for (int i = 0; i < s.length(); i++) {
		//fjerner alle ] og [ fra tekstlinjen
		if (s.charAt(i)!='[' && s.charAt(i)!=']') {
			output+=s.charAt(i);
			
		}		
	}
	return output;
}


}
