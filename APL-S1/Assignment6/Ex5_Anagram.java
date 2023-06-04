import java.util.Arrays; 
import java.util.Scanner;   
public class Ex5_Anagram  {    

//function that checks if the strings are anagram or not      
static void isAnagram(String str1, String str2)   {   

    //removes white spacesx
    String s1 = str1.replaceAll("\\s", "");   
    char[] arrayS1 = s1.toLowerCase().toCharArray();    
    //removes white spacesx
    String s2 = str2.replaceAll("\\s", "");   
    char[] arrayS2 = s2.toLowerCase().toCharArray();   
    boolean status = true;    
    //checks the length of both the strings are equal or not  

    if (s1.length() != s2.length()){  
        status = false;    
    }   
    //if lengths of strings are equal  
    else  {    
        Arrays.sort(arrayS1);    
        Arrays.sort(arrayS2);    
        //compares the strings  
        status = Arrays.equals(arrayS1, arrayS2);    
    }    
    if (status){    
    //prints if status returns true      
    System.out.println(s1 + " and " + s2 + " are anagrams");    
    }else {    
        //prints if status returns false      
        System.out.println(s1 + " and " + s2 + " are not anagrams");    
        }    
    }    
    
    //driver code  
    public static void main(String args[]){    
    //calling function      
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String str1=in.next();

        System.out.println("Enter String 2:");
        String str2=in.next();

        isAnagram(str1, str2) ;
    }
}