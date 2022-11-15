package Calc2;

public enum OperationType {
    ADD("+"), DIVISION("/"), MULTIPLY("*"), SUB("-"),WRONG(null);

    private final String symbol;
    OperationType(String symbol){
        this.symbol=symbol;

    }public static OperationType getOperationType(String symbol){

        for(OperationType type: values()){
            if(symbol.equalsIgnoreCase(type.symbol))
                return type;
            }return WRONG;
        }

}
