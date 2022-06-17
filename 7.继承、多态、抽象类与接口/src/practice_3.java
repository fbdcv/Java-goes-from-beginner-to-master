class Guest {
    String order = "";
}

class Teacher extends Guest {
    Teacher() {
        order = "香辣肉丝";
    }
}

class Student extends Guest {
    Student() {
        order = "火腿炒面";
    }
}

class Doctor extends Guest {
    Doctor() {
        order = "麻辣香锅";
    }
}

public class practice_3 {
    public static void main(String[] args) {
        Guest teacher = new Teacher();
        Teacher t = (Teacher) teacher;
        System.out.println(t.order);
        Guest student = new Student();
        Student s = (Student) student;
        System.out.println(s.order);
        Guest doctor = new Doctor();
        Doctor d = (Doctor) doctor;
        System.out.println(d.order);
        

    }
}
