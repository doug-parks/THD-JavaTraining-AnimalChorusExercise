package Polymorphism.Animals;

/**
 * Created by djp4830 on 7/19/17.
 */
public abstract class Entity implements Communicate{

    String name;
    String type;
    String sound;

    String getName() {
        return name;
    }

    String getType() {
        return type;
    }

    String getSound() {
        return sound;
    }

    public Entity(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public Entity() {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }
}