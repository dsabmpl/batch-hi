
import java.util.*;
public class question2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        int year = sc.nextInt();

        if ( (year%4==0 && !( year%100==0 )) || year%400==0 )
        {
            System.out.println("festival will be celebrated");
        }
        else
        {
            System.out.println("No festival ");
        }
        sc.close();

        
    }
}
