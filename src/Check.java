import java.util.Scanner;
public class Check
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first string: ");
        String first=sc.nextLine();

        System.out.println("Enter second string: ");
        String second=sc.nextLine();

        System.out.println("Enter third string: ");
        String third=sc.nextLine();

        sc.close();
        int firstlen =first.length();
        int secondlen =second.length();
        int thirdlen =third.length();
        boolean check= true;
        if (thirdlen !=firstlen+secondlen)
            System.out.println("String is not interleaving");
        else
        {
            int count1=0, count2=0;

            for (int i=0; i<thirdlen; i++)
            {
                 if ( count1<firstlen && third.charAt(i) == first.charAt(count1)) {count1+=1; continue;}

               else if ( count2<secondlen && third.charAt(i) == second.charAt(count2)) {count2+=1; continue;}
               else if (count1 ==firstlen && count2==secondlen){break;}

               else { check= false;
                     System.out.println("String is not interleaving");
                     break;}
            }

        }
        if (check ==true)
            System.out.println("String is  interleaving");




    }
}
