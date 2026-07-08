import java.io.*;
public class FileHandlingDemo {
    public static void main(String[] args) throws IOException {
        
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("java\n");
                
            } 
            try(FileWriter writer = new FileWriter(file, true)) {
                writer.write("SQL\n");
                
            } 
            System.out.println("\nContents of the file:");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
           
        } 
}