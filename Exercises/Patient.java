public class Patient {
    int idNum, age;

    public BloodData bloodData;

    public Patient(){
        idNum = 0;
        age = 0;
        bloodData = new BloodData();
    }

    public Patient(int id, int a, String bt, String rh){
        this.idNum = id;
        this.age = a;
        this.bloodData = new BloodData(bt, rh);
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setIdNum(int id) {
        this.idNum = id;
    }

    public int getAge() {
        return age;
    }

    public int getIdNum() {
        return idNum;
    }
}
