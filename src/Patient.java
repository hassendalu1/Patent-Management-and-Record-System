public abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    protected double baseFee;


    private static int totalPatientsCount = 0;


    public Patient(String patientId, String name, int age, double baseFee) {
        if (age < 0 || age > 130) {
            throw new InvalidPatientDataException("Validation Error: Age must be between 0 and 130.");
        }
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.baseFee = baseFee;
        totalPatientsCount++;
    }


    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }


    public static int getTotalPatientsCount() {
        return totalPatientsCount;
    }


    public abstract double calculateBill();

    @Override
    public String toString() {
        return "ID: " + patientId + " | Name: " + name + " | Age: " + age;
    }
}