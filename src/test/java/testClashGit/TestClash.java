package testClashGit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestClash {

    @BeforeAll
    static void setUp(){
        System.out.println("### @BeforAll |");
    }


    @Test
    void simpleTest1() {
        System.out.println("### simpleTest1 |");
        Assertions.assertTrue(1<=13);
    }
    @Test
    void simpleTest2(){
        System.out.println("### simpleTest2 |");
        Assertions.assertTrue(15>=2);
    }
}
