package zeroOnes;

public class OddOrEven implements IOddOrEven {
    public boolean oddOrEven(int value){
        if(value%2==0){
            return true;
        }else{
            return false;
        }
    }
}
