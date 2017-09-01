import java.io.*;
import java.util.*;
class rever
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String s1[]=st.split(" ");
        String d="";
        for(int i=s1.length-1;i>=0;i--)
        {
            d=d+s1[i]+" ";
        }
        d.trim();
        System.out.print(d);
    }
}

