public class Fish extends Pet {
    public Fish() {
        super();
        this.species = Species.FISH;
    }
    @Override
    public void respond() {
        System.out.println("Blub Blub Blub Blub");
    }
}