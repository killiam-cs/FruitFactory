public class Fruit {

    // variable declarations
    public String color;
    public String shape;
    public int numSeeds;
    public boolean isRipe;
    public int numBush;

    public void printInfo() {
        System.out.println("The color is: " + color);
        System.out.println("The shape is: " + shape);
        System.out.println("The seed count is " + numSeeds);
        if (isRipe == true) {
            System.out.println("The fruit is ripe");
        }
        else {
            System.out.println("The fruit is not ripe :(");
        }
        System.out.println("Number on a bush: " + numBush);
    }


    public Fruit() {

    }

}
