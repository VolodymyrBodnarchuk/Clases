import java.awt.*;

public class SomethingIsRight {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;

        System.out.println("myRect's area is " + area(myRect.width, myRect.height));
    }

    public static int area(int a, int b){
        int rezult;

        rezult = a*b;

        return rezult;
    }

}
