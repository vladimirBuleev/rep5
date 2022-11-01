package zeroOnes;

public class OddOrEvenForOnes implements IOddOrEven {
    public boolean oddOrEven(int value){
        if(value%2==0){
            return true;
        }else{
            return false;
        }
    }
}
