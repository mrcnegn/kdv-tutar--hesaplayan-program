import java.util.Scanner;

public class kdvtutar�hesaplayanprogram {

	public static void main(String[] args) {
		
		double say� , kdv = 0.18, kdv2 = 0.8, kdvhesapla, kdvtutar�;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("kdv hesaplanacak tutar� giriniz: ");
		say� = input.nextDouble();
		
		
	
		if(say�>=0 && say�<=100) {
			
			 kdvhesapla = (kdv * say�) + say�;
			
			 kdvtutar� = kdvhesapla - say�;
			
			System.out.println("kdv'siz fiyat: " + say�);
			System.out.println("kdv'li fiyat: " + kdvhesapla);
			System.out.println("kdv tutar: " + kdvtutar�);
		}else {
			
			 kdvhesapla = (kdv2 * say�) + say�;
			
			 kdvtutar� = kdvhesapla - say�;
			
			System.out.println("kdv'siz fiyat: " + say�);
			System.out.println("kdv'li fiyat: " + kdvhesapla);
			System.out.println("kdv tutar: " + kdvtutar�);
		}
		
	}

}
