package Excersise250;

public class Did_bw_2points {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double dis;
        x1=2;
        x2=6;
        y1=2;
        y2=6;
        dis=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("Distance between two points:"+dis);
    }
}
