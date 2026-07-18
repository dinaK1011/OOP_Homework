public class Average {
    double num1;
    double num2;
    double num3;

    public Average(){}

    public Average(double num1, double num2, double num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double GetAverage(){
        return (num1 + num2 + num3) / 3;
    }
}
