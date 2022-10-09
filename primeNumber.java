import java.util.*;
public class primeNumber {
    public static void main(String args[]){
        int count=0;
        Scanner h=new Scanner(System.in);
        System.out.println("Enter the NUmber to check: ");
        int n =h.nextInt();

        for(int i=1;i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==2)
        {
         
            System.out.println("It's a prime number !");

        }
        else {
            System.out.println("It's not a prime number");
        }
    }

    }

