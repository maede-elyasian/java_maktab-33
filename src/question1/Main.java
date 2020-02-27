package question1;

import exceptions.InvalidAgeException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        ArrayList<Student> students = new ArrayList<>();
       Student s1 = new Student("maede","elyasaian",15,"physics","tehran");
       students.add(s1);
       Student s2 = new Student("zahar","akbari",14,"chemistry","esfahan");
        students.add(s2);
       Student s3 = new Student("sara","zamani",16,"computer","hamedan");
        students.add(s3);
       Student s4 = new Student("sanaz","kamali",13,"chemistry","tehran");
        students.add(s4);
       Student s5 = new Student("ali","asqari",15,"physics","yazd");
        students.add(s5);
       Student s6 = new Student("reza","nemati",15,"computer","tehran");
        students.add(s6);
       Student s7 = new Student("sina","rad",14,"biology","shiraz");
        students.add(s7);
       Student s8 = new Student("mohamd","omrani",16,"biology","tehran");
        students.add(s8);
       Student s9 = new Student("ali","ahmadi",13,"physics","qom");
        students.add(s9);
       Student s10 = new Student("saman","sadati",17,"chemistry","tehran");
        students.add(s10);


        System.out.println(showCities(students));



    }

    public static HashSet<String> showCities(ArrayList<Student> students){
        HashSet<String> city = new HashSet<>();
        for (Student student : students){
            city.add(student.getCity());
        }
        return city;
    }
}
