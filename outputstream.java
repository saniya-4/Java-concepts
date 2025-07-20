import java.io.*;
public class outputstream {
    public static void main(String[] args) {
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out))
        {
            osw.write("hello world");
            osw.write(97);
            osw.write(10);
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        try(FileWriter fw=new FileWriter("hello.txt",true))
        {
            fw.write("hello world");
        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("hello.txt",true)))
        {
            bw.write("Hare Krishna ");
            
        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
