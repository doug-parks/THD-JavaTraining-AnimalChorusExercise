package Polymorphism.Animals;

/**
 * Created by djp4830 on 7/12/17.
 */
public class Main {

    public static void main(String[] args) {
        //create chorus object
        Chorus cartoonChorus = new Chorus();

        //populate 'entities' array list in chorus object
        cartoonChorus.entities.add(new Cat("Tony", "Bengal Tiger", "They're Great!"));
        cartoonChorus.entities.add(new Dog("McGruff", "Crime Dog", "Take a bite out of crime!"));
        cartoonChorus.entities.add(new Sheep("Lambchop", "Lamb", "...THIS IS THE SONG THAT NEVER ENDS..."));

        //call sing method in chorus
        Communicate.speak();

        //add an additional cat and dog
        cartoonChorus.entities.add(new Cat("Garfield", "Smug Housecat", "...I HATE MONDAYS..."));
        cartoonChorus.entities.add(new Dog("Scoobie Doo", "Dog Detective", "Rut-Roh!"));

        //add a robot
        cartoonChorus.entities.add(new Robot("R2-D2", "Robot", "bleep bloop"));

        Communicate.speak();
    }
}