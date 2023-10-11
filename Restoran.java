
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Raisya Ramadhani
 */
public class Restoran {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String MenuMakanan;
        int harga;
        int total = 0;
        int Pembayaran;
        int Menumakanan;
        Boolean status = true;
        do {
            System.out.println("List Harga\n 1. Almond Croissant 33000 \n 2. Doughnut Hazelnut 29000 \n 3. Spaghetti Carbonara 65000\n 4. Chesee Toast 21000 \n 5. Bacon 43000");
            System.out.println("Mau beli apa?");
            Menumakanan = s.nextInt();

            if (Menumakanan == 1) {
                MenuMakanan = "Almond Croissant";
            } else if (Menumakanan == 2) {
                MenuMakanan = "Doughnut Hazelnut";
            } else if (Menumakanan == 3) {
                MenuMakanan = "Spaghetti Carbonara";
            } else if (Menumakanan == 4) {
                MenuMakanan = "Cheese Toast";
            } else {
                MenuMakanan = "Bacon";
            }

            switch (Menumakanan) {
                case 1:
                    harga = 33000;
                    total += harga;
                    break;
                case 2:
                    harga = 29000;
                    total += harga;
                    break;
                case 3:
                    harga = 65000;
                    total += harga;
                    break;
                case 4:
                    harga = 21000;
                    total += harga;
                    break;
                case 5:
                    harga = 43000;
                    total += harga;
                    break;

                default:
                    harga = 0;
                    break;
            }
            System.out.println("Apakah ada yang mau dipesan lagi? (yes/no)");
            String lagi = s.next();
            if (lagi.equalsIgnoreCase("no")) {
                status = false;
            } else {
                status = true;
            }
        } while (status);
        System.out.println("Total: " + total);
    }
}

