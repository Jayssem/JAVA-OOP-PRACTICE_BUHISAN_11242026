/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoppactivity3;

/**
 *
 * @author BUHISAN_CPE113
 */
public class JavaOPPActivity3_MAIN {

    public static void main(String[] args) {
        // 1. Create Aly's wallet with 100 credits and Ben's with the one-argument constructor
        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // 2. Aly transfers 35 credits to Ben
        System.out.println(aly.transferTo(ben, 35) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // 3. Aly tries to transfer 70 credits to Ben
        System.out.println(aly.transferTo(ben, 70) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // 4. Aly tries to transfer 10 credits to her own wallet
        System.out.println(aly.transferTo(aly, 10) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // 5. Ben deposits 15 credits
        System.out.println(ben.deposit(15) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // 6. Aly transfers all 65 remaining credits to Ben
        System.out.println(aly.transferTo(ben, 65) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // 7. Extra test: Zero-credit transfer (Ben tries to transfer 0 credits to Aly)
        System.out.println(ben.transferTo(aly, 0) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // 8. Extra test: Transfer to null (Ben tries to transfer 10 credits to null)
        System.out.println(ben.transferTo(null, 10) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
    }
}
