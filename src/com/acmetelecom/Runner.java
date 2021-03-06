package com.acmetelecom;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HTaheri
 * Date: 30/07/11
 * Time: 23:01
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Running....");
        BillingSystem billingSystem = new BillingSystem();

        billingSystem.callInitiated("447722113434","447766814143");
        sleepSeconds(20);
        billingSystem.callCompleted("447722113434","447766814143");

        billingSystem.callInitiated("447722113434","447711111111");
        sleepSeconds(30);
        billingSystem.callCompleted("447722113434","447711111111");

        billingSystem.callInitiated("447777765432","447766814143");
        sleepSeconds(60);
        billingSystem.callCompleted("447777765432","447766814143");

        billingSystem.createCustomerBills();

    }

    private static void sleepSeconds(int n) throws InterruptedException
    {
        Thread.sleep(n*1000);
    }
}
