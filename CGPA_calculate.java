package Excersise250;

public class CGPA_calculate {
    public static void main(String[] args) {
        int num=5;
        double mm[]={95,85,75,80,95};
        double gg[]=new double[num];
        double cgpa,sum=0;

        for(int i=0;i<num;i++){
         gg[i]=(mm[i]/10);
        }
        for(int i=0;i<num;i++){
            sum+=gg[i];
        }
        cgpa=sum/num;
        System.out.println("CGPA is"+""+cgpa);
        System.out.println("Percentage of CGPA is"+""+9.5*cgpa);

    }
}
