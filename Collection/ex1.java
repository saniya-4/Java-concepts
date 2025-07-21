package Collection;
import java.util.*;
public class ex1 {
    
    public static void main(String []args)
    {
        Collection<String>c=new ArrayList<>();
        c.add("q");
        c.add("e");
        System.out.print(c.size());
        System.out.println(c.isEmpty());
        c.contains("q");
        System.out.print(c.contains("q"));
        Iterator<String>it=c.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("hel");
        Object []arr=c.toArray();
        System.out.println(Arrays.toString(arr));
        
        
    }
}
