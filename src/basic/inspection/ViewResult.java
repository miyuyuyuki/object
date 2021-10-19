package basic.inspection;

import java.util.ArrayList;
import java.util.Arrays;

class ViewResult {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.addAll(Arrays.asList(
                new patient("202010110910","山田太郎","2021-10-19T13:45:30",36.4,85,122,84)
        ));

        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
