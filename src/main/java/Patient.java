public class Patient {

    private int healthLevel;
    private int bloodLevel;



    public int getHealthLevel() {
        return healthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }



    //Default constructor
    public Patient() {
        healthLevel = 10; // Default value
        bloodLevel = 20; // Default value

    }

    //overloaded constructor
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;

    }

    public void increaseHealthLevel(int healthIncreaseAmmount) {
        healthLevel += healthIncreaseAmmount;
    }

    public void decreaseBloodLevel(int decreaseBloodAmount) {
        bloodLevel -= decreaseBloodAmount;
    }
}
