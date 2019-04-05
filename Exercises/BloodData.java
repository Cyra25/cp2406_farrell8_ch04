public class BloodData {
    public String bloodType;
    public String rhFactor;

    public BloodData(){
        this("O", "+");
        // use this instead of setting it like the following
        // bloodType = "O";
        // rhFactor = "+";
    }
    public BloodData(String bt, String rh){
        bloodType = bt;
        rhFactor = rh;
    }

    public void setBloodType(String bt) {
        this.bloodType = bt;
    }

    public String getBloodType() {
        return bloodType;
    }
    public void setRhFactor(String rh){
        this.rhFactor = rh;
    }
    public String getRhFactor() {
        return rhFactor;
    }
}
