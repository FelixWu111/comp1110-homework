package comp1110.homework.O04;

public class Square extends Shape {
    public Square(double l1){
        this.l1=l1;
    }
    public Square(double l1,double x,double y){
        this.l1=l1;
        this.x=x;
        this.y=y;
    }
    @Override
    public double perimeter() {
        return 4*l1;
    }
    public double area() {
        return l1*l1;
    }
    public boolean overlaps(Shape other) {
        if(other instanceof Square){return((Math.abs(this.x-other.x)<this.l1/2+other.l1/2)&&
                                          (Math.abs(this.y-other.y)<this.l1/2+other.l1/2));
        }else {double x = Math.abs(other.x-this.x)-this.l1/2;
               double y = Math.abs(other.y-this.y)-this.l1/2;
            if (x>0) {
                if (y>0) {
                    return x*x + y*y<other.l2*other.l2;
                } else {
                    return x<other.l2;
                }
            } else {
                return y<other.l2;
            }}
    }}
