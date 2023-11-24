package com.teachmeskills.lesson8.HW.task1.hospital.doctor.model;

import com.teachmeskills.lesson8.HW.task1.hospital.doctor.Sex;


public class Surgeon extends Doctor {
    public Surgeon(int id, String name, int age, int experience, Sex sex, int cabinet) {
        super(id, name, age, experience, sex, cabinet);
    }

    @Override
    public void Treat() {
        System.out.println("hurts");
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", cabinet=" + cabinet +
                '}';
    }
}
