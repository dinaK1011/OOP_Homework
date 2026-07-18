public class Student {
    String name;
    String address;
    long phoneNum;
    int roll_no;

    public Student(){}

    public Student(String name, String address ,long phoneNum, int roll_no){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.roll_no = roll_no;
    }

    public void printStudentInfo(){
        System.out.println("Info for student roll no." + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNum);
    }

}
