
package Test_inheritanceekat;


import people.Person;
import people.Patient;
import people.Doctor;
import hospital.PatientQueue;
public class InheritanceEkat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***Inheritance***");
        
        System.out.println("testing known person");
        Person eka = new Person ("Ekaterina");
        System.out.println(eka.getInfo());
        
        System.out.println("*1.c) TESTING unknown person");
        Person unknown = new Person ();
        System.out.println(unknown.getInfo());
        
        System.out.println("*2.a) TESTING known patients");
        Patient knownPatient = new Patient ("Adam", 120, 80, "hearth surgery");
        System.out.println(knownPatient.getInfo());
        
        Patient KatePatient = new Patient ("Kate", 110, 85, "poisoning treatment");
        Patient PavelPatient = new Patient ("Pavel", 115, 75, "fewer cure");
        Patient PatricPatient = new Patient ("Patric", 130, 80, "heart surgery");
        Patient JaakkoPatient = new Patient ("Jaakko", 125, 81, "physical therapy");
        Patient JamesPatient = new Patient ("James", 145, 70, "skin treatment");
        
        System.out.println("*3 b TESTING PATIENT QUEQUE: empty");
        PatientQueue pq = new PatientQueue("Anni", "plastic surgery");
        System.out.println(pq.getInfo());
        
        System.out.println("*3 a TESTING PATIENT QUEQUE: 5 patients");
        pq.addPatient(KatePatient);
        pq.addPatient(PavelPatient);
        pq.addPatient(PatricPatient);
        pq.addPatient(JaakkoPatient);
        pq.addPatient(JamesPatient);
        System.out.println(pq.getInfo());
        
        System.out.println("*3 a TESTING PATIENT QUEQUE without 1 patient: 4 patients");
        pq.removePatient(KatePatient);
        System.out.println(pq.getInfo());
        
        System.out.println("* TESTING Doctor");
        Doctor cardiologist = new Doctor("Pr", "Derec Shepherd", "Neurosurgeon");
        System.out.println(cardiologist.getInfo());
              
        
    }
    
}
