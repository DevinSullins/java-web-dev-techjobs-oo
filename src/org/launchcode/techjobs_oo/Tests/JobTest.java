package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job jobOne;//is it creating one here and then creating it again in  weird
    Job jobTwo;
    Job jobThree;

    @Before
    public void createJobObjects() {
        jobOne = new Job("Product tester", "ACME", "Desert","Quality control", "Persistence");
        jobTwo = new Job("Product tester", "ACME", "Desert","Quality control", "Persistence");
        jobThree = new Job("Product Tester", "ACME", "Desert", "Quality Control", "Persistence");
    }

    @Test
    public void testSettingJobId(){

        Assert.assertTrue(jobOne.getId() != jobTwo.getId());
        Assert.assertTrue(jobTwo.getId() - jobOne.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){


        Assert.assertTrue(jobThree.getEmployer() != null);
        Assert.assertTrue(jobThree.getLocation() != null);
        Assert.assertTrue(jobThree.getPositionType() != null);
        Assert.assertTrue(jobThree.getCoreCompetency() != null);

        //this whole test seems clunky
        Assert.assertEquals(jobThree.getEmployer().getValue(), "ACME");
        Assert.assertEquals(jobThree.getLocation().getValue(), "Desert");
        Assert.assertEquals(jobThree.getPositionType().getValue(), "Quality Control");
        Assert.assertEquals(jobThree.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Assert.assertFalse(jobOne.equals(jobTwo));
    }

    @Test //it doesn't make any sense not to combine the first two tests
    public void testToString(){
        Assert.assertEquals("\n" +
                "ID: " + jobThree.getId() + " \n" +
                "Name: " + jobThree.getName() + "\n" +
                "Employer: " + jobThree.getEmployer() + "\n" +
                "Location: " + jobThree.getLocation() + "\n" +
                "Position Type: " + jobThree.getPositionType() + "\n" +
                "Core Competency: " + jobThree.getCoreCompetency() + "\n", jobThree.toString());
    }

    @Test
    public void testToStringBlanks(){
        Job jobFour = new Job("Product Tester", "", "", "", "");
        Assert.assertEquals("\n" +
                "ID: " + jobFour.getId() + " \n" +
                "Name: " + jobFour.getName() + "\n" +
                "Employer: " + jobFour.getEmployer() + "\n" +
                "Location: " + jobFour.getLocation() + "\n" +
                "Position Type: " + jobFour.getPositionType() + "\n" +
                "Core Competency: " + jobFour.getCoreCompetency() + "\n", jobFour.toString());
    }

    @Test
    public void testToStringNoInfo(){
        Job jobFive = new Job("", "", "", "", "");
        Assert.assertEquals("OOPS! This job does not seem to exist.", jobFive.toString());
    }

}
