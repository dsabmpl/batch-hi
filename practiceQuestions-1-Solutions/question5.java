import java.util.*;

public class question5 {
    public static void main(String [] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        int uppercase = 0;
        int number = 0;
        for (int i = 0;i<s.length();i++)
        {
            if ( 'A'<=s.charAt(i) && s.charAt(i)<='Z')
            {
                uppercase=1;
            }
            if ('0'<=s.charAt(i) && s.charAt(i)<='9')
            {
                number=1;
            }
        }
        if (s.length() >= 8 && uppercase==1 && number==1)
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    } 
}

