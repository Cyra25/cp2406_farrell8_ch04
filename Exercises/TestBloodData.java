public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData = new BloodData();
        System.out.println("Blood Type " + bloodData.getBloodType());
        System.out.println("Rh factor " + bloodData.getRhFactor());

        BloodData bloodData1 = new BloodData("AB", "-");
        System.out.println("Blood Type " + bloodData1.getBloodType());
        System.out.println("Rh factor " + bloodData1.getRhFactor());

        bloodData1.setBloodType("A");
        bloodData1.setRhFactor("-");
        System.out.println("Blood Type " + bloodData1.getBloodType());
        System.out.println("Rh factor " + bloodData1.getRhFactor());



    }
}
