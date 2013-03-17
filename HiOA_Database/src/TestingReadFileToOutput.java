import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import no.apto.java.util.ReadFileToString;
//Bruker ReadFileToString
//renser opp linjene i sql script slik at de er mer brukenes til Derby

public class TestingReadFileToOutput {

	private static Path path;
	public static void main(String[] args) {
		
		path=Paths.get("schema/CreateScriptfortabeller.sql");

		
		ArrayList<String> lines= new ArrayList<>();//oppretter en tabell av String
		ArrayList<String> linesCopy= new ArrayList<>();//oppretter en tabell av String
		lines= ReadFileToString.readFileToArray(path);//henter inn filen til en array, linje for linje
		
		
		Iterator<String> iterator = lines.iterator();
		while (iterator.hasNext()) {
			String temp = (String) iterator.next();
			temp=ReadFileToString.cleanUp(temp);//fjerner [ og ] fra linjen
			linesCopy.add(temp);//legger til clean linje
			
		}
		
		
		ReadFileToString.writeFile(linesCopy);//skriver ut linje for linje, cleaned
	}

}
