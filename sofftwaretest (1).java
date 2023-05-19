package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SoftWareTest {
    Software s=new Software();


    @Test
    void testWithDraw1() {

        assertEquals(66580,s.withDraw1(76000,87400));
    }



    void testWithDraw2() {

        assertEquals(20488,s.withDraw2(98877,40000));
    }

}
