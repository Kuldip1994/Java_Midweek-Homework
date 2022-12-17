package midweek_hmw;

public class MarkSheet12th {

    public static void main(String[] args) { //main Method

        String Marksheet= "12 Marksheet";   //Non permitive
        System.out.println(Marksheet);

        float total, percentage, average;    //Floating point

        int Maths = 84;     //Local Variable
        int Physic = 88;
        int Economics = 94;
        int Biology = 78;
        int Computing = 93;

        System.out.println("Name: Kuldip Patel");     //Method
        System.out.println("School: WHTC");
        System.out.println("DOB 07/07/1994");
        System.out.println("Exam Number: 3668");
        System.out.println("Maths     =  84");
        System.out.println("Physic    =  88");
        System.out.println("Economics =  94");
        System.out.println("Biology   =  78");
        System.out.println("Computing =  93");

        total = Maths+ Physic+ Economics+ Biology+ Computing;
        average = total/5;
        percentage= (total / 500) *100;

        System.out.println("Total Marks  =  "+total);
        System.out.println("Total Average = "+average);
        System.out.println("Total percentage ="+average);




    }
}
