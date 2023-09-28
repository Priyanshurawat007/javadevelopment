
import java.lang.Exception;

class MyException extends Exception {
   public MyException(String s){
        super(s);

    }
    
}
 public class User_Exception{
    public static void main(String args[]){
        try{
            throw new MyException("this is my error message");

        }
        catch(MyException ex){
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
    
}
