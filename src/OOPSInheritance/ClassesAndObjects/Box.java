package OOPSInheritance.ClassesAndObjects;

public class Box {

    double width, height, depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        Box b = new Box(10, 5, 4);

        System.out.println("Width = " + b.width);
        System.out.println("Height = " + b.height);
        System.out.println("Depth = " + b.depth);
        System.out.println("Volume = " + b.getVolume());
    }
}