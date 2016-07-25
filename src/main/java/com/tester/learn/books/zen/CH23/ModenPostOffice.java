package com.tester.learn.books.zen.CH23;

/**
 * Created by leosong on 16-7-25.
 */
public class ModenPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();

    public void sendLetter(String context,String address)
    {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterPolice.checkLetter(letterProcess);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();


    }


}
