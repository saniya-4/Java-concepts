import java.io.IOException;
import java.io.FileReader;
public class filereader {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("hello.txt"))
        {
            int letters=fr.read();
            while(fr.ready())
            {
                System.out.println((char)letters);
                letters=fr.read();
            }
            System.out.println();


        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
