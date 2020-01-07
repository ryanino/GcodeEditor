import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EditGcodeZ
{
	public static void edit(String filePath) throws IOException
	{
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		String line;
		String oldStuff = "";
		String firstPart;

		//Loop to edit Gcode and write it to a String
		while((line = bufferedReader.readLine()) != null)
		{
			if(line.contains("Z-"))
			{
				firstPart = line.substring(0, 4);
				oldStuff = oldStuff + firstPart + "S1000.00" + System.lineSeparator();
			} else if(line.contains("Z"))
			{
				firstPart = line.substring(0, 4);
				oldStuff = oldStuff + firstPart + "S0" + System.lineSeparator();
			} else
			{
				oldStuff = oldStuff + line + System.lineSeparator();
			}
		}
		//Now that the Gcode has been edited, we write the String to the given file
		FileWriter fileWriter = new FileWriter(filePath);
		fileWriter.write(oldStuff);

		//Clean up
		bufferedReader.close();
		fileWriter.close();
	}
}
