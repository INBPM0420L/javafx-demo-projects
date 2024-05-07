package boardgame.model;

public enum Square {
    NONE,
    HEAD,
    TAIL;

    public Square next() {
        return switch (this) {
            case NONE -> Square.HEAD;
            case HEAD -> Square.TAIL;
            case TAIL -> Square.NONE;
        };
    }
}
