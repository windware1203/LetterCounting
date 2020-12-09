import java.security.SecureRandom;
import java.util.*;
/*
*   Using HashMap
* 65-90 Upper
* 97-122 Lower
* */
public class AbcountingHashMap
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
        for (int i = 0; i<26;i++)
            cMap.put((char)(65+i),0);
        System.out.print("Letter:");
        for(int i = 0; i <tmp ;i++)
        {
            char ccc;
            SecureRandom uOrL = new SecureRandom();
            boolean flag = uOrL.nextBoolean();
            if(flag)
                ccc = (char)(sec.nextInt(26)+97);
            else
                ccc = (char)(sec.nextInt(26)+65);
            System.out.print(ccc+" ");
            int check = cMap.get(ccc)+1;
            cMap.put(ccc,check);
        }
        System.out.println("");
        for(int i = 65; i <=90 ;i++)
        {
            System.out.print((char)i+":"+cMap.get((char)i)+"\t");
            if((i-97)%5==0)System.out.println("");
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
