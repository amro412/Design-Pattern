package proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy {

    List<String> blockedPatients = new ArrayList<String>();

    public Proxy(String blocked) {
        blockedPatients.add("Alex");
        blockedPatients.add("Sam");
    }

    public boolean isPatientBlocked(String patientName) {
        return blockedPatients.contains(patientName);
    }
}
