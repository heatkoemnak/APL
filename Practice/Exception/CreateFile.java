
import java.io.File;
public class CreateFile {


public static void main(String[] args) {

    File file = new File("myFile1.txt");
    try{
        boolean isFileCreated= file.createNewFile();

        if(isFileCreated){
            System.out.println("File has been created");
        }
        else{
            System.out.println("File already exists");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }

};
}