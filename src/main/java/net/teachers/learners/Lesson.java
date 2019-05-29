package net.teachers.learners;
import java.util.HashMap;
import java.util.Map;

public class Lesson {

    private  String subject;
    Integer token = 0;
    String registered ="has been added and accepted for the lesson";
    String notRegistered ="is not registered for this subject";
    String name;
    String  lastName;
    String email;

    public Lesson (String subject) {
        this.subject =Subjects.valueOf( subject ).getSub();
    }

    Map < String,Integer > leanerList = new HashMap < >();

    public String addLearner ( Learner learner) {

        this.name = learner.learnerName;
        this.lastName = learner.lastName;
        this.email = learner.email;

        if(learner.canAttend( subject )) {

            token = leanerList.containsKey ( name ) ? leanerList.get ( name ) : 0;
            leanerList.put ( name, token + 10 );
            System.out.println(name + " " + registered );
            return registered;

        }else{

            System.out.println(name + " " + notRegistered );
            return notRegistered;
        }
    }

    public int howMany ( ) {

        System.out.println("\n"+leanerList.size() + " student(s) has been accepted !." );
        return leanerList.size();
    }

    public String startLesson( ){

        String progress = "The lesson is in progress!.";
        String canceled = "The lesson is canceled!.";

        if ( addLearner ( new Learner(getName(),getSurname(),getEmail(),getSub() ) ) == registered && howMany() >= 5  ){
            token =+3;
            System.out.println(progress );
            return progress;
        } else {
            System.out.println(canceled );
            return canceled;
        }
    }

    public Map < String,Integer > listOfLearners ( ) {

        System.out.println("\nTHIS IS A LIST OF ATTENDEES: \n" + leanerList );
        return  leanerList;
    }

    public int notes ( ){

        if ( subject.matches(subject )) {
            token -= 2;
            return token ;
        } else{
            token -= 5;
            return token;
        }
    }

    public void registerLeaner(){

        subject.equals( "geograpy" );
        subject.equals( "physics" );
        subject.equals( "business" );
    }

    public void clean(){
        leanerList.clear();
        token = 0;
    }

    public String getName ( ) {
        return name;
    }

    public String getSurname ( ) {
        return lastName;
    }

    public String getEmail ( ) {
        return email;
    }

    public String getSub ( ) {
        return Subjects.valueOf( subject ).getSub();
    }

}
