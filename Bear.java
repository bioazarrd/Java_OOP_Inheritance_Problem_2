package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem2;

public class Bear extends Mammal {


    public Bear(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("I had some honey");
    }
}
