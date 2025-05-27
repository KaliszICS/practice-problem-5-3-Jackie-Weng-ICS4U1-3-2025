class Bird extends Animal{

    public Bird(String name, int age, String type, int position){
        super(name, age, type, position);
    }
    
    @Override
    public String animalSound(){
        return "Chirp"; // birds can prob make different sounds
    }

    @Override
    public void move(){
        this.position += 50;
    }
}