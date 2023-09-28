public class methods_1 {
    static void tellJoke() {
        System.out.println("Hello Devil\n");
         
    }
    static void DoNothig(){
        System.out.println("I'm Doing nothing :)");
    }
    static int MySum(int a, int b){
       
       System.out.println(a+b);
        return 0;
        
    }
    void King(){
        System.out.println("The sum:");
}
static int Sum(int ...arr){
    int result=0;

    for(int a: arr ){
        result +=a;
    }
    return result;


}

public static void main(String[] args){
        
        tellJoke();
        DoNothig();
        Sum(10,20);
        methods_1 obj= new methods_1();
        obj.MySum(10,20);
        methods_1 obj1= new methods_1();
        obj1.King();

        System.out.println(+Sum(10,20,30,40,50));



        
    } 
    
}
