import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

public class game1{
    public static void main(String[] args) {



        /*IT IS SAME GAME AS GAME2 DIFFERENCE IS  HERE WE COUNT NUMBER  WHEN COMPUTER AND USER GIVE SAME NUMBER AND THAT CONSIDER 1 POINT */

        Random sc=new Random();
       // int a=sc.nextInt(0,3);
        System.out.println("...........GAMING PROJECT.........");
        System.out.println("You have to enter any one number for this game in between 0---2 ");
        System.out.println("Enter 0 for Stone ");
        System.out.println("Enter 1 for Paper ");
        System.out.println("Enter 2 for Scissors \n");
        Scanner sc1=new Scanner(System.in);
        //System.out.print("\nPlease enter your number: ");
        //int b=sc1.nextInt();
        //System.out.println("Computer given number is:"+a);
        int p,q,r;
        p=0;
        q=0;
        r=0;
    int i;
for(i=1;i<=5;i++)
{
    switch(i)
    {
        case 1->
        System.out.println("FIRST MATCH....");
        case 2->
        System.out.println("SECOND MATCH...");
        case 3->
        System.out.println("THIRD MATCH....");
        case 4->
        System.out.println("FOURTH MATCH.....");
        case 5->
        System.out.println("FIFTH MATCH.....");
    }
        int a=sc.nextInt(0,3);
        System.out.print("\nPlease enter your number: ");
        int b=sc1.nextInt();
        System.out.println("Computer given number is:"+a);
switch(b)
{
    case 0->
    {
             if(a==0)
            {
               System.out.printf("\nBoth produce same number.\nSo,both are winner");
              // p=p+1;
              q=q+1;
              r=r+1;

            }
           else  if(a==1)
            {
               System.out.printf("\nComputer is the Winner");
               q=q+1;
            }
            else  if(a==2)
            {
            System.out.printf("\nYou are the winner");
            r=r+1;
            }
    }
    case 1->
    {
        if(a==1)
        {
           System.out.printf("\nBoth produce same number.\nSo,both are winner");
          // p=p+1;
           q=q+1;
           r=r+1;
        }
       else  if(a==0)
        {
           System.out.printf("\nYou are  the Winner");
           r=r+1;
        }
        else  if(a==2)
        {
        System.out.printf("\nComputer is  the Winner");
        q=q+1;
        }
    }
    case 2->
    {
        if(a==2)
        {
           System.out.printf("\nBoth produce same number.\nSo,both are winner");
          // p=p+1;
          q=q+1;
          r=r+1;
        }
       else  if(a==1)
        {
           System.out.printf("\nYou are the Winner");
           r=r+1;
        }
        else  if(a==0)
        {
        System.out.printf("\nComputer is the winner");
        q=q+1;
        }
    }
    default ->
    {
        System.out.println("PLEASE ENTER CORRECT NUMBER!");
    }
}
System.out.println("\n");
    }
    System.out.println("Now your final result:"+r);
    System.out.println("Now Computer final result:"+q);

    System.out.println("FINAL RESULT........");
   
    if(q>r)
    {
        System.out.println("Computer is  the  winner");
           
    }
    else if(r>q)
    {
            System.out.println("You are the  winner");

           }
    else
    {
        System.out.println("Both are winner");

    }
    }
}



