package exercises.technology;

public class Computer extends AbstractEntity {
    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int storage, int ram, boolean hasKeyboard, int id) {
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public void increaseRAM(int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage(int x) {
        this.storage = this.storage + x;
    }


}
