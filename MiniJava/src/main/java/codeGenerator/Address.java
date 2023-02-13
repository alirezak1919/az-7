package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    private final int num;
    private final TypeAddress type;
    private final VarType varType;

    public Address(int num, VarType varType, TypeAddress Type) {
        this.num = num;
        this.type = Type;
        this.varType = varType;
    }

    public Address(int num, VarType varType) {
        this(num, varType, TypeAddress.Direct);
    }

    public int getNum() {
        return num;
    }

    public VarType getVarType() {
        return varType;
    }

    public String toString() {
        return type.getSymbol() + num;
    }
}
