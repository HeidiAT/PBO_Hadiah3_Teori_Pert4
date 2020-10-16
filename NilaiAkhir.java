import java.util.Scanner;

public class NilaiAkhir
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String nama;
		double tgs1, tgs2, tgs3, rata, mid, nfinal, akhir;
		System.out.print("Masukkan Nama: ");
			nama = input.nextLine();
		System.out.print("Masukkan Nilai Tugas 1: ");
			tgs1 = input.nextInt();
		System.out.print("Masukkan Nilai Tugas 2: ");
			tgs2 = input.nextInt();
		System.out.print("Masukkan Nilai Tugas 3: ");
			tgs3 = input.nextInt();
		rata = (tgs1+tgs2+tgs3)/3;
		System.out.println("Nilai Rata-Rata Tugas= "+rata);
		System.out.print("Masukkan Nilai Mid: ");
			mid = input.nextInt();
		System.out.print("Masukkan Nilai Final: ");
			nfinal = input.nextInt();
		System.out.println();
		System.out.println("Nama: "+nama);
		akhir = (rata * 0.3)+(mid * 0.3)+(nfinal * 0.4);
		System.out.println("Nilai Akhir: "+akhir);
		
		if (akhir >=80)
		{
			System.out.println("Nilai Huruf = A");
		}
		else if (akhir>=60)
		{
			System.out.println("Nilai Huruf = B");
		}
		else if (akhir>=50)
		{
			System.out.println("Nilai Huruf = C");
		}
		else if (akhir>=40)
		{
			System.out.println("Nilai Huruf = D");
		}
		else
			System.out.println("Nilai Huruf = E");
	}
}