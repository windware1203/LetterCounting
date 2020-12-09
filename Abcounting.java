import java.security.SecureRandom;
import java.util.*;
/*
*   Using HashMap
* */
public class Abcounting
{
    public static void main(String[] args)
    {
        Scanner buffer = new Scanner(System.in);
        SecureRandom sec = new SecureRandom();
        HashMap<Character,Integer> cMap = new HashMap();
        cMap.clear();
        int tmp=0; // how many letters are there
        //char[] cArr={};
        tmp = buffer.nextInt();
        for (int i = 0; i<26;i++)
            cMap.put((char)(97+i),0);
        System.out.print("Letter:");
        for(int i = 0; i <tmp ;i++)
        {
            char ccc;
            ccc = (char)(sec.nextInt(26)+97);
            System.out.print(ccc+" ");
            int check = cMap.get(ccc)+1;
            cMap.put(ccc,check);
        }
        System.out.println("");
        for(int i = 97; i <=122 ;i++)
        {
            System.out.print((char)i+":"+cMap.get((char)i)+"\t");
            if((i-97)%5==0)System.out.println("");
        }
        buffer.close();
    }
}
