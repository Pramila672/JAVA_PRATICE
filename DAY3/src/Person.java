public class Person {
    String name;
    int age;

    public Person(String n, int a){
        this.name = n;
        this.age = a;
    }

    //method calling
    public void introduce(){
        System.out.println("My name is  " + this.name + ". I am " + this.age + " years old");
    }


}
