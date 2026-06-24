public class InPatient {
}
the code; public class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRoomRate;
}
    public InPatient(String patientId, String name, int age, double baseFee, int daysAdmitted, double dailyRoomRate) {
        super(patientId, name, age, baseFee); 
        this.daysAdmitted = daysAdmitted;
        this.dailyRoomRate = dailyRoomRate;
    }

    @Override
    public double calculateBill() {
        return baseFee + (daysAdmitted * dailyRoomRate);
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: InPatient | Total Bill: $" + calculateBill();
    }
