package midweek_hmw;

public class MarkSheet {

    public static void main(String[] args) {     //main method

        String Marksheet = "10t Marksheet";
        System.out.println(Marksheet);

        float total, percentage, average;   //deceimal floating

        int English = 88;   //local veriable
        int Maths = 92;
        int Science = 79;
        int ICT = 95;
        int Art = 72;

        System.out.println("Name: Kuldip Patel");     //method
        System.out.println("School: WHTC");
        System.out.println("DOB 07/07/1994");
        System.out.println("Exam Number 3668");
        System.out.println("English = 88");
        System.out.println("Maths   = 92");
        System.out.println("Science = 79");
        System.out.println("ICT       95");
        System.out.println("Art       72");

        total = English+ Maths+ Science+ ICT+ Art;
        average = total / 5;
        percentage = (total / 500) * 100;

        System.out.println("Total Marks =  "  +total);
        System.out.println("Average Marks =  " +average);
        System.out.println("Marks percentage  = " +percentage);







    }


}
