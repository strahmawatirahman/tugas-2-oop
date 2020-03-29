import java.util.Scanner;
public class DatdirInput{
	
	public static void main(String[] args){
		String stb, nama, jurusan, fakultas;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Nim anda : ");
			stb=input.nextLine();
		System.out.print("Input Nama anda : ");
			nama=input.nextLine();
		System.out.print("Input Fakultas anda : ");
			fakultas=input.nextLine();
		System.out.print("Input Jurusan anda : ");
			jurusan=input.nextLine();
		
		System.out.println("\nHasil :\nBiodata Mahasiswa");
		System.out.println("Nim 		: "+(stb));
		System.out.println("Nama 		: "+(nama));
		System.out.println("Fakultas 	: "+(fakultas));
		System.out.println("Jurusan 	: "+(jurusan));
	}

} 
