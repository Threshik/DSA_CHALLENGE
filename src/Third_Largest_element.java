import javax.swing.text.html.StyleSheet;
import java.util.*;
public class Third_Largest_element {
    public void find_third(int n, int a[])
    {
        /*
brute-force
        Arrays.sort(a);
        System.out.println(a[n-3]);
*/

        int first_largest=a[0];
        int second_largest=0;
        int third_largest=0;
        int temp=0;

        if(n<3) //if the length is less than three we cant find the third-largest element
        {
            System.out.println(-1);
        }
        else {
            for(int i=1;i<n;i++)
            {
                if(a[i]>first_largest) //if the num is greate rthan f_l then swap second to third and second to first
                {
                    temp=first_largest;
                    first_largest=a[i];
                    third_largest=second_largest;
                    second_largest=temp;
                }
                else if(a[i]>second_largest) //if the num is greater than second then swap third to second and second to the actual
                {
                    third_largest=second_largest;
                    second_largest=a[i];
                }
                else if(a[i]>third_largest) //if the num is greater than third then assign to t_l
                {
                    third_largest=a[i];
                }
                temp=0;
            }
            System.out.println(third_largest);
        }

    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Third_Largest_element t = new Third_Largest_element();
        t.find_third(n,a);

    }

}
