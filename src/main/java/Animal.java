//abstract class of a generic animal
abstract class Animal {
    //private but still accessible by subclassses!
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    public Animal (String name, int age, String type, int position){
        this.name = name;
        this.age = age; 
        this.type = type;
        this.position = position;
    }
//Abstract method for the sound the animal makes
// subclasses must make their own implementations

    abstract String animalSound();
    abstract void move();
// while all animals have different sounds, they still make zzz when sleeping
    public String sleep(){
        return "Zzz";
    }
//basic getter and setters 
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getType(){
        return this.type;
    }
//tracks where the animal is. literally just an int
    public int getPosition(){
        return this.position;
    }
}