package comp1110.homework.J10;

public class SquareRoot {
    public static String findPreciseRoot(int n, int d){
        String r ="";
        if (n>=0){
        double a = Math.sqrt(n);
        String b = Double.toString(a);
        String c = b.substring(2);
        if(!c.equals("0")&&d!=0){
        String e = b.substring(0,2);
        String c2 = c.substring(0,d-1);
        if (c.length()>d){
            String asd = ""+c.charAt(d);
            if (Integer.parseInt(asd)>4){
                if (c.charAt(d-1)!='9'){
                String asdf=""+(char)(c.charAt(d-1)+1);
                c2+=asdf;}else {
                    String asdf=""+(char)(c.charAt(d-2)+1)+"0";
                    c2=c.substring(0,d-2)+asdf;
                }
            }else {
                c2+=""+c.charAt(d-1);
            }
        }
        r = e+c2;}else{
            r= b.substring(0,1);
        }}else {
            r="-1";
            }

        return r;

    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("1")>4);
    }
}
