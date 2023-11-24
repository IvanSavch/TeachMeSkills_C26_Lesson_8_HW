package com.teachmeskills.lesson8.HW.task1.hospital.doctor;

import com.teachmeskills.lesson8.HW.task1.hospital.doctor.model.Dentist;
import com.teachmeskills.lesson8.HW.task1.hospital.doctor.model.Doctor;
import com.teachmeskills.lesson8.HW.task1.hospital.doctor.model.Surgeon;
import com.teachmeskills.lesson8.HW.task1.hospital.doctor.model.Therapist;

import java.util.ArrayList;
import java.util.List;

public class Staff {
     static Surgeon surgeon;
    public static List<Doctor> getStaff() {
        List<Doctor> doctors = new ArrayList<>();
        doctors.add( new Therapist(1, "Ivanov", 29, 6, Sex.MALE, 416));
        doctors.add(new Surgeon(2, "Petrov", 25, 3, Sex.MALE, 529));
        doctors.add( new Dentist(3, "Valentina", 33, 10, Sex.FEMALE, 223));
        return doctors;
    }

    public void getDoctor(int code) {
        switch (code) {
            case 1:
                System.out.println(getStaff().get(1).toString());
                getStaff().get(1).Treat();
                break;
            case 2:
                System.out.println(getStaff().get(2).toString());
                getStaff().get(2).Treat();
                break;
            case 3:
                System.out.println(getStaff().get(0).toString());
                getStaff().get(0).Treat();
                break;
            default:
                getStaff().get(0).Treat();
        }
    }
}
