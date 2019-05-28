import net.teachers.learners.Learner;
import net.teachers.learners.Lesson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonTest {

    @BeforeEach
public void clean(){
        Lesson historyLesson = new Lesson( "history" );
        historyLesson.clean();
    };
    @Test
    @DisplayName( "should return the value of learners that attended History" )
    public void howMany(){

        Lesson historyLesson = new Lesson( "history" );

        historyLesson.addLearner( new Learner( "aya","sdsd","n/a","history"));
        historyLesson.addLearner( new Learner("j", "G", "n/a", "history") );
        historyLesson.addLearner( new Learner("ja", "G", "n/a", "mathematics") );
        historyLesson.addLearner( new Learner("jay", "G", "n/a", "physics") );
        historyLesson.addLearner( new Learner("jason", "G", "n/a", "history") );

        assertEquals( historyLesson.howMany(),3 );

    }

    @Test
    public void acceptLearners(){

        Lesson mathsLesson = new Lesson( "mathematics" );

        mathsLesson.addLearner(new Learner( "aya","sdsd","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "ayabonga","sdsd","n/a","physics" ));

        assertEquals( 1,mathsLesson.howMany());

    }

    @Test
    @DisplayName( "LESSON SHOULD START" )
    public void startLesson(){

        Lesson mathsLesson = new Lesson( "mathematics" );

        mathsLesson.addLearner(new Learner( "aya","sdsd","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "ayab","sdsd","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "ayabo","sdsd","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "ayaj","sdsd","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "ayad","sdsd","n/a","mathematics" ));

        assertEquals( mathsLesson.startLesson(),"lesson in progress");

    }

    @Test
    @DisplayName( "LESSON SHOULD NOT START" )
    public void startLesson2(){

        Lesson catLesson = new Lesson( "cat" );
        catLesson.addLearner(new Learner( "thabang","sdsd","n/a","mathematics" ));
        catLesson.addLearner(new Learner( "aya","sdsd","n/a","cat" ));
        catLesson.addLearner(new Learner( "ayab","sdsd","n/a","cat" ));
        catLesson.addLearner(new Learner( "ayad","sdsd","n/a","mathematics" ));

        catLesson.addLearner(new Learner( "ayabo","sdsd","n/a","cat" ));


        assertEquals( catLesson.startLesson(),"lesson canceled");

    }

    @Test
    public void showAttended(){

        Lesson mathsLesson = new Lesson( "mathematics" );

        mathsLesson.addLearner(new Learner( "aya","aa","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "ayanda","ay","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "ntando","nt","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "lunga","ln","n/a","mathematics" ));
        mathsLesson.addLearner(new Learner( "thabang","ln","n/a","history" ));


        assertEquals( mathsLesson.listOfLearners().toString(),"{lunga=10, aya=10, ntando=10, ayanda=10}");

    }

    @Test
    public void notes(){

        Lesson physicsLesson = new Lesson( "mathematics" );

        physicsLesson.addLearner(new Learner( "aya","sdsd","n/a","mathematics" ));
        physicsLesson.addLearner(new Learner( "ayabonga","sdsd","n/a","physics" ));
        physicsLesson.notes();
        System.out.println( physicsLesson.notes());

        assertEquals( physicsLesson.listOfLearners().toString(),"{aya=8, jackson=5}");

    }

}
