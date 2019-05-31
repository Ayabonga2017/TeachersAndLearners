package net.teachers.learners;

import java.util.HashMap;
import java.util.Map;

public class Lesson{

    Integer token=0;
    String registered="has been added and accepted for the lesson";
    String notRegistered="is not registered for this subject";
    String name;
    String lastName;
    String email;
    Subjects subs;
    private Learner leaner;

    public Lesson(Subjects subjects){
        this.subs=subjects;
    }

    Map<String,Integer> leanerList=new HashMap<>();

    public String addLearner(Learner learner){

        this.name    =learner.learnerName;
        this.lastName=learner.lastName;
        this.email   =learner.email;
        this.leaner  =learner;

        if(learner.getSubs().length() >= 3 && learner.canAttend(subs)){

            token=leanerList.containsKey(name)?leanerList.get(name):0;
            leanerList.put(name,token);
            System.out.println(name+" "+registered);
            return registered;

        }else{

            System.out.println(name+" "+notRegistered);
            return notRegistered;
        }
    }

    public int howMany(){

        System.out.println("\n"+leanerList.size()+" student(s) has/have been accepted !.");
        return leanerList.size();
    }

    public String startLesson(){

        String progress="The lesson is in progress!.";
        String canceled="The lesson is canceled!.";

        if(addLearner(leaner) == registered && howMany() >= 5){
            token=+3;

            System.out.println(progress);
            return progress;
        }else{
            System.out.println(canceled);
            return canceled;
        }
    }

    public Map<String,Integer> listOfLearners(){

        System.out.println("\nTHIS IS A LIST OF ATTENDEES: \n"+leanerList);
        return leanerList;
    }



    public void clean(){
        leanerList.clear();
        token=0;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public Subjects getSub(){
        return subs;
    }

}
