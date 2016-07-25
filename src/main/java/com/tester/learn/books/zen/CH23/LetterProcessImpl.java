package com.tester.learn.books.zen.CH23;

/**
 * Created by leosong on 16-7-25.
 */
public class LetterProcessImpl implements ILetterProcess {

    public void writeContext(String context)
    {
        System.out.println("pls write the letter: " + context);
    }

    public void fillEnvelope(String address)
    {
        System.out.println("pls fill the envelope: " + address);
    }

    public void letterInotoEnvelope()
    {
        System.out.println("put the leeter into envelope");
    }

    public void sendLetter()
    {
        System.out.println("sending letter...");
    }

}
