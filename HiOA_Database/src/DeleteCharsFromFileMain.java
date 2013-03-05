import java.nio.file.Path;
import java.nio.file.Paths;

import no.apto.java.util.ReadFileToString;


public class DeleteCharsFromFileMain {

public static Path path=Paths.get("schema/Createscriptfortabeller.sql");

private static char[] tegn={'[', ']'};

	public static void main(String[] args) {
		
		
		
		String msSql= ReadFileToString.returnString(path);
		
		System.out.println(msSql);
		
		String cleanSqlString= removeChars(msSql, '[');
		cleanSqlString=removeChars(cleanSqlString, ']');
		
		System.out.println(cleanSqlString);
		
		

	}
	
	public static String removeChars(String s, char c){
		String output="";
		
		
		for (int i = 0; i < s.length(); i++) {
			
		
				if (s.charAt(i)!=c) {
					output+=s.charAt(i);
					
				}
				
				
			}
			
		
		
		
		return output;
	}

}
