package com.teachmeskills.lesson8.HW.task1.hospital.doctor.model;

import com.teachmeskills.lesson8.HW.task1.hospital.doctor.Sex;
import com.teachmeskills.lesson8.HW.task1.hospital.doctor.model.Doctor;

public class Therapist extends Doctor {
    public Therapist(int id, String name, int age, int experience, Sex sex, int cabinet) {
        super(id, name, age, experience, sex, cabinet);
    }

    @Override
    public void Treat() {
        System.out.println("prescribes something for you!");
    }

    @Override
    public String toString() {
        return "Therapist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", cabinet=" + cabinet +
                '}';
    }
}
