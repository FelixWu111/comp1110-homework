package comp1110.homework.O04;

public class Circle extends Shape {
    public Circle(double l2){
        this.l2=l2;
    }
    public Circle(double l2,double x,double y){
        this.l2=l2;
        this.x=x;
        this.y=y;
    }
    @Override
    public double perimeter() {
        return 2*l2*Math.PI;
    }
    public double area() {
        return l2*l2*Math.PI;
    }
    public boolean overlaps(Shape other) {
        if(other instanceof Circle){
            if(Math.sqrt((this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y))<(this.l2+other.l2)){
                return true;}else{return false;}
        }else{double x = Math.abs(this.x-other.x)-other.l1/2;
            double y = Math.abs(this.y-other.y)-other.l1/2;
            if (x>0) {
                if (y>0) {
                    return x*x + y*y<this.l2*this.l2;
                } else {
                    return x<this.l2;
                }
            } else {
                return y<this.l2;
            }}
    }}
