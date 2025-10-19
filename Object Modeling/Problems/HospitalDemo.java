import java.util.ArrayList;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    void showPatient() {
        System.out.println("Patient: " + name);
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        patients.add(patient);
        System.out.println(name + " is consulting patient " + patient.name);
    }

    void showPatients() {
        System.out.println("Doctor: " + name + " has consulted patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showDoctors() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor d : doctors) {
            System.out.println("- " + d.name);
        }
    }

    void showPatients() {
        System.out.println("Patients in " + hospitalName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Smith");
        Doctor d2 = new Doctor("Dr. Johnson");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        Patient p3 = new Patient("Charlie");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);
        d2.consult(p3);

        hospital.showDoctors();
        hospital.showPatients();
        System.out.println();

        d1.showPatients();
        d2.showPatients();
    }
}
