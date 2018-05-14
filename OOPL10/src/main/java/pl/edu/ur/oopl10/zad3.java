/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;


/**
 *
 * @author student
 */
public class zad3 {
    public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try {
			int divide = x / y;
			System.out.println(divide);
		} catch(ArithmeticException e) {
			System.err.println("You can't divide by 0");
		}
	}

}
    
    

