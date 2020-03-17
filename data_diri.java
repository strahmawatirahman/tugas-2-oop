public class data_diri{
	String stb, nm, prodi, fakultas;
	
	public data_diri(){
		stb="13020180080";
		nm="St.Rahmawati Rahman";
		prodi = "Teknik Informatika";
		fakultas = "Ilmu Komputer";
	}

	public static void main(String[] args){
		data_diri biodata = new data_diri();

		System.out.println("Stambuk		= " + (biodata.stb));
		System.out.println("Nama Lengkap	= " + (biodata.nm));
		System.out.println("PRODI		= " + (biodata.prodi));
		System.out.println("Fakultas	= " + (biodata.fakultas));
	}
}