public class Bear extends Animal {
    public Bear(String name) {
        super(name, "fish");
    }
    public void sleep() {
        System.out.println(this.name + " Hibernates for 4 months");
    }

    public void eat(String food){
        System.out.println(name + " eats " + food);
        if (food == this.favoriteFood) {
            System.out.println("Yum!!! " + name + " wants more " + food);
        } else {
            sleep();
        }
    }
}