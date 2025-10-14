package Interface;

interface Computer {
public void code();
    
}

class Laptop implements Computer{
    public void code(){
        System.out.println("laptop");
    }
}

class Desktop implements Computer{
    public void code(){
System.out.println("desktoppp");
    }
}
class Developer{
    public void devApp(Computer lap){
        System.out.println("runnnn");
    }
}


public class Demo1{
    public static void main(String args[]){

        Computer lap=new Laptop();
        Computer desk = new Desktop();
Developer dev=new Developer();
dev.devApp(desk);
    }
}


//class->class------------extends
//class->interface--------------implements
//interface->interface -------------extends