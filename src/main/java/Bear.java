//same thing but different animal sound. this time its Roar

class Bear extends Animal{
  //Constructor
  // takes names, age and type and poistion for parameters
    public Bear(String name , int age, String type, int position){
        super(name, age, type, position);
    }

    @Override
    public String animalSound(){
        return "Roar";
    }

// This  overrides the move() method from the Animal class
    // It moves the bear forward by increasing its position by 1

    @Override 
    public void move(){
        this.position += 1;
    }
}