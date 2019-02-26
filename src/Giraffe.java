public class Giraffe extends Animal {
     public Giraffe(String name) {
        super(name, "leaves");
    }
    public void eat(String food){

        if (food == this.favoriteFood) {
            System.out.println(name + " eats " + food);
            System.out.println("Yum!!! " + name + " wants more " + food);
            sleep();
        } else {
           System.out.println("Yuck!! " + this.name + " will not eat " + food);
        }
    }
}