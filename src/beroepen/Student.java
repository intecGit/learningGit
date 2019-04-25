package beroepen;

import Person.Person;

import java.time.LocalDateTime;
import java.time.YearMonth;

public class Student extends Person {

    private Job job;
    private double pay;

    public Student() {
    }

    public Student(String name,Job job) {
        super(name);
        this.job = job;
    }

    public Student(String name, int age, Job job) {
        super(name, age);
        this.job = job;
    }

    public Student(String name, int age, double height, Job job) {
        super(name, age, height);
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public double payOverAMonth() {
        int payDay= YearMonth.now().lengthOfMonth();
        return payDay*this.pay;
    }

    @Override
    public double payOverAYear() {
        int payDay= LocalDateTime.now().getYear();
        return payDay*this.pay;
    }

    @Override
    public double payOverALifeTime() {

        int payYear= LocalDateTime.now().getYear();
        int pension= 67-getAge();
        double totalEarningUntilPension=0;

        for (int i = 0; i<pension; i++){
            totalEarningUntilPension+=(payYear*getPay());
        }
        return totalEarningUntilPension;
    }

    @Override
    public String toString() {
        return super.toString()+" Student" +
                "job " + job;
    }
}
