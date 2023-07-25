import java.io.File;
import java.io.FileWriter;


public class WriteFile {
    public static void main(String[] args){
        
        try{
            File file = new File("myFile1.txt");
            boolean isFileCreated= file.createNewFile();
            if (isFileCreated){
                FileWriter writer = new FileWriter(file);
                writer.write("\nHello. My name is John");
                writer.close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
