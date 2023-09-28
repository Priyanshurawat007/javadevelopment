public class methods_3 {
// Function for Print Table of N Numbers

static int multiplication(int n){
    for(int i=1;i<=10;i++){
        System.out.format("%d X %d = %d\n",n,i,n*i);
    }
    return 0;
}
// Fuction for Printing Pattern
static void pattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(" * ");
        }
        System.out.println("\n");
       
    }
     
}
public static void main(String[] args){
    // multiplication(5);
    pattern(7);
     
}
}
