package com.teachmeskills.lesson8.HW.task1.hospital.doctor.model;

import com.teachmeskills.lesson8.HW.task1.hospital.doctor.Sex;

public abstract class Doctor {
    protected long id;
    protected String name;
    protected int age;
    protected int experience;
    protected int cabinet;
    Sex sex;

    public Doctor(int id,String name, int age, int experience, Sex sex, int cabinet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.cabinet = cabinet;
        this.sex = sex;
    }

    public abstract void Treat();

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", cabinet=" + cabinet +
                ", sex=" + sex +
                '}';
    }
}
