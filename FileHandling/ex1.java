package FileHandling;
import java.io.*;
import java.util.*;
//write the program to read the data from the existing file and count the no of characters and no of words
public class ex1 {
    public static void main(String []args)
    {
        int wordcount=0;
        int charcount=0;
         File file=new File("hello.txt");
         try{
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
                charcount+=line.length();
                String word[]=line.trim().split("\\s+");
                if(!line.trim().isEmpty())
                {
                    wordcount+=word.length;
                }
            }

         }catch(IOException e)
         {
            System.out.println("file not found");

         }
      
       
         System.out.println("wordcount"+wordcount);
         System.out.println("charcount"+charcount);
    }
}
