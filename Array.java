/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author 1794331
 */
public class Array {

  
    public static void main(String[] args) {
        int markcount,i;
        float avg,sum=0;
        System.out.println("How many marks for this student?");
        Scanner input=new Scanner(System.in);
        markcount=input.nextInt();
        //array creation
        int[] marks=new int[markcount];
        //Loop
        for(i=0;i<markcount;i++)
        {
             System.out.println("Please enter mark "+(i+1)+": ");
             marks[i]=input.nextInt();
        }
        System.out.print("The marks are: ");
        for(int j=0;j<markcount;j++){
            
        System.out.print(marks[j]);
        if(j<markcount-1)
        {
            System.out.print(",");
        
        }
        }
        for(int k=0;k<markcount;k++)
        {
            sum=sum+marks[k];
            
        }
          System.out.println(" ");
          
          avg=sum/markcount;
          System.out.print("The Average is: "+avg+"%");
    }
    
}
