import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Map
{
    private char mapArray[];
    public Map(String fileName)
    {
	try {
	    File myObj = new File(fileName);
	    Scanner myReader = new Scanner(myObj);
	    int i = 0;
	    int j;
	    while (myReader.hasNextLine()) {
		j = 0;
		String line = myReader.nextLine();
		for(char c: line) {
		    mapArray[i][j] = c;
		    j++;
		}
		i++;
	    }
	    myReader.close();
	} catch (FileNotFoundException e) {
	    System.out.println("An error occurred.");
	    e.printStackTrace();
	}
    }
}
