package net.teachers.learners;
import java.util.HashMap;
import java.util.Map;

public class Lesson extends Learner {

    public int token = 0;

    public Lesson (String learner , String lastName , String email,String subject) {
        super(learner , lastName , email,subject);
    }

    Map < Learner,Integer > leanerList = new HashMap <>();

    public void setLeanerList ( ) {

        leanerList.put( new Learner( "Aya" , "jacobs" , "ajacobs@gmail.com","lifesciences" ) , token );
        leanerList.put( new Learner( "min" , "cross" , "mcross@gmail.com","physics" ) , token );
        leanerList.put( new Learner( "randy" , "lake" , "rlake@gmail.com","business" ) , token );
        leanerList.put( new Learner( "ran" , "ake" , "rake@gmail.com","geography" ) , token );
        leanerList.put( new Learner( "an" , "ke" , "ake@gmail.com","mathematics" ) , token );
    }

    public int howMany ( ) {

        return leanerList.size();
    }
    public String lesson1( ){

        if ( howMany()>= 5  ){

            for ( Learner learner : leanerList.keySet() ) {
                learner.getName();
                }
            token =+3;
            return "lesson in progress";
        }else{
            return "lesson canceled";
        }
    }
    public String show ( ) {

        System.out.println( leanerList );

        return leanerList.toString();
    }
    public int notes ( ){

        if ( learner.equals( "Registered" )) {
//            Subjects.valueOf( subjects ).getSub( ).equals( subjects );
            return this.token = - 2;

        } else if(learner.equals( "UnRegistered" )){

            return this.token = - 5;
        }
        return token;
    }

    public void registerLeaner(){
        subjects.equals( "geograpy" );
        subjects.equals( "physics" );
        subjects.equals( "business" );
    }

}
