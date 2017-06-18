/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davepur;

/**
 *
 * @author purvesh
 */
public class Test {
    
    public static void main (String[] args)
    {
        Evaluation ge = new GradedEval("Mid Term Exam", 25, 60, 67);

        System.out.println(ge.achievedWeight());
    }
    
}
