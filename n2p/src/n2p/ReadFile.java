package n2p;



/**
 *
 * @author zangsir
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile{

	BufferedReader bufferedReader;
	FileReader fileReader;
	
	String path;
	

	

	public ReadFile(String input_path) {
		path = input_path;
	}


	public String[] OpenFile() throws IOException{
		int numberOfLines = ReadLines();
		String[ ] textData = new String[numberOfLines];
		
		fileReader = new FileReader(path);
		bufferedReader = new BufferedReader(fileReader);
		
		int i;

		for (i=0; i < numberOfLines; i++)
		{
			textData[ i ] = bufferedReader.readLine();
		}
		//each line goes into a member of the string array
        //each element in string array is a line of text
		bufferedReader.close();
		return textData;
	}

	public int ReadLines() throws IOException
	{
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int numberOfLines = 0;
		
		while ( ( aLine = bf.readLine( ) ) != null )
		{
			numberOfLines++;
		}
		
		bf.close();
		
		return numberOfLines;
	}
	
}

