package main.java.fa.training.problem02;

public class ReverseInt {

    public int reverseInt(int input) {
        int result = 0;
        while (input != 0) {
            result = result * 10 + input % 10;
            input /= 10;
        }
        return result;
    }
}
