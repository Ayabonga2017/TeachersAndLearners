package net.teachers.learners;

public class Learner {

    String learner;
    String lastName;
    String email;
    String subjects;
    public Learner (String learner , String lastName , String email,String subjects) {

        this.learner = learner;
        this.lastName = lastName;
        this.email = email;
        this.subjects=subjects;
    }

    public String getName ( ) {
        return learner;
    }

    public String getSurname ( ) {
        return lastName;
    }

    public String getEmail ( ) {
        return email;
    }

    public String getSub ( ) {
        return Subjects.valueOf( subjects ).getSub();
    }


}