package zeroOnes;

public class Action {
    private final String value;
    AmountSymbols amountSymbols = new AmountSymbols();

    Action(String value) {
        this.value = value;
    }

    public void action() {
        OddOrEven oddOrEven = new OddOrEven();
        if (!oddOrEven.oddOrEven(amountSymbols.getAmountSymbols(value, '0'))&& oddOrEven.oddOrEven(amountSymbols.getAmountSymbols(value, '1'))) {
            System.out.println("работает");
        } else {
            System.out.println("не работает");
        }

    }
}
