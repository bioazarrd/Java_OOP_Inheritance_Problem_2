package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem2;

public class Snake extends Lizard {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("I ate a mouse");
    }
}
