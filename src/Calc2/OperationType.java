package Calc2;

public enum OperationType {
    ADD("+"), DIVISION("/"), MULTIPLY("*"), SUB("-"),WRONG(null);

    String symbol;
    OperationType(String symbol){
        this.symbol=symbol;

    }public OperationType getOperationType(String symbol){

        for(OperationType type: values()){
            if(symbol.equalsIgnoreCase(type.symbol))
                return type;
            else{
                return WRONG;
            }

        }return null;
    }
}
