import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main( String[] a){
        // difference between array and list 
        int[] one = new int[10];
        
        
        for (int i = 0; i < 10; i += 1){
            // (starting ; conditional ; what you want to do with loop)
            one[i] = i+1;
            System.out.println(one[i]);
        }
        ArrayList < String > two = new ArrayList< String >(); 
        Scanner s = new Scanner(System.in);
        two.add("a");
        two.size();
        two.get(0);
        two.contains("a");


        System.out.println(two);
    }
    
}
