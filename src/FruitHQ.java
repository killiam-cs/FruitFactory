public class FruitHQ {

    public static void main(String[] args) {
        FruitHQ myFactory = new FruitHQ();
    }

    // constructor method
    // a constructor is a method with no return type
    // that has the same name as the class it's in
    public FruitHQ() {
        // strawberry: red, triangle, 200, true, 20
        Fruit strawberry; // declare strawberry
//        strawberry = new Fruit("red", 200); // construct strawberry
//        strawberry.color = "red";
//        strawberry.shape = "triangle";
//        strawberry.numSeeds = 200;
//        strawberry.isRipe = true;
//        strawberry.numBush = 20;
//        strawberry.printInfo();

        // another fruit of your choice
        Fruit mango;
        mango = new Fruit("yellowy orange to green gradient",
                "oval",1, false);
        mango.printInfo();

        // yet another fruit with a printInfo

    }

}
