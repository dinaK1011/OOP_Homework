public class NumberHolder  {

    public int intNumber;
    public float floatNumber;

    public NumberHolder(){}

    public NumberHolder(int intNumber){
        this.intNumber = intNumber;
        this.floatNumber = 51.92f;
    }

    public void printNumberHolder(){
        System.out.println("The int number is: " + intNumber + " and the float nymber is: " + floatNumber);
    }
}