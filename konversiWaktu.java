public class KonversiWaktu{
	int totDetik, detik, totMenit, menit, totJam, jam;

	public KonversiWaktu(){
	totDetik = 128377;
	detik = totDetik%60;
	totMenit = totDetik/60;
	menit = totMenit%60;
	totJam =  totMenit/60;
	jam = totJam%24;
	}

	public static void main(String[] args){

	KonversiWaktu waktu = new KonversiWaktu();

	System.out.print(+waktu.jam + " Jam " +waktu.menit + " Menit " +waktu.detik +" Detik ");	
	}
}