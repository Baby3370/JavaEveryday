interface A {       //public abstract final static
 void show();
 void name();
}

class B implements A{
    public void show(){
        System.out.println("fgh");
    }

    public void name(){
        System.out.println("vb");
    }

    public void namee(){
        System.out.println("asd");
    }
}
public class InterfaceDemo{
    public static void main(String args[]){
     B obj=new B();
     obj.show();
     obj.name();
     obj.namee();
    }
}







//by default all the methods are public abstract
//by default all the variables are static final
//we should implement all the methods of an interface
//we can have extra methods in implemented class