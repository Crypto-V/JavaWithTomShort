package OOP.pet;

public class PetApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Puppy",10,"terrier");
        dog1.speak();
        dog1.setName("Guff");
        dog1.setAge(11);
        dog1.setBreed("Husky");
        System.out.println(dog1.speak());
        System.out.println(dog2.speak());

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Lola",3,"tabby");

        cat1.setBreed("regular");
        cat1.setName("Kiki");
        cat1.setAge(27);
        System.out.println();
        System.out.println(cat1.speak());
        System.out.println(cat2.speak());


    }
}
