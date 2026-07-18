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

        // Ex4
        System.out.println("Ex 4: ");
        Student Sam = new Student("Sam", "Jerusalem", 4584666, 11);
        Student John = new Student("John", "Tel Aviv", 4566966, 12);

        Sam.printStudentInfo();
        John.printStudentInfo();

        // Ex5
        System.out.println("Ex 5: ");
        Rectangle myRect = new Rectangle(6,7);
        System.out.println("The height of the rectangle is: " + myRect.height + " ,and the width is: "
        + myRect.width +  " ,so the area of your rectangle is: " + myRect.getArea());

        // Ex6
        System.out.println("Ex 6: ");
        Average ex1 = new Average(10.5, 4.5, 8.55);
        System.out.println("The average of your numbers is: " + ex1.GetAverage());


        // Ex7
        System.out.println("Ex 7: ");
        Employee Robert = new Employee("Robert", 1994, 40000, "64C- WallsStreat");
        Employee Samm = new Employee("Sam ", 2000, 34000, "68D- WallsStreat");
        Employee Johnn = new Employee("John", 1999, 40000, "26B- WallsStreat");

        Employee[] employees = {Robert, Samm, Johnn};
        String[] headers = {"Name", "Year of joining", "Salary", "Address"};
        String[][] data = {
                {employees[0].name + "     ", employees[0].joiningYear + "        ", employees[0].salary + "   ", employees[0].address},
                {employees[1].name + "       ", employees[1].joiningYear + "        ", employees[1].salary + "   ", employees[1].address},
                {employees[2].name + "       ", employees[2].joiningYear + "        ", employees[2].salary + "   ", employees[2].address}
        };
        System.out.println(headers[0] + "     " + headers[1] + "     " + headers[2] + "         " + headers[3]);
        for (String[] row : data) {
            System.out.println(row[0] + "   " + row[1] + "   " + row[2] + "   " + row[3]);
        }
    }
}