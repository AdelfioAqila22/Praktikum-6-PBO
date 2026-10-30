public class CustomerService extends PegawaiBank {
    private int ratingKepuasan;

    public CustomerService(String id, String nama, double gajiPokok, int ratingKepuasan) {
        super(id, nama, gajiPokok);
        this.ratingKepuasan = ratingKepuasan;
    }

    @Override
    public double hitungGap() {
        double bonus = ratingKepuasan * 500000;
        return gajiPokok + bonus;
    }
}
