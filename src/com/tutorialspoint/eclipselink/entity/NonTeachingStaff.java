package com.tutorialspoint.eclipselink.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff extends Staff{
    private String areaOfExpertise;

    public NonTeachingStaff(int sid, String sname, String areaOfExpertise) {
        super(sid, sname);
        this.areaOfExpertise = areaOfExpertise;
    }

    public NonTeachingStaff() {
        super();
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }
}
