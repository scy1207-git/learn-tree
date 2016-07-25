package com.tester.learn.books.zen.CH23;

/**
 * Created by leosong on 16-7-25.
 */
public class Client {

    public static void main(String[] args)
    {
        ILetterProcess letterProcess = new LetterProcessImpl();
//        letterProcess.writeContext("hello, it is me");
//        letterProcess.fillEnvelope("uk");
//        letterProcess.letterInotoEnvelope();
//        letterProcess.sendLetter();

        ModenPostOffice helloRoadPostOffice = new ModenPostOffice();
        String address ="hello, address";
        String context = "hello, context";

        helloRoadPostOffice.sendLetter(context,address);

    }

}
