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
public class GradedEval extends Evaluation {

    public GradedEval() {
    }

    public GradedEval(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public GradedEval(String title, double weight, double grade, double maxGrade) {
        this.title = title;
        this.weight = weight;
        this.grade = grade;
        this.maxGrade = maxGrade;
    }
    
    
    
    @Override
    public double achievedWeight()
    {
        return (grade/maxGrade)*weight;
    }
}
