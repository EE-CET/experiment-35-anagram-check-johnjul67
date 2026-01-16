import java.util.*;
public class AnagramCheck 
{
        public static void main(String[] args)
        {
		Scanner sc=new Scanner(System.in);
                String s1=sc.nextLine().trim().toLowerCase();
                String s2=sc.nextLine().trim().toLowerCase();
                if (s1.length() != s2.length())
                {
                        System.out.println("false");
                        System.exit(0);
                }
                char[] arr1 = s1.toCharArray ();
                Arrays.sort(arr1);
                char[] arr2 = s2.toCharArray ();
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2))
                        System.out.println("true");
                else
                        System.out.println("false");
                

        }
  
}
