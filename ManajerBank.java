public class ManajerBank extends PegawaiBank {
    private boolean targetTercapai;

    public ManajerBank(String id, String nama, double gajiPokok, boolean targetTercapai) {
        super(id, nama, gajiPokok);
        this.targetTercapai = targetTercapai;
    }

    @Override
    public double hitungGap() {
        if (targetTercapai) {
            return gajiPokok + (gajiPokok * 0.20);
        } else {
            return gajiPokok;
        }
    }
}
