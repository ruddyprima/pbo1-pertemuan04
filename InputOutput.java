import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  int jumlahSks;
  double IPK;

System.out.print("Masukan nama anda: ");
nama = scanner.nextLine();
System.out.println("Hai, "+nama);

System.out.print("masukan jumlah sks yang sudah ditempuh: ");
jumlahSks = scanner.nextInt();

System.out.print("masukan IPK Semenatara : ");
IPK = scanner.nextDouble();

double jumlah = IPK * jumlahSks;
System.out.print("Total Nilai = "+jumlah);

}
}