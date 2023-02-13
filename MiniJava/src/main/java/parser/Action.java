package parser;

public class Action {
    private final Act action;
    private final int number;

    public Action(Act action, int number) {
        this.action = action;
        this.number = number;
    }

    public Act getAction() {
        return action;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        switch (getAction()) {
            case accept:
                return "acc";
            case shift:
                return "s" + number;
            case reduce:
                return "r" + number;
        }
        return action.toString() + number;
    }
}

enum Act {
    shift, reduce, accept
}
