public class methods_2 {
    static void Name(){
        System.out.println("Devil is here :)");
    }
 static int Sum(int ...arr){
        int result=0;
    
        for(int a: arr ){
            result +=a;
        }
        return result;
}
// Function for Fibnacci Series
static int find_fib(int n){
    if (n==1 || n==0){
        return 1;
        }
        else{
            return find_fib(n-1)+find_fib(n-1);
        }
}

// Function for finding Factorial of any number
static int factorial(int n){

    if(n==1 || n==0){
        return 1;
    }
    else{
        return n*factorial(n-1);

    }
    
}
public static void main(String[] args){
        // Name();
        int n=6;
        // System.out.println("The Factorial of : "+factorial(6));
        System.out.println("The Factorial of 6: "+find_fib(6));
    }
}
