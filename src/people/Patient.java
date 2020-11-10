
package people;

/**
 *Modes patient identified with the name with systolic and diastolic blood pressure
 * @Version 0.1
 * @author ekate
 */
public class Patient extends Person {
    private int distolic;
    private int systolic;
    private String treatment;
    
    //Indetify the patient by blood pressure and the treatment
    public Patient(String name, int systolic, int distolic, String treatment){
        super(name);
        this.distolic=distolic;
        this.systolic=systolic;
        this.treatment=treatment;
    }
    //get info
    @Override
    public String getInfo(){
        return super.getInfo()+", systolic hgmm "+this.systolic+" distolic hgmm "+this.distolic+", "+this.treatment;
    }
    
    
}
