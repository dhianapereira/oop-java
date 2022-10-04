package org.example.models;

public class SchoolReport {
    private final double firstGrade;
    private final double secondGrade;

    public SchoolReport(double first, double second) {
        this.firstGrade = first;
        this.secondGrade = second;
    }

    public double getFirstGrade() {
        return firstGrade;
    }
    public double getSecondGrade() {
        return secondGrade;
    }
    public double getMedia(){
        return (firstGrade + secondGrade) / 2;
    }
    public String getResult(){
        return getMedia() > 6 ? "APROVADO" : "REPROVADO";
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "first=" + getFirstGrade() +
                ", second=" + getSecondGrade() +
                ", media=" + getMedia() +
                '}';
    }
}
