import java.io.*;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {
        // Your code here
        
        // a. Create main directory
        File mainDir = new File("JavaFileSystem");
        mainDir.mkdir();
        
        // b. Create three text files
        
        // file 1
        File file1 = new File("notes.txt");
        file1.createNewFile();

        // file 2
        File file2 = new File("data.txt");
        file2.createNewFile();

        // file3
        File file3 = new File("log.txt");
        file3.createNewFile();
        
        // c. Write messages to files
        
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories

    }

}
