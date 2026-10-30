import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        ArrayList<PegawaiBank> daftarPegawai = new ArrayList<>();

        daftarPegawai.add(new Teller("T001", "Andi", 4000000, 150));
        daftarPegawai.add(new Teller("T002", "Siti", 4000000, 200));
        daftarPegawai.add(new CustomerService("CS001", "Budi", 4500000, 4));
        daftarPegawai.add(new ManajerBank("M001", "Dewi", 10000000, true));
        daftarPegawai.add(new ManajerBank("M002", "Joko", 10000000, false));

        System.out.println("=== LAPORAN GAJI PEGAWAI BANK ===");
        for (PegawaiBank p : daftarPegawai) {
            p.cetakSlipGaji();
        }

        int jumlahTeller = 0;
        int jumlahCS = 0;
        int jumlahManajer = 0;
        double totalPengeluaran = 0;

        for (PegawaiBank p : daftarPegawai) {
            totalPengeluaran += p.hitungGap();

            if (p instanceof Teller) {
                jumlahTeller++;
            } else if (p instanceof CustomerService) {
                jumlahCS++;
            } else if (p instanceof ManajerBank) {
                jumlahManajer++;
            }
        }

        System.out.println("\n=== STATISTIK & TOTAL PENGELUARAN BANK ===");
        System.out.println("Jumlah Teller          : " + jumlahTeller);
        System.out.println("Jumlah Customer Service: " + jumlahCS);
        System.out.println("Jumlah Manajer         : " + jumlahManajer);
        System.out.println("Total Pegawai          : " + daftarPegawai.size());
        System.out.println("Total Pengeluaran Bank : Rp " + totalPengeluaran);
    }
}