import java.util.Scanner;

/**
 * numberComparison
 */
public class numberComparison {

    public static void main(String[] args) {
        
        //comparison of two numbers
    
        Scanner entry=new Scanner(System.in);
        System.out.print("input first integer");
        int first_integer=entry.nextInt();

        System.out.print("input second integer");
        int second_integer=entry.nextInt();

        if(first_integer != second_integer)
            System.out.printf("%d != %d\n",first_integer,second_integer);
        if(first_integer < second_integer)
            System.out.printf("%d<%d\n",first_integer,second_integer);
        if(first_integer <= second_integer)
            System.out.printf("%d <= %d\n",first_integer,second_integer);
        
        if(second_integer != first_integer )
            System.out.printf("%d != %d\n",second_integer,first_integer);
        if(second_integer < first_integer)
            System.out.printf("%d<%d\n",first_integer,first_integer);
        if(second_integer <= first_integer)
            System.out.printf("%d <= %d\n",first_integer,first_integer);
            
    }
}