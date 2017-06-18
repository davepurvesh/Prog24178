package davepur;

/**
 *
 * @author purvesh dave
 */
public abstract class Evaluation {
    
    public abstract double achievedWeight();
    
    public String title = "TBD";
    public double weight, maxGrade = 10.0;
    public double grade = 0.0;
    public boolean complete = false;
    
    public double performance, employerEval;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        
        if(title != null || title =="")
            this.title = title;
        else
            throw new IllegalArgumentException("String value cannot be"
                    + " null or empty");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {   
        if(weight < 0)
            throw new IllegalArgumentException("weight must be greater"
                    + "than 0");
                    
        this.weight = weight;       
    }

    public double getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(double maxGrade) {
        if(maxGrade < 0)
            throw new IllegalArgumentException("Max Grade must be "
                    + "greater than 0.");
        
        this.maxGrade = maxGrade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade < 0)
            throw new IllegalArgumentException("Grade must be greater than 0.");
        
        this.grade = grade;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        
        if (complete)
            setGrade(getMaxGrade());
        
        this.complete = complete;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        if(performance < 0)
            throw new IllegalArgumentException("Performance mark must "
                    + "be greater than 0.");
        
        this.performance = performance;
    }

    public double getEmployerEval() {
        return employerEval;
    }

    public void setEmployerEval(double employerEval) {
        if(employerEval < 0)
            throw new IllegalArgumentException("Employer Eval must "
                    + "be greater than 0.");
        
        this.employerEval = employerEval;
    }
    
    
        
}
