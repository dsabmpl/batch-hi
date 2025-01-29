import java.util.*;

public class question3{

    public static void main(String [] args)
    {   

        

        int marks; 
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if (90<=marks)
        {
            System.out.println("A");
        }
        else if(80<=marks)
        {
            System.out.println("B");
        }
        else if(70<=marks)
        {
            System.out.println("C");
        }
        else if (60<=marks)
        {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }

    
}