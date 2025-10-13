class Human1 {  // ✅ No public
    private int Age;
    private String Name;

    public int getAge() {
        return this.Age;
    }

    public String getName() {
        return this.Name;
    }

    public void setAge(int a){
        this.Age=a;
    }

    public void setName(String name){
        this.Name=name;
    }
}

public class Human {  // ✅ File must be named Human.java
    public static void main(String[] args) {
        Human1 obj = new Human1();
        // /obj.Age = 10;
        // obj.Name = "baby";
obj.setAge(10);
obj.setName("baby");
        System.out.println("age: " + obj.getAge());
        System.out.println("name: " + obj.getName());
    }
}
