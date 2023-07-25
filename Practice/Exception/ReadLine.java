import java.io.FileReader;
import java.io.BufferedReader;

public class ReadLine {
    public static void main(String[] args) {
        String line;
         try{
            BufferedReader reader = new BufferedReader(new FileReader("myFile1.txt"));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            
         }catch (Exception e){
                System.out.println(e);
            }
        
    }
    
}
