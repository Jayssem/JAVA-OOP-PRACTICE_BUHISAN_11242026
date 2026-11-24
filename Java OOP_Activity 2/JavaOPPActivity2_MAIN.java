/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaoppactivity2_main;

/**
 *
 * @author BUHISAN_CPE113
 */
public class JavaOPPActivity2_MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Create Ana's record with quiz 80 and lab 90
        LabGrade ana = new LabGrade("Ana", 80, 90);
        System.out.println(ana.getStudentName() + ": " + ana.getFinalGrade() + "; passing = " + ana.isPassing());

        // 2. Create Ben's record with quiz 101 and lab 85
        LabGrade ben = new LabGrade("Ben", 101, 85);
        System.out.println(ben.getStudentName() + ": " + ben.getFinalGrade() + "; passing = " + ben.isPassing());

        // 3. Update Ana's scores to 95 and 101 (invalid)
        boolean updated1 = ana.updateScores(95, 101);
        System.out.println(updated1 + "; grade stays " + ana.getFinalGrade());

        // 4. Update Ana's scores to 74 and 75
        boolean updated2 = ana.updateScores(74, 75);
        System.out.println(updated2 + "; " + ana.getFinalGrade() + "; passing = " + ana.isPassing());

        // 5. Update Ana's scores to 75 and 75
        boolean updated3 = ana.updateScores(75, 75);
        System.out.println(updated3 + "; " + ana.getFinalGrade() + "; passing = " + ana.isPassing());

        // 6. Check Ben's record again
        System.out.println("Ben still " + ben.getFinalGrade() + "; passing = " + ben.isPassing());
    }
}
// Q1. Why must you validate both new scores before assigning either one?
// Para dle sya ma update kung invalid ang score, kay if dle sya e validate mu update sya partially instead nga e keep ang original scores. (This is only for Invalid Scores).
