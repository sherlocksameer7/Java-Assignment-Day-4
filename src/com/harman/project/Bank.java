package com.harman.project;

abstract class Bank {

    public abstract void getBalance();
}
class Bank_A extends Bank
{
    public void getBalance()
    {
        System.out.println("Deposited Balance is = $100");
    }
}
class Bank_B extends Bank
{
    public void getBalance()
    {
        System.out.println("Deposited Balance is = $150");
    }
}
class Bank_C extends Bank
{
    public void getBalance()
    {
        System.out.println("Deposited Balance is = $200");
    }
}
class calculateBalance
{
    public static void main(String[] args)
    {
        Bank_A Balance1 = new Bank_A();
        Balance1.getBalance();

        Bank_B Balance2 = new Bank_B();
        Balance2.getBalance();

        Bank_C Balance3 = new Bank_C();
        Balance3.getBalance();
    }
}
