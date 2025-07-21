package optionals;
import java.util.Optional;
public class ex2 {
    public static void main(String []args)
    {
        Optional<String>word=Optional.empty();
         if(word.isEmpty())
         {
            System.out.print("the word is empty");
         }
         else
         {
            System.out.print("the word is"+word.get());
         }
      
    }
    
}
