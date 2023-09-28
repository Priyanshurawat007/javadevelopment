public class SumOfArrayFloat {
  public static void main(String[] args) {

    float a[]={10.5f,20.5f,30.5f,60.5f};
    
    float sum=0;

    for (float element : a) {
        sum=sum+element;
        
    }

System.out.println(sum);
System.out.println(sum/a.length);
        
 
        
    }
}
