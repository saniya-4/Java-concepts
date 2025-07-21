import java.io.*;
public  class file{
    public static void main(String[] args) {
        try{
            File fo=new File("new.txt");
            fo.createNewFile();
            
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            FileWriter fw=new FileWriter("new.txt",true);
            fw.write("Hare Ram");
            fw.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        try{
            FileReader fr=new FileReader("new.txt");
            int letters=fr.read();
            while(fr.ready())
            {
                System.out.println((char)letters);
                letters=fr.read();
            }
            fr.close();
            System.out.println();
        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
        try{
            File f=new File("random.txt");
            f.createNewFile();
            if(f.delete())
            {
                System.out.print(f+"deleted");
            }

        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
        
    }
}