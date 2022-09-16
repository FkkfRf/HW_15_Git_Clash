package testClashGit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestClash {

    @BeforeAll
    static void setUp(){
        System.out.println("### @BeforAll |");
    }


    @Test
    void simpleTest(){
        System.out.println("### simpleTest |");
        Assertions.assertTrue(2>1);

    }
}
