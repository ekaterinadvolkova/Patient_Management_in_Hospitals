
package hospital;
import people.Doctor;
import people.Patient;
import java.util.ArrayList;
/**
 *
 * @author ekate
 */
public class PatientQueue {
    private String hospitalName;
    private String department;
    private Doctor doctorInCharge;
    private ArrayList <Patient> queue= new ArrayList<>();
    //hospital has a queue for the treatment
    //Show the queue
    //constructor
    public PatientQueue (String hospitalName, String department){
        this.hospitalName=hospitalName;
        this.department=department;
    }
    //add patient
    public void addPatient(Patient pat){
        this.queue.add(pat);
    }
    //remove patient
    public void removePatient(Patient pat){
        this.queue.remove(pat);
    }
    //get info
    public String getInfo(){
        String temp="**PATIENT QUEQUE "+this.department+ " in "+this.hospitalName+"*****/n";
        temp+= "Doctor in charge: "+ this.doctorInCharge;
        temp +="\nPatients in queue are";
        
        temp = this.queue.stream().map((pat) -> "\n -"+ pat.getInfo()).reduce(temp, String::concat);
        return temp;
    }
}
