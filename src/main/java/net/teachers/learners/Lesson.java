package net.teachers.learners;
import java.util.HashMap;
import java.util.Map;

public class Lesson {

    private  String subject;
    public int token = 0;
    String registered ="learner has been added and registered";
    String notRegistered ="learner is not registered for this subject";
    String name;
    Integer addToken =0;
    Learner learner;
    String  lastName;
    String email;


    public Lesson (String subject) {

        this.subject =Subjects.valueOf( subject ).getSub();
    }

    Map < String,Integer > leanerList = new HashMap < >();

    public String addLearner ( Learner learner) {

        //System.out.println(learner.canAttend( subject ) +" " + subject +" "+ getSub() );
        this.name = learner.learnerName;
        this.lastName = learner.lastName;
        this.email = learner.email;
        this.token = addToken;

        if(learner.canAttend( subject )) {
            addToken = leanerList.containsKey ( name ) ? leanerList.get ( name ) : 0;
            leanerList.put ( learner.learnerName , addToken + 10 );

            return registered;
        }else{
            System.out.println(name+ " " + notRegistered );
            return notRegistered;
        }
    }

    public int howMany ( ) {

        System.out.println(leanerList.size() );

        return leanerList.size();
    }

    public String startLesson( ){

        if ( addLearner ( new Learner(getName(),getSurname(),getEmail(),getSub() ) ) == registered && howMany() >= 5  ){
            token =+3;
            System.out.println("lesson in progress" );
            return "lesson in progress";
        } else {
            System.out.println("lesson canceled" );
            return "lesson canceled";
        }
    }

    public Map < String,Integer > listOfLearners ( ) {

        System.out.println("THIS IS A LIST OF ATTENDEES \n" + leanerList );
        return  leanerList;
    }

    public int notes ( ){

        if ( addLearner ( new Learner(getName(),getSurname(),getEmail(),getSub() ) ) == registered) {

            return this.token = addToken - 2;
        } else if(addLearner ( new Learner(getName(),getSurname(),getEmail(),getSub() ) ) == notRegistered){

            return this.token = addToken- 5;
        }
        return token;
    }

    public void registerLeaner(){

        subject.equals( "geograpy" );
        subject.equals( "physics" );
        subject.equals( "business" );
    }

    public void clean(){
        leanerList.clear();
        token = 0;
        addToken = 0;
    };

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
