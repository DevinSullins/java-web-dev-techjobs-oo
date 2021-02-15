package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String aName, String aEmployer, String aLocation, String aPositionType, String aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = new Employer(aEmployer);
        this.location = new Location(aLocation);
        this.positionType = new PositionType(aPositionType);
        this.coreCompetency = new CoreCompetency(aCoreCompetency);
    }

    @Override
    public String toString() {
        if(name == ""
                && employer.toString() == ""
                && location.toString() == ""
                && positionType.toString() == ""
                && coreCompetency.toString() == ""
        ){
            return "OOPS! This job does not seem to exist.";
        }
        return "\n" +
                "ID: " + id + " \n" +
                "Name: " + name + "\n" +
                "Employer: " + employer.toString() + "\n" +
                "Location: " + location.toString() + "\n" +
                "Position Type: " + positionType.toString() + "\n" +
                "Core Competency: " + coreCompetency.toString() + "\n";
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
