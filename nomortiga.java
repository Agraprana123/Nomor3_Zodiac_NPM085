import java.util.Scanner;

public class nomortiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir (contoh: 10 untuk 10 Januari): ");
        int tanggal = scanner.nextInt();

        System.out.print("Masukkan bulan lahir (contoh: 3 untuk Maret): ");
        int bulan = scanner.nextInt();

        if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            System.out.println("Zodiak Anda adalah Aquarius");
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            System.out.println("Zodiak Anda adalah Pisces");
        } else if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            System.out.println("Zodiak Anda adalah Aries");
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            System.out.println("Zodiak Anda adalah Taurus");
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            System.out.println("Zodiak Anda adalah Gemini");
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            System.out.println("Zodiak Anda adalah Cancer");
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            System.out.println("Zodiak Anda adalah Leo");
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            System.out.println("Zodiak Anda adalah Virgo");
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            System.out.println("Zodiak Anda adalah Libra");
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            System.out.println("Zodiak Anda adalah Scorpio");
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            System.out.println("Zodiak Anda adalah Sagittarius");
        } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            System.out.println("Zodiak Anda adalah Capricorn");
        } else {
            System.out.println("Tanggal lahir tidak valid.");
        }
    }
}