package com.tester.learn.books.crazyjava.CH16;

/**
 * Created by leosong on 16-1-29.
 */
public class Account {
    private String accountNo;
    private double balance;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int hashCOde() {
        return accountNo.hashCode();
    }

    public String getAccountNo()
    {
        return this.accountNo;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if (obj != null && obj.getClass() == Account.class)
        {
            Account target = (Account)obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }


}
