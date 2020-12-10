import java.security.SecureRandom;
import java.util.Scanner;
/*
*   Using Array
* ASCII 65-90  Upper Letter
* ASCII 97-122 Lower Letter
* */
public class AbcountingArray
{
    public static void main(String[] args)
    {
        Scanner buffer = new Scanner(System.in);
        SecureRandom sec = new SecureRandom();
        int tmp=0; // how many letters are there
        int[] numUArr = new int[26];
        int[] numLArr = new int[26];
        tmp = buffer.nextInt();
        System.out.print("Letter:");

        /*
        *   Generating random letter (Computing Upper or Lower case)
        * */
        for(int i = 0; i <tmp ;i++)
        {
            char ccc;
            SecureRandom uOrL = new SecureRandom();
            boolean flag = uOrL.nextBoolean();// Use the flag to check which Letter it is, Upper case or Lower case
            if(flag)
                ccc = (char)(sec.nextInt(26)+97);
            else
                ccc = (char)(sec.nextInt(26)+65);
            System.out.print(ccc+" ");
            if(flag)
                numLArr[(int)ccc-97]++;
            else
                numUArr[(int)ccc-65]++;
        }
        System.out.println("");
        System.out.println("");
        for(int i = 0; i <26 ;i++)
        {
            System.out.print((char)(i+65)+":"+numUArr[i]+"\t");
            if((i-97)%4==0)System.out.println("");
        }
        for(int i = 0; i <26 ;i++)
        {
            System.out.print((char)(i+97)+":"+numLArr[i]+"\t");
            if((i-97)%4==0)System.out.println("");
        }
        buffer.close();
    }
}
