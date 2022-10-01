import java.util.Scanner;

public class kdvtutarıhesaplayanprogram {

	public static void main(String[] args) {
		
		double sayı , kdv = 0.18, kdv2 = 0.8, kdvhesapla, kdvtutarı;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("kdv hesaplanacak tutarı giriniz: ");
		sayı = input.nextDouble();
		
		
	
		if(sayı>=0 && sayı<=100) {
			
			 kdvhesapla = (kdv * sayı) + sayı;
			
			 kdvtutarı = kdvhesapla - sayı;
			
			System.out.println("kdv'siz fiyat: " + sayı);
			System.out.println("kdv'li fiyat: " + kdvhesapla);
			System.out.println("kdv tutar: " + kdvtutarı);
		}else {
			
			 kdvhesapla = (kdv2 * sayı) + sayı;
			
			 kdvtutarı = kdvhesapla - sayı;
			
			System.out.println("kdv'siz fiyat: " + sayı);
			System.out.println("kdv'li fiyat: " + kdvhesapla);
			System.out.println("kdv tutar: " + kdvtutarı);
		}
		
	}

}
