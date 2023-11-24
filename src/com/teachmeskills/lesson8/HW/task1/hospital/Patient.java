package com.teachmeskills.lesson8.HW.task1.hospital;

import com.teachmeskills.lesson8.HW.task1.hospital.IO.IOInterface;
import com.teachmeskills.lesson8.HW.task1.hospital.doctor.Staff;

import java.util.Scanner;

/**
 * Create a program to simulate the work of a clinic.
 * Let there be three doctors in the clinic: a surgeon, a therapist and a dentist.
 * Every doctor has a method of “treating,” but every doctor treats differently.
 * Also provide a “Patient” class with a “Treatment Plan” field and a “Doctor” field.
 * Create an object of the “Patient” class and add a treatment plan to the patient.
 * The therapist will create a method that will prescribe a doctor to the patient according to the plan
 * treatment:
 * If the treatment plan has code 1, appoint a surgeon and perform the treatment method.
 * If the treatment plan has code 2, appoint a dentist and perform the treatment method.
 * If the treatment plan has any other code, assign a therapist and perform the method
 * treat.
 */
public class Patient {

    public static void main(String[] args) {
        Staff staff = new Staff();
        Scanner scanner = new Scanner(System.in);
        System.out.println(IOInterface.MENU_LEGEND);
        System.out.println("enter code doctor");
        int code = scanner.nextInt();
        staff.getDoctor(code);
    }
}
