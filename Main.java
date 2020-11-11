package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Animal> animals = new ArrayList<>();
        animals.add(new Snake("Python"));
        animals.add(new Lizard("Gandalf"));
        animals.add(new Gorilla("King Kong"));
        animals.add(new Bear("Winnie the bear`s gonna bear"));


        for (Animal animal : animals) {
            animal.feedAnimal();
        }


    }
}