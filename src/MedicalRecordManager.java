import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MedicalRecordManager {
    private static final String FILE_NAME = "patient_records.txt";


    public static void savePatientsToFile(List<Patient> patients) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Patient p : patients) {
                writer.write(p.toString());
                writer.newLine();
            }
            System.out.println("[File Stream] Records successfully written to " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error interacting with local storage file: " + e.getMessage());
        }
    }
}