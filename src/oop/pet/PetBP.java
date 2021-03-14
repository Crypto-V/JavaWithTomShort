package oop.pet;

public class PetBP {
    private String name;
    private int age;

    public PetBP(){
        name = "";
        age = 0;
    }

    public PetBP(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Hello,my name is "+this.name+" and i am "+this.age+" years old.";
    }

    public String speak(){
        return "";
    }
}
