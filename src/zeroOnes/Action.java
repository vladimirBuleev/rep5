package zeroOnes;

public class Action {
    String value;
    AmountSymbols amountSymbols = new AmountSymbols();

    Action(String value) {
        this.value = value;
    }

    public void action() {
        OddOrEvenForOnes oddOrEvenForOnes = new OddOrEvenForOnes();
        OddOrEvenForZeroes oddOrEvenForZeroes = new OddOrEvenForZeroes();
        if (oddOrEvenForZeroes.oddOrEven(amountSymbols.getAmountSymbols(value, '0'))&& oddOrEvenForOnes.oddOrEven(amountSymbols.getAmountSymbols(value, '1'))) {
            System.out.println("работает");
        } else {
            System.out.println("не работает");
        }

    }
}
