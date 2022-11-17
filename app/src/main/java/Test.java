import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
     String name = "Roronoa Di Zoro";
     String[] splitStr = name.split("\\s+");
    // System.out.println(splitStr[0]);
     char f = splitStr[0].charAt(0);
     char s = splitStr[1].charAt(0);
     String lastword = splitStr[2];
     System.out.println(f+"." + s+"."+lastword);


    }





}
