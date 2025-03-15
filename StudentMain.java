import java.util.*;

public class StudentMain {

    public double findaverage(Student[] students){
        double sum = 0;

        for(int i =0; i<students.length; i++){
            sum += students[i].getmarks();
        }
        double average = sum / students.length;
        return average;

    }
       
    public static void main(String args[]){
       

        Student ob1 = new Student("thilan", 80);
        Student ob2 = new Student("pasan", 75);
        Student ob3 = new Student("kasun", 95);
        Student ob4 = new Student("sudam", 74);
        Student ob5 = new Student("kaveesha", 88);
       
        Student[] students = new Student[5];
        students[0] = ob1;
        students[1] = ob2;
        students[2] = ob3;
        students[3] = ob4;
        students[4] = ob5;

        StudentMain obj = new StudentMain();
        double avg = obj.findaverage(students);
        System.out.println("Average of 5 Students: " + avg);
        
    }
}
/*Output */
/*Average of 5 Students: 82.4 */