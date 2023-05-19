package com.company;

public class Software {
    public int withDraw1(int balance,int amount){
        if (amount>balance)
            return -1;

        else{
            balance=-amount;
        }
        return balance;

    }

    public int withDraw2(int balance, int amount){
        if (amount>balance)
            System.out.println( "empty");

        else{
            balance=-amount;
            System.out.println( "amount true");
        }
        return balance;
    }

}
