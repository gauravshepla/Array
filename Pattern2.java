/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern2;

import java.util.Scanner;
public class Pattern2 {

   
    public static void main(String[] args) {
      int n,i,j,k;
        System.out.println("HOW MANY LINES?");
       Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=n;j>i;j--)
            {
            System.out.print(" *");
            }
            System.out.println(" ");
            for(k=0;k<=i;k++)
            {System.out.print(" ");}
         
        }
        System.out.println("END OF EXECUTION");
    }
    
}