import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<>();
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role){
        super(id);
        this.role=role;
    }
    // TO DO: Implement HIPAACompliantUser!
    
    @Override
    public boolean assignPin(int pin) {
        int length = (int)(Math.log10(pin)+1);
        if(length == 6){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if(confirmedAuthID != this.id){
            this.authIncident();
            return false;
        }
        else{
            return true;
        }
    }

    // TO DO: Implement HIPAACompliantAdmin!
    

    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }

    
    // TO DO: Setters & Getters
}
