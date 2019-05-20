package net.teachers.learners;
import java.util.HashMap;
import java.util.Map;

public class Lesson {

    private  String subject;
    public int token = 0;

    public Lesson (String subject) {
        this.subject =Subjects.valueOf( subject ).getSub();
    }
    Learner learner;

    Map < String,Integer > leanerList = new HashMap < >();
    Integer counter =0;

    public String addLearner ( Learner learner) {

        if ( learner.learnerName != "" ) learner.learnerName =String.valueOf( learner );
         counter = leanerList.containsKey( learner ) ?leanerList.get(learner) : 0;
        leanerList.put(learner.learnerName  , counter + 1 );
        return learner.learnerName;
    }

    public String accept ( String subjects) {

      if ( subject.matches( subjects) ){

          return "learner has been accepted";
      }else {

          return "learner is not registered for this subject";
      }
    };

    public int howMany ( ) {
        System.out.println(leanerList.size() );
        return leanerList.size();
    }

    public String startLesson( ){

        if (accept(subject) =="learner has been accepted" && howMany()>= 5  ){
                token =+3;
            return "lesson in progress";
        } else {
            return "lesson canceled";
        }
    }

    public Map < String,Integer > listOfLearners ( ) {

        return  leanerList;
    }

    public int notes ( ){

        if ( learner.equals( "Registered" )) {
            return this.token = - 2;

        } else if(learner.equals( "UnRegistered" )){
            return this.token = - 5;
        }
        return token;
    }

    public void registerLeaner(){

        subject.equals( "geograpy" );
        subject.equals( "physics" );
        subject.equals( "business" );
    }

}
