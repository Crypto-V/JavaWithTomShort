package oop.pet;

public class Cat extends PetBP {
    private String breed;

    public Cat(){
        super();
        breed = "";
    }

    public Cat(String catName,int catAge,String breed){
        super(catName,catAge);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString(){
        return super.toString()+". My breed is "+this.breed;
    }

    public String speak(){
        return "Miaow! I am "+super.getName()+" a "+super.getAge()+" year old "+this.breed;
    }
}
