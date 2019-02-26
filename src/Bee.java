public class Bee extends Animal {
    public Bee(String name) {
        super(name, "pollen");
    }
    public void sleep(){
        System.out.println(this.name + " never sleeps");
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