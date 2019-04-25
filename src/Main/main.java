package Main;

import Person.Person;
import beroepen.Doctor;
import beroepen.FireFighter;
import beroepen.Job;
import beroepen.Jobless;

public class main {
    public static void main(String[] args) {
        Person John = new Jobless("John",27, Job.JOBLESS);
        Person Sue = new Doctor("Sue",35, Job.DOCTOR);
        Person Jack = new FireFighter("Jack",22, Job.FIREFIGHTER);

        ((Jobless) John).setPay(0.00);
        ((Doctor) Sue).setPay(150);
        ((FireFighter) Jack).setPay(90);

        System.out.println(John.payOverAMonth());
        System.out.println(John.payOverAYear());
        System.out.println(John.payOverALifeTime());

        System.out.println(Sue.payOverAMonth());
        System.out.println(Sue.payOverAYear());
        System.out.println(Sue.payOverALifeTime());

        System.out.println(Jack.payOverAMonth());
        System.out.println(Jack.payOverAYear());
        System.out.println(Jack.payOverALifeTime());

    }
}
