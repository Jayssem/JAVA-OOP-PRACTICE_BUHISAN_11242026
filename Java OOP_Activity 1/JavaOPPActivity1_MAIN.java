/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaoppactivity1_main;

/**
 *
 * @author BUHISAN_CPE113
 */
public class JavaOPPActivity1_MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Create Mia's account with 10 credits and Luis's with -4
        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);
        System.out.println(mia.getStudentName() + ": " + mia.getCredits() + ", "
                + luis.getStudentName() + ": " + luis.getCredits());

        // 2. Mia prints 4 pages
        System.out.println(mia.printPages(4) + "; " + mia.getStudentName() + ": " + mia.getCredits());

        // 3. Mia tries to print 7 pages
        System.out.println(mia.printPages(7) + "; " + mia.getStudentName() + ": " + mia.getCredits());

        // 4. Mia tries to add -3 credits
        System.out.println(mia.addCredits(-3) + "; " + mia.getStudentName() + ": " + mia.getCredits());

        // 5. Mia adds 4 credits
        System.out.println(mia.addCredits(4) + "; " + mia.getStudentName() + ": " + mia.getCredits()
                + ", " + luis.getStudentName() + ": " + luis.getCredits());
    }
}
// This code is AI-ASSISTED.
