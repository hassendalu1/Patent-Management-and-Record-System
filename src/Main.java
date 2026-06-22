import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Patient> patientRegistry = new ArrayList<>();
        System.out.println(" Start patent management system ");
        try {
            System.out.println("\n[Testing Validation Engine]: Adding illegal age bounds...");
            Patient badData = new InPatient("P000", "Erroneous Entry", -12, 100, 3, 40);
        } catch (InvalidPatientDataException e) {
            System.out.println(">> Success: Validation Caught Exception -> " + e.getMessage());
        }

        Patient p1 = new InPatient("P101", "Sarah Connor", 34, 200.0, 5, 120.0);
        Patient p2 = new OutPatient("P102", "John Doe", 19, 100.0, 75.0);
        Patient p3 = new InPatient("P103", "James Smith", 72, 200.0, 2, 150.0);

        patientRegistry.add(p1);
        patientRegistry.add(p2);
        patientRegistry.add(p3);

        System.out.println("\n--- Processing Runtime Polymorphic Billing Structures ---");
        for (Patient p : patientRegistry) {
            System.out.println(p);
        }

        System.out.println("\nTotal instantiated tracking instances inside memory matrix: "
                + Patient.getTotalPatientsCount());

        System.out.println("\n--- Initializing Local Storage Stream Core ---");
        MedicalRecordManager.savePatientsToFile(patientRegistry);

        System.out.println("\n--- Initializing External Relational Database Sink ---");
        DatabaseLogger.logSystemAccess("Executed runtime processing checkpoint synchronization.");

        System.out.println("PROGRAM COMPLETED SUCCESSFULLY");
    }
}