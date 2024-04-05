package se.lexicon.Sequencers;

public class TodoItemTaskIdSequencer {
    private static int currentId;

    public static int nextId() {
        return currentId++;
    }

    public static void setCurrentId(int id) {
        currentId = id;
    }

    public static int getCurrentId() {
        return currentId;
    }
}
