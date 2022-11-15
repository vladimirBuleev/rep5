package zeroOnes;

public class AmountSymbols {
    public int getAmountSymbols(String value, char symbol) {
        int count = 0;
        char[] values = value.toCharArray();
        for (int i = 0; i < values.length; i++) {
            if (values[i] == symbol) {
                count++;
            }
        }
        return count;
    }
}
