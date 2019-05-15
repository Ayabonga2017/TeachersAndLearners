public class Lesson {

    Learner learner = new Learner();

    public String lesson1(){

        if ( learner.learners.length() > 5  ){

            return "lesson in progress";
        }else{
            return "lesson canceled";
        }
    }
    public String attend(){
        //if lesrner's subject match lessons subjects learner should attend
        return "";
    }
}
