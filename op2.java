import java.util.*;
public class op2 {
    public static void main(String[] args) {
        Optional<String>name=getName(2);
        String nametoprint=name.orElse("San");
        System.out.println(nametoprint);
    }
    public static  Optional<String>getName(int id)
    {
        return Optional.empty();
    }
    
}
