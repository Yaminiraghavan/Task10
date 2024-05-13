public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person s= new Person("Yamini", 23);
        System.out.println("Name:" + s.getName());
        System.out.println("age:" + s.getAge());
    }
}
