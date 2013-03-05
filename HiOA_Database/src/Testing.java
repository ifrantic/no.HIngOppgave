import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DatabaseMetaData;

import no.apto.java.util.ReadFileToString;


public class Testing {

	private static Path path=Paths.get("schema/DerbyPerson.sql");//finner sti til scrip for opprettelse av tabellen
//scriptCreateMAS120_EMPLOYEE_TAB
	
	public static void main(String[] args) throws IOException {
		
	
		String defaultCharacterEncoding = System.getProperty("file.encoding");
		System.out.println(defaultCharacterEncoding);
		
		String output= ReadFileToString.returnString(path);
		//System.out.println(output);
		System.out.println(path.toString());
		System.out.println(path.getFileName());
		
		
		Path realPath=path.toRealPath(LinkOption.NOFOLLOW_LINKS);
		System.out.println(realPath);
	System.out.println(output);
	System.out.println("########################");
	
		
		
		

	}

}
