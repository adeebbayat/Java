
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
    public Physician(Integer id){
        super(id);
    }
    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
        int length = (int)(Math.log10(pin)+1);
        if(length == 4){
            return true;
        }
        else{
            return false;
        }
        
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    if(confirmedAuthID != this.id){
        return false;
    }
    else{
        return true;
    }
    }
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	
    // TO DO: Setters & Getters
}
