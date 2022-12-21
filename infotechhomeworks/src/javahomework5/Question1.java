package javahomework5;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

//		1)Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i 
//	olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara 
//	gore e mail kontrolu yapiniz.
//	   
//	-@ isareti icermiyorsa “gecersiz email” yazdirin
//	-@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
//	-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz” 
//	yazdirin.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen e-mail hesabınızı giriniz");
		
		while(true) {
			String str = input.nextLine();
			if(!str.contains("@")) {
				System.out.println("geçersiz email, tekrar giriniz");
				continue;
			}
			if(!str.contains("@gmail")) {
				System.out.println("lütfen gmail adresinizi girin, tekrar giriniz");
				continue;
			}
			if(!str.contains("@gmail.com")) {
				System.out.println("Yazımda bir sorun var, maili kontrol ediniz. Tekrar giriniz");
				continue;
			}
			System.out.println("emailinizi başarı ile girdiniz!");
			break;
			
		}
		
		
		
		
		
		
		
		
		
	}

}
