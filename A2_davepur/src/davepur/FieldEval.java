/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davepur;

/**
 *
 * @author purve
 */
public class FieldEval extends Evaluation{

    public FieldEval() {
    }

    public FieldEval(String title,double weight) {
        this.title = title;
        this.weight = weight;
    }
    
    public FieldEval(String title, double weight, double performance, 
            double employerEval) {
        this.title = title;
        this.weight = weight;
        this.performance = performance;
        this.employerEval = employerEval;
    }
    
    
    @Override
    public double achievedWeight() {
        return ((performance+employerEval)/200)*weight;
    }
}
