package designpattern.behave.cor.one;

import java.util.Scanner;

/**
 * https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
 */
public class ATMDispenseChain {
    private final DispenseChain chain1;

    public ATMDispenseChain() {
        chain1 = new Dispense50ChainImpl();
        DispenseChain chain2 = new Dispense20ChainImpl();
        DispenseChain chain3 = new Dispense10ChainImpl();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        while (true) {
            System.out.println("Enter amount to dispense..");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if (amount == 0) {
                System.out.println("Please Enter more then 0");
                return;
            }

            if (amount % 10 != 0) {
                System.out.println("Amount should be multiple of 10$");
                return;
            }
            //process the request for dispatch the money
            atmDispenseChain.chain1.dispense(new Currency(amount));
        }
    }
}
