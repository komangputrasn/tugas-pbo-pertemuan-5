import java.util.Scanner;

public class Lingkaran {
    private int jariJari;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Input Data Lingkaran ---");

        System.out.print("Masukan jari-jari: ");
        this.jariJari = sc.nextInt();

        System.out.println("----------------------------");
    }

    public void showLuas() {
        double luas = 3.14 * Math.pow(this.jariJari, 2);
        System.out.printf("Luas lingkaran = %.2f\n", luas);
    }
}
