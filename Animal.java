package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem2;
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void feedAnimal();


    public String produceSound() {
        return "" ;
    }




}
