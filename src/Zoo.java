public class Zoo {
    String favoriteFood = "bacon";
    public void eat (String name, String food){
        System.out.println(name + " eats " + food);
        if (food == favoriteFood){
            System.out.println("Yum!!! " + name + " wants more " + food);
        }else {
            sleep(name);
        }

    }


    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.sleep("Tigger");
        z.eat("Tigger", "meat");
        z.eat("Tigger", "bacon");
        Tiger tigger = new Tiger("Tigger", "bacon");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity","marshmallow");
        rarity.eat("marshmallow");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("pollen");

    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }
}
