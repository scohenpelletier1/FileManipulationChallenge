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

        // file 1
        BufferedWriter writer1 = new BufferedWriter(new PrintWriter(file1));
        writer1.write("-make sure to finish all changes\n-test code\n-remember plans for world domination");
        writer1.close();

        // file 2
        BufferedWriter writer2 = new BufferedWriter(new PrintWriter(file2));
        writer2.write("01001000 01100101 01101100 01101100 01101111 00101100 00100000 01010111 01101111 01110010 01101100 01100100 00100001");
        writer2.close();


        // file 3
        BufferedWriter writer3 = new BufferedWriter(new PrintWriter(file3));
        writer3.write("-created main directory\n-created \"notes.txt\"\n-created \"data.txt\"\n-created \"log.txt\"");
        writer3.close();
        
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories

    }

}
