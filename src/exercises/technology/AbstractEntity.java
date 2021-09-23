package exercises.technology;

public abstract class AbstractEntity {
    public static int nextId = 1;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        AbstractEntity.nextId = nextId;
    }

    public abstract void assignId();
}
