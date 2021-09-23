package exercises.technology;

public class SmartPhone extends Computer {
    private int numberOfSelfies;

    public SmartPhone(int storage, int ram, boolean hasKeyboard, int id, int numberOfSelfies) {
        super(storage, ram, hasKeyboard, id);
        this.numberOfSelfies = numberOfSelfies;
    }

    public void takeSelfie() {
        this.numberOfSelfies = this.numberOfSelfies + 1;
    }

    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }

}
