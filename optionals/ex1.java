package optionals;
import java.util.Optional;

public class ex1 {
public static void main(String []args)
{
    String []words=new String[10];
    Optional<String>word=Optional.ofNullable(words[5]);
    if(word.isPresent())
    {
        String ans=words[5].toLowerCase();
        System.out.print(ans);

    }
    else
    {
        System.out.print("the word is null");
    }
}
    
}
