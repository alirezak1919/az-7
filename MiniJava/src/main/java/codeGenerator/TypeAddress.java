package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public enum TypeAddress {
    Direct(""),
    Indirect("@"),
    Immediate("#");

    TypeAddress(String symbol) {
        this.symbol = symbol;
    }

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }
}