package hw02_OOP_Overview.p07_AverageGrades;


import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Double> grades;
    private Double averageGrade;

    Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    void addGrade(Double grade){
         this.grades.add(grade);
    }

    Double getAverageGrades(){
        int count = 0;
        Double sum = 0.0;
        for (Double grade : this.grades) {
            count++;
            sum+=grade;
        }
        Double result = sum/count;
        this.averageGrade = result;
        return result;
    }

    String getName() {
        return this.name;
    }

    Double getAverageGradeVariable() {
        return this.averageGrade;
    }
}
