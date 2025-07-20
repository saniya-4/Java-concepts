import java.io.*;
public class buffered {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("You typed "+br.readLine());

        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
        try(BufferedReader brf=new BufferedReader(new FileReader("hello.txt")))
        {
            while(brf.ready())
            {
                System.out.println(brf.readLine());
            }
        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
