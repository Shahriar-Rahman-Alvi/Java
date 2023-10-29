public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(20, 15, 10);

        Box b2 = new Box(25, 5, 8);

        System.out.println(b1);
        System.out.println(b2);
        b1.volume();
        b2.volume();
    }
}

