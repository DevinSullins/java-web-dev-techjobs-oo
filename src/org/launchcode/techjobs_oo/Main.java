package org.launchcode.techjobs_oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", "ACME","Desert", "Quality control", "Persistence");
        Job job2 = new Job("Web Developer", "LaunchCode","St. Louis", "Front-end developer", "JavaScript");
        Job job3 = new Job("Ice cream taster", "", "Home", "UX", "Taste");

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        for (Job job : jobs){
            System.out.println(job);
        }
    }

}
