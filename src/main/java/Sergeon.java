public class Sergeon extends Doctor {

    private boolean isOperating;


    public Sergeon(String employeeNumber, String name, String speciality, boolean isOperating) {
        super(employeeNumber, name, speciality);
        this.isOperating = isOperating;
    }

    @Override
    public int calculatePay() {
        return 120000;
    }
}
