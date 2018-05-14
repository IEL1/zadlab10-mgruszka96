/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author student
 */
public class zad2 
{
    public static void main(String[] args)
    {
        int liczba1;
        int liczba2;
        int iloscWyjatkow = 0;
        int wynik = 0;
        boolean wylacz = false;
        Random losujLiczbe = new Random();
 
        while(wylacz!=true)
        {
            if(iloscWyjatkow>=3)
            {
                wylacz=true;
               
            }
            else
            {
                
                
              liczba1 = losujLiczbe.nextInt(2-(-2))+-2;
                liczba2 = 0;
                System.out.print("\n"+liczba1 + " / " + liczba2 + " = ");
 
                try
                {
                    wynik = liczba1/liczba2;
                    System.out.print(wynik);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                    iloscWyjatkow++;
                }
            }
        }
    }
}