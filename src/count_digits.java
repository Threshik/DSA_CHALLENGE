import java.util.*;
public class count_digits {
    public void find_count(int num)
    {
        int count=0;
        String str= String.valueOf(num);
        for(int i=0;i<str.length();i++)
        {
            int a=Character.getNumericValue(str.charAt(i));
            if(a!=0&&num%a==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        count_digits c = new count_digits();
        c.find_count(num);
    }
}
