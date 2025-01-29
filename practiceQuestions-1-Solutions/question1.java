import java.util.*;

public class question1 
{
    public static void main(String[] args) {
        
        int A,B,C,D;
        Scanner sc = new Scanner(System.in);
        // assumption no malicious input is given 
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        if (A>B)
        {
            if (A>C)
            {
                if (A>D)
                {
                    System.out.println("A");
                }
                else
                {
                    System.out.println("D");
                }

            }
            else {
                if (C>D)
                {
                    System.out.println("C");
                }
                else{
                    System.out.println("D");
                }  
            }

        }
        else{
            if (B>C)
            {
                if (B>D)
                {
                    System.out.println("B");
                }
                else
                {
                    System.out.println("D");
                }

            }
            else {
                if (C>D)
                {
                    System.out.println("C");
                }
                else{
                    System.out.println("D");
                }  
            }
        }
        sc.close();
    }
}