package TeacherAndStudent;

public class Teacher {

    public Teacher(){

    }

    public void teach(Student student){
        student.learn();
    }

    public void answer(){

        System.out.println("When The teacher is answering a question ...");
    }

}
