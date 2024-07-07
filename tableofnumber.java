import java.util.*;
public class tableofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing the table of the number");
        System.out.println("Plese Enter the number");

        int n = sc.nextInt();
        // table maker in java 
        for(int i =1; i<11; i++){
            System.out.println(i*n);
        }
    }
}
