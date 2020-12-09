import java.security.SecureRandom;
import java.util.Scanner;

public class AbcountingvTwo
{
    public static void main(String[] args)
    {
        Scanner buffer = new Scanner(System.in);
        SecureRandom sec = new SecureRandom();
        int tmp=0; // how many letters are there
        int[] numArr = new int[26];
        tmp = buffer.nextInt();
        System.out.print("Letter:");
        for(int i = 0; i <tmp ;i++)
        {
            char ccc;
            ccc = (char)(sec.nextInt(26)+97);
            System.out.print(ccc+" ");
            int add=(int)ccc-97;
            numArr[add]++;
        }
        System.out.println("");
        System.out.println("");
        for(int i = 0; i <26 ;i++)
        {
            System.out.print((char)(i+97)+":"+numArr[i]+"\t");
            if((i-97)%4==0)System.out.println("");
        }
        buffer.close();
    }
}
