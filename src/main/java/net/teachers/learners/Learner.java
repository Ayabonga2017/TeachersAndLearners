package net.teachers.learners;

import java.util.ArrayList;

public class Learner{

    String learnerName;
    String lastName;
    String email;
    String subjectType="";

    ArrayList <Subjects> listOFsubs=new ArrayList <>();

    public Learner(String learner,String lastName,String email){

        this.learnerName=learner.substring(0,1).toLowerCase()+learner.substring(1).toLowerCase();
        this.lastName   =lastName.substring(0,1).toLowerCase()+lastName.substring(1).toLowerCase();
        this.email=email;
    }

    //methods that adds learners subject to the maxumum of three

    public void addSubjects(Subjects subject){

        if(listOFsubs.contains(subject)){
            System.out.println("already added "+subject);

        }else{

            listOFsubs.add(subject);
        }
    }

    public String getSubs(){

        for(int i=0; i<listOFsubs.size(); i++){

            subjectType+=listOFsubs.get(i)+"\n";
        }
        return learnerName+" is registered for the following subjects\n"+subjectType;
    }

    public boolean canAttend(Subjects subjectX){

        return listOFsubs.contains(subjectX);
    }
}