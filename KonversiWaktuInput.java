import java.util.Scanner;
public class KonversiWaktuInput{
	
	public static void main(String[] args){
		
		int ttlDetik, detikSkrng, ttlMenit, menitSkrng, ttlJam, jamSkrng;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan total Detik : ");
		ttlDetik=input.nextInt();
		
		detikSkrng = ttlDetik%60;
		ttlMenit = ttlDetik/60;
		menitSkrng = ttlMenit%60;
		ttlJam = ttlMenit/60;
		jamSkrng = ttlJam%24;
		
		System.out.println("\nKonversi waktu dari "+(ttlDetik)+" detik =");
		System.out.println((jamSkrng)+" JAM : "+(menitSkrng)+" MENIT : "+(detikSkrng)+" DETIK");
}
}
