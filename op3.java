import java.util.*;
public class op3 {
    public static void main(String []args)
    {
        Optional<String>optional1=getName(2);
        Optional<String>optional2=optional1.map((x)->x.toUpperCase());
        optional2.ifPresent(System.out::println);
    }
    public static Optional<String>getName(int id)
    {
        // return Optional.of("Ram");
        return Optional.empty();
    }
}
