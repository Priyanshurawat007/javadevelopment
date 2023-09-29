package CodeWithHarry;

class Shape_Circle{
    
    float radius=6f;
    public void Print_Cir() {
           float area_c=2*3.14f*radius;
           System.out.println("Area of Circle:"+area_c);
    }
    
}
class Shape{
    int side=4;
    public void Print_rec (){
        float area=4*side;
        System.out.println("Area of Rectangle:"+area);
}
}

// main method 

public class Oops_2 {
    public static void main(String[] args) {

      // creating object for the classes
        Shape_Circle Circle=new Shape_Circle();
        Shape rectangle=new Shape();
      
      // calling those methods
        Circle.Print_Cir();
        rectangle.Print_rec();

        
    }
    
}
