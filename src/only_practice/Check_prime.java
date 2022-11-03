package only_practice;

import java.util.Scanner;

public class Check_prime {

	public static void main(String[] args) {
		// to check no. is prime or not
		
		int no=12;
		int temp=0;
		for(int i=2;i<=no-1;i++) {
		if(no%i==0) {
			temp=temp+1;
		}	
		}if(temp>0) {
				System.out.println("no.is not prime no");
			}else {
				System.out.println("no.is prime no.");
			}
		}
		

	}

