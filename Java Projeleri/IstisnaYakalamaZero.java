package javaileprogramlama;

public class IstisnaYakalamaZero {
	public static void main(String arg[]) {
		int a, b, c;
		a = 5;
		b = 0;
		{
			try {
				c = a / b;
			} catch (Exception ex) {
				System.out.println("Hata Yakalandi " + ex);
			} finally {
				System.out.println("bitti");
			}
			System.out.println("Main metot sonuuuu");
		}

	}
}