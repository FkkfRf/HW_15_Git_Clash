package testClashGit;

import org.junit.jupiter.api.*;

import java.util.Random;

public class TestClash {
// переменная для сравнения с целым в тестах
    public int nxt;
    @BeforeAll
    static void setUp(){
        System.out.println("### @BeforAll |");
        int nxt = new Random().nextInt(10);
        System.out.println("Random number between 0 and 10 is : " + nxt);
    }
    @Test
    void simpleTest1() {
        System.out.println("### simpleTest1 |");
        Assertions.assertTrue(nxt > 10 );
    }
        @Test
        void simpleTest2(){
            System.out.println("### simpleTest2 |");
            Assertions.assertTrue(nxt < 0);
    }
}
