package first;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_random {

	public static void main(String[] args) {
	
		int a,c;
		BigInteger b = new BigInteger("1");		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���������� �����:");
		if(sc.hasNextInt()){
			c = sc.nextInt();		

			if (c>0){
					for(a=1; a<=c; a++)
						b = b.multiply(new BigInteger(String.valueOf(a)));
						System.out.println("�������� �������  " +b);
						}
				else {
					System.out.println("� �� ����� ���������� �����");
		
					}
		}
			else{
				System.out.println("� �� ����� ���������� �����");				
			}
			
		}
		
		
		}
		

		




