package no.apto.java.util;
//Denne har en metode som tar et objekt som argument, og skriver det til en json fil.
//Ikke testet ennå
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.google.gson.Gson;

public class WriteObjectToJsonFile {


	private static Charset charset=Charset.forName("UTF-8");//for å sette karaktersett på filen

	public WriteObjectToJsonFile() throws IOException{
	}
	
	public static void writeJson(Object object){
		//Metode for å skrive et objekt til json fil
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		String formattedDate = df.format(new Date(0));
		Path targetFile=Paths.get("jsonFiles/test"+formattedDate+".json");//filen vi skal skrive til.
		
		
		Gson gson = new Gson();
		String outputJson=gson.toJson(object);
		try (BufferedWriter writer = Files.newBufferedWriter(targetFile, charset))
		{
			
			writer.write(outputJson);//skriver String til json filen
		} catch (IOException e) {
		
		}
		
		
		 
		
	}

}
