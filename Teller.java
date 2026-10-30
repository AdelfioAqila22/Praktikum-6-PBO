public class Teller extends PegawaiBank {
    private int JumlahTransaksi;

    public Teller(String id, String nama, double gajiPokok, int JumlahTransaksi) {
        super(id, nama, gajiPokok);
        this.JumlahTransaksi = JumlahTransaksi;
    }

    @Override
    public double hitungGap() {
        double bonus = JumlahTransaksi * 5000;
        return gajiPokok + bonus;
    }
}