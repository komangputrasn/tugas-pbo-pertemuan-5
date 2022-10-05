import java.util.Scanner;

public class Segitiga {
    private int alas;
    private int tinggi;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Input Data Segitiga ---");
        
        System.out.print("Masukan alas: ");
        this.alas = sc.nextInt();
        
        System.out.print("Masukan tinggi: ");
        this.tinggi = sc.nextInt();

        System.out.println("---------------------------");
    }
    
    public void showLuas() {
        double luas = 0.5 * this.alas * this.tinggi;
        System.out.printf("Luas segitiga = %.2f\n", luas);
    }
}