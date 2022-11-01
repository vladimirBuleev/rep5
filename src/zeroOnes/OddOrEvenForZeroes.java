package zeroOnes;

public class OddOrEvenForZeroes implements IOddOrEven {
    @Override
    public boolean oddOrEven(int value) {
        if(value%2==0){
            return false;
        }else{
            return true;
        }
    }
}
