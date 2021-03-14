package adt;

public class Lion extends Animal {
    private int age;
    private static int numOfLions = 0;
    private String name;

    public Lion() {
        age = 0;
        name = null;
        numOfLions++;
    }

    public Lion(String name, int age, String food, int life) {
        super(food, life);
        this.name = name;
        this.age = age;
        numOfLions++;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        String result = "My name is ";
        if (name == null) result += " Unknown. I am ";
        else result += this.name + ".I am ";
        if (age == 0) result += " UnknownAge old.";
        else result += this.age + " years old. I am eating ";
        if (super.getFoodType() == null) result += " UnknownFood.My life expentace is ";
        else result += super.getFoodType() + ".My life expectance is ";
        if (super.getLifeExpectancy() == 0) result += "Unknown.";
        else result += super.getLifeExpectancy();
        return result;

    }

    public static int numOfLions(){
        return numOfLions;
    }

}
