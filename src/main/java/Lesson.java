public class Lesson extends Learner{

    public Lesson (String learner , String lastName , String email) {
        super(learner , lastName , email);
    }

    public String lesson1( Learner learner){

        if ( learner.howMany()>= 5  ){

            return "lesson in progress";
        }else{
            return "lesson canceled";
        }
    }
}
