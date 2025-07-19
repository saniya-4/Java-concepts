import java.util.*;
public class Optionals{
    public static void main(String []args)
    {
        Optional<String>name=getName(2);
        if(name.isPresent())
        {
            System.out.println(name.get());
        }
    }
    public static Optional<String>getName(int id)
    {
        String name="Ram";
        return Optional.ofNullable(name);
    }
}