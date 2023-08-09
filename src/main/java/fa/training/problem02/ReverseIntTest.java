package fa.training.problem02;

import main.java.fa.training.problem02.ReverseInt;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseIntTest {
    @Test
    public void reverseIntTest1(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverseInt(145);
        assertEquals(541, result);
    }

    @Test
    public void reverseIntTest2(){
        ReverseInt reverseInt = new ReverseInt();
        int result =  reverseInt.reverseInt(9610);
        assertEquals(169, result);
    }

    @Test
    public void reverseIntTest3(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverseInt(10);
        assertEquals(1, result);
    }

    @Test
    public void reverseIntTest4(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverseInt(1);
        assertEquals(1, result);
    }

    @Test
    public void reverseIntTest5(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverseInt(1234567);
        assertEquals(7654321, result);
    }
}
