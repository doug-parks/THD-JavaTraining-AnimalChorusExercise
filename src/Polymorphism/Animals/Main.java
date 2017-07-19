package Polymorphism.Animals;
import java.util.ArrayList;

/**
 * Created by djp4830 on 7/12/17.
 */
public class Main {

    public static void main(String[] args) {
        //create chorus object
        Chorus chorus = new Chorus();

        //populate 'animals' array list in chorus object
        chorus.animals.add(new Cat("Tony", "Bengal Tiger", "They're Great!"));
        chorus.animals.add(new Dog("McGruff", "Crime Dog", "Take a bite out of crime!"));
        chorus.animals.add(new Sheep("Lambchop", "Lamb", "...THIS IS THE SONG THAT NEVER ENDS..."));

        //call sing method in chorus
        chorus.sing();

        //add an additional cat and dog
        chorus.animals.add(new Cat("Garfield", "Smug Housecat", "...I HATE MONDAYS..."));
        chorus.animals.add(new Dog("Scoobie Doo", "Dog Detective", "Rut-Roh!"));

        //add a robot
        chorus.animals.add(new Animal("R2-D2", "Robot", "bleep bloop"));

    }

}
