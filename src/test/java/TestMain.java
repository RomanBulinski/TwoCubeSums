import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void test1(){
        assertEquals(false, Main.hasTwoCubeSums(1));
    }

    @Test
    public void test2(){
        assertEquals(true, Main.hasTwoCubeSums(1729));
    }

    @Test
    public void test3(){
        assertEquals(false, Main.hasTwoCubeSums(42));
    }

    @Test
    public void test4(){
        assertEquals(true, Main.hasTwoCubeSums(4104));
    }

    @Test
    public void test5(){
        assertEquals(false, Main.hasTwoCubeSums(4105));
    }


}
