package org.example.proxy;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new DoctorImpl();

        Proxy proxy = new Proxy("Blocked"); 

        String patientName = "amro";
        if (!proxy.isPatientBlocked(patientName)) {
            doctor.check();
        } else {
            System.out.println("Patient " + patientName + " is blocked. Check cannot be performed.");
        }
    }


}
