package Polymorphism.Animals;

/**
 * Created by djp4830 on 7/12/17.
 */
class Cat extends Animal {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Cat(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }
}
