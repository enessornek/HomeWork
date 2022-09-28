
public class HomeWork {

	
		public static void main(String[] args) {
			sayiBulmaca();
			sayiBulmaca();
			sayiBulmaca();
			sayiBulmaca();

		}

		public static void sayiBulmaca() {
			int[] sayilar = new int[] { 3, 5, 6, 7, 0, 4 };
			int aranacak = 6;
			boolean varMi = false;

			for (int sayi : sayilar) {

				if (sayi == aranacak) {
					varMi = true;
					break;
				}
			}

			if (varMi) {
				mesajVer("Sayı mevcuttur " + aranacak);
			} else {
				mesajVer("Sayı mevcut değildir " + aranacak);
			}
		}

		public static void mesajVer(String mesaj) {
			System.out.println(mesaj);

		}
}

	


