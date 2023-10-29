public class Box {
    double length;
    double height;
    double width;

    Box(double hei, double wid, double len){//Constructor
        length = len;
        height = hei;
        width = wid;
    }

    void volume(){
        System.out.println("Volume is: "+ length*width*height);
    }
}
