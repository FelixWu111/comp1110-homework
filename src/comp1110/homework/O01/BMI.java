package comp1110.homework.O01;
public class BMI {
    double height;
    double weight;
    String name;
    public BMI(String name,double height,double weight){
        this.name =name;
        this.height=height;
        this.weight=weight;
    }
    public double getBMI(){
        double bmi=weight/(height*height);
        return bmi;
    }
    public String toString(){
        String s=name+" is "+height+"m tall and is "+weight+"Kg and has a BMI of "+getBMI()+"Kg/m^2";
        return s;
    }
}
