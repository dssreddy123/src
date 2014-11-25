package com.as.Client;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CharCount 
{

public static void main(String[] args)  throws FileNotFoundException
{

   Scanner text = new Scanner (new File("data.txt"));
   String word = null;
    int count = 0;
    while(text.hasNextLine())
    {
        word = text.nextLine();
        for (int i = 0; i < word.length(); i++)
        {
        	if (word.charAt(i) == 's')
            {
                count++;
                
            }
        	
        }
       
    }
    System.out.print("Total number of 'a' s in data.txt file is :  " + count);
}
}