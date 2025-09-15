import java.io.IOException;

public class FileHandlingActivityTester {
    public static void main(String[] args) throws IOException {

        // a. Create main directory
        FileHandlingActivity.makeDirectory("JavaFileSystem");

        // b. Create three text files
        
        // file 1
        String file1 = "JavaFileSystem/notes.txt";
        FileHandlingActivity.makeFile(file1);

        // file 2
        String file2 = "JavaFileSystem/data.txt";
        FileHandlingActivity.makeFile(file2);

        // file 3
        String file3 = "JavaFileSystem/log.txt";
        FileHandlingActivity.makeFile(file3);
        
        // c. Write messages to files
        String message1 = "-make sure to finish all changes\n-test code\n-remember plans for world domination";
        String message2 = "01001000 01100101 01101100 01101100 01101111 00101100 00100000 01010111 01101111 01110010 01101100 01100100 00100001";
        String message3 = "-created main directory\n-created \"notes.txt\"\n-created \"data.txt\"\n-created \"log.txt\"";

        FileHandlingActivity.writeFile(file1, message1);
        FileHandlingActivity.writeFile(file2, message2);
        FileHandlingActivity.writeFile(file3, message3);
        
        // d. Read and display file contents
        System.out.println("==File Contents==");
        
        // file 1
        System.out.println("File 1: " + FileHandlingActivity.readFile(file1));

        // file 2
        System.out.println("File 2: " + FileHandlingActivity.readFile(file2));

        // file3
        System.out.println("File 3: " + FileHandlingActivity.readFile(file3));
        System.out.println();

        // e. Create backup directory
        FileHandlingActivity.makeDirectory("JavaFileSystem/Backup");
        
        // f. Copy contents to backup file
        String backupFilePath = "JavaFileSystem/Backup/backup.txt";
        FileHandlingActivity.makeFile(backupFilePath);

        // clone the files
        FileHandlingActivity.cloneFile(backupFilePath, file1);
        FileHandlingActivity.cloneFile(backupFilePath, file2);
        FileHandlingActivity.cloneFile(backupFilePath, file3);

        // g. List all files in both directories

        // JavaFileSystem
        System.out.println("==Files in JavaFileSystem==");

        System.out.println(FileHandlingActivity.listFiles("JavaFileSystem"));
        System.out.println();

        // Backup
        System.out.println("==Files in Backup==");
        System.out.println(FileHandlingActivity.listFiles("JavaFileSystem/Backup"));
        System.out.println();

    }
    
}
