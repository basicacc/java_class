public class RoboCat extends Pet {
    public RoboCat() {
        super();
        this.species = Species.ROBOCAT;
        @Override
        public void respond() {
            System.out.println("I am a robo cat");
        }
    }