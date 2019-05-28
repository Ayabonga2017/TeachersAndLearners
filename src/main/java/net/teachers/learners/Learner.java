package net.teachers.learners;

public class Learner {

    String learnerName;
    String lastName;
    String email;
    String subject;

    public Learner (String learner , String lastName , String email,String subject) {

        this.learnerName = learner.substring( 0 , 1 ).toLowerCase() + learner.substring( 1 ).toLowerCase();
        this.lastName = lastName.substring( 0 , 1 ).toLowerCase() + lastName.substring( 1 ).toLowerCase();;
        this.email = email;
        this.subject=subject;
    }

    public boolean canAttend(String subjectX){
        return subject.equals( subjectX );
    }


}