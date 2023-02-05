package Strings;

import java.util.Scanner;

public class string {
    public static void main(String[] args)
    {
        String str="vaishu";
        String str1="vaishu";
        String st=new String("vaishu");
        String[] fruits={"mango", "apple","banana"};
        //whether string is equal or not
        /*if(str.equals(st))    // when content of string is same
        System.out.println("string is equal");
        else
        System.out.println("not equal");
       
        if(str==str1)    //when 2 objects pointing to same string
        System.out.println("string is equal");
        else
        System.out.println("not equal");*/
        //System.out.print(str+st);
        Scanner sc= new Scanner(System.in);
        //String s= sc.nextLine();
        //System.out.println(s.length());
        String firstname="vaishnavi";
        String lastname="thakur";
        //concatenation
        //System.out.println(firstname.concat(lastname));  //no space in between
        String fullname=firstname+" "+lastname;    //with a space
       // System.out.println(fullname);

       //print character at particular index
        //System.out.println(fullname.charAt(5));
        //printLetters(fullname);
        String s="racecar";
        //palindrome(s);
        String path="WNEENESENNN";
        //shortestPath(path);
        //findSubString(fullname, 2, 5);
        //System.out.println(fullname.substring(2,5));
        String r="rrrrrrrrtyuuhgvhyrrr";
        String k="r";
        //countchar(r);
        //lexiographic(fruits);
        System.out.println(st.toUpperCase());

    }

    //print all character in a string
    public static void printLetters(String str)
    {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    //check whether a string is a palindrome or not
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("not a palindrome");
            return false;}
        }
        System.out.println("palindrome");
        return true;
    }

    //find the shortest path
    public static void shortestPath(String str){
        int x=0, y=0;
        for(int i=0;i<str.length();i++){
            
            // north
            if(str.charAt(i)=='N')
            y++;
            //south
            if(str.charAt(i)=='S')
            y--;
            //east
            if(str.charAt(i)=='E')
            x++;
            //west
            if(str.charAt(i)=='W')
            x--;
        }
        int length=x*x+y*y;
        System.out.println(Math.sqrt(length));
    }

    // substring 
    public static void findSubString(String str, int si, int ei){
        for(int i=si;i<ei;i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void countchar(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='r')
            count++;
        }
        System.out.println(count);
    }

    //print largest string lexiographic
    public static void lexiographic(String[] str){
        String largest= str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0)
            largest=str[i];

        }
        System.out.println(largest);
    }
}
