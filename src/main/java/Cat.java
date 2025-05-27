class Cat extends Animal {
    
    public Cat(String name, int age, String type, int position){
        super(name, age, type, position);
    }

    @Override
    public String animalSound(){
        return "Meow"; // my cat likes to "return" "purr"
    } 

    @Override
    public void move(){
        this.position += 5;
    }
}