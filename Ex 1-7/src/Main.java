import java.awt.*;

public class Main {
    static void main(String[] args) {
        // Ex1

        //    public class SomethingIsWrong {
        //        public static void main(String[] args) {
        //            Rectangle myRect;
        //            myRect.width = 40;
        //            myRect.height = 50;
        //            System.out.println("myRect's area is " + myRect.area());
        //        }
        //    }

        //The class Rectangle myRect is not created yet.

        // Ex2
        //        public class SomethingIsWrong {
        //            public static void main(String[] args) {
        //                Rectangle myRect = new Rectangle();
        //                myRect.width = 40;
        //                myRect.height = 50;
        //                System.out.println("myRect's area is " + myRect.area());
        //            }
        //        }

        // Ex3
        System.out.println("Ex 3: ");
        NumberHolder num1 = new NumberHolder();
        num1.printNumberHolder();

        NumberHolder num2 = new NumberHolder(12);
        num2.printNumberHolder();


    }
}