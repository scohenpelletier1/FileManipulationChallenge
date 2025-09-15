import java.io.*;

public class FileHandlingActivity {
    // creates a directory
    public static void makeDirectory(String directoryPath) {
        File mainDir = new File(directoryPath);
        mainDir.mkdir();

    }

    // creates text files
    public static void makeFile(String filePath) throws IOException {
        File file = new File(filePath);
        file.createNewFile();
    
    }
    
    public static void writeFile(String filePath, String message) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(message);
        writer.close();
    
    }

    public static String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        String contents = "";

        while ((line = reader.readLine()) != null) {
            contents += line;

        }

        reader.close();
        return contents;
    
    }

    public static void cloneFile(String newFile, String oldFile) throws IOException {
        // get to the end of the new file so you don't overwrite anything
        BufferedReader newReader = new BufferedReader(new FileReader(newFile));
        BufferedReader oldReader = new BufferedReader(new FileReader(oldFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile, true));

        // for writing
        String line;

        // get until the end of the new file's writing
        while ((line = newReader.readLine()) != null) {
            // keep reading

        }

        newReader.close();

        // write the contents of the file
        writer.write("==" + oldFile + "==\n");

        while ((line = oldReader.readLine()) != null) {
            writer.write(line);
            writer.newLine();

        }

        writer.write("\n");

        oldReader.close();
        writer.close();
    
    }


    public static String listFiles(String directory) {
        File[] files = new File(directory).listFiles();
        String fileOutput = "";

        for (File file : files) {
            fileOutput += file + "\n";
        
        }

        return fileOutput;

    }

}
