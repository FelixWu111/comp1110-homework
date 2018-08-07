package comp1110.homework.J08;

public class Staff {
        String name;
        double hourlyPay;
        int numOfHours;
        boolean worksOvertime;
        public Staff(String name,double hourlyPay,int numOfHours,boolean worksOvertime){
            this.name=name;
            this.hourlyPay=hourlyPay;
            this.numOfHours=numOfHours;
            this.worksOvertime=worksOvertime;
        }
        public String getName(){
            return name;
        }
        public double getTotalPay(double extraPay){
            if (worksOvertime) {
                double pay=hourlyPay*numOfHours+extraPay;
                return pay;
            }else {
                double pay=hourlyPay*numOfHours;
                return pay;
            }
        }
        public static class WeekendPayCalculator{
            double loadingRate;
            public void setLoadingRate(double rate){
                this.loadingRate=rate;
            }
            public double calcOvertime(double hourlyPay){
                double value=hourlyPay*loadingRate;
                return value;
            }
        }

}
