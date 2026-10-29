import java.util.Scanner;

public class Main1 {
    //returns a letter grade based on average
    static char grade(double avg)
    {
        if(avg>=90)
        {
            return 'A';
        }
        else if(avg>=80)
        {
            return 'B';
        }
        else if(avg>=70)
        {
            return 'C';
        }
        else if(avg>=70)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
 public static void  main(String args[])
  {
    Scanner sc= new  Scanner(System.in);
    System.out.println("enter the grades from (1 to 5)?");
    int count=sc.nextInt();
     if(count<1 || count>5)
     {
        System.out.println("enter between 1 to 5 grades!");
        sc.close();
        return; // exit from the block
    }
    double sum=0.0;
    for(int i=1;i<=count;i++)
    {
        System.out.println(" grade " +i+":");
        double grade= sc.nextDouble();
        sum+=grade;

    }
    double avg=sum/count;
    System.out.println("Average :"+ avg);
    System.out.println("The grade is:"+ grade(avg));
    sc.close();
}  
}
