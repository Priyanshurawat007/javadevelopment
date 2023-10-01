package CodeWithHarry;

public interface Interface {
    public default int Run() {
               System.out.println("Hello World");
               return 0;
    }
}
class Access implements Interface{
    public void acccses() {
        System.out.println("This is Devil");
    }

   
}
class king{
    public static void main(String[] args) {
        Access obj=new Access();
        // Interface obj2=new Interface();
               obj.acccses();
               obj.Run();
    }
}
