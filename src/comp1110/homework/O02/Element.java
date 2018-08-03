package comp1110.homework.O02;

public enum Element {
    H(1,1,1),He(2,18,1),Li(3,1,2),Be(4,2,2),B(5,13,2);
    private int weight;
    private int group;
    private int period;
    Element(int weight, int group, int period){
        this.weight = weight;
        this.group = group;
        this.period = period;
    }
    private int[] fact = new int[3];
    public int[] getFacts() {
        this.fact=new int[]{this.weight,this.group,this.period};
        return fact;
    }
}
