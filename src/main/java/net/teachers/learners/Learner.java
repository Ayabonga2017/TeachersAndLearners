package net.teachers.learners;

public class Learner {

    String learnerName;
    String lastName;
    String email;
    String subjects;

    public Learner (String learner , String lastName , String email,String subjects) {

        this.learnerName = learner.substring( 0 , 1 ).toLowerCase() + learner.substring( 1 ).toLowerCase();
        this.lastName = lastName.substring( 0 , 1 ).toLowerCase() + lastName.substring( 1 ).toLowerCase();;
        this.email = email;
        this.subjects=subjects;
    }

    public String getName ( ) {
        return learnerName;
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