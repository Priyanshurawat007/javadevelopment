import java.util.*;
public class fact {
    public static void main(String args[]){
        Scanner h=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=h.nextInt();

        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);


    }
    
}
