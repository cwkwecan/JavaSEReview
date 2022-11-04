package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-30 20:59
 */
public class InstrumentTest {

    public static void main(String[] args) {

        Piano piano = new Piano();
        Violin violin = new Violin();

        InstrumentTest test = new InstrumentTest();

        test.testPlay(piano);
        System.out.println("*************************");
        test.testPlay(violin);

    }

    public void testPlay(Instrument instrument){
        instrument.play();
    }
}
