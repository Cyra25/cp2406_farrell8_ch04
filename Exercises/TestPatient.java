public class TestPatient {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        BloodData bloodData1 = new BloodData();
        System.out.println(patient1.getAge()+"\n"+
                patient1.getIdNum()+"\n"+
                bloodData1.getBloodType()+
                bloodData1.getRhFactor());

        Patient patient2 = new Patient(25,20,"B","-");
        patient2.bloodData.setBloodType("AB");
        patient2.setAge(7);
        patient2.setIdNum(77);
        System.out.println(patient2.getAge()+"\n"+
                patient2.getIdNum()+"\n"+
                patient2.bloodData.getBloodType()+
                patient2.bloodData.getRhFactor());
    }
}
