package OOP.pet;

public class Dog extends PetBP {
    private String breed;

    public Dog(){
        super();
        breed = "";
    }

    public Dog(String dogName,int dogAge,String breed){
        super(dogName,dogAge);
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
        return "Woof! I am "+super.getName()+" a "+super.getAge()+" year old "+this.breed;
    }
}
