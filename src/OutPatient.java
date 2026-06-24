public class OutPatient {
}
the code: public class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double baseFee, double consultationFee) {
        super(patientId, name, age, baseFee);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return baseFee + consultationFee;
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: OutPatient | Total Bill: $" + calculateBill();
    }
}