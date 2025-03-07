public class Main {
    public static void main(String[] args) {
        Pet fish = new Fish();
        Pet dog = new Dog();
        Pet domesticCat = new DomesticCat();
        Pet roboCat = new RoboCat();

        Man father = new Man("jack", "white", 111);
        Woman mother = new Woman("mia", "white", 121);
        Family family = new Family("Doe", father, mother);

        System.out.println("Fish's response:");
        fish.respond();
        System.out.println("\nDog's response:");
        dog.respond();
        System.out.println("\nDomestis Cat's response:");
        domesticCat.respond();
        System.out.println("\nRobo Cat's response:");
        roboCat.respond();
        System.out.println("\nFather greets to pet:");
        father.greetPet();
        father.uniqueMethod();

        System.out.println("\nMother greets to pet:");
        mother.greetPet();
        mother.uniqueMethod();

        Human child = family.bornChild();
        System.out.println("\nNew child born:");
        child.greetPet();
        child.uniqueMethod();
        System.out.println("\nTest foul:");
        if (domesticCat instanceof Foulable) {
            ((Foulable) domesticCat).foul();
        }
        if (dog instanceof Foulable) {
            ((Foulable) dog).foul();
        }


    }
}