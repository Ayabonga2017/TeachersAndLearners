import net.teachers.learners.Learner;
import net.teachers.learners.Lesson;
import net.teachers.learners.Subjects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonTest {

    @BeforeEach
public void clean(){
        Lesson historyLesson = new Lesson( Subjects.valueOf( "history") );
        historyLesson.clean();
    };
    @Test
    @DisplayName( "should return the value of learners that attended History" )
    public void howMany(){

        Lesson historyLesson = new Lesson( Subjects.valueOf( "history") );

        historyLesson.addLearner( new Learner( "aya","sdsd","n/a"));
        historyLesson.addLearner( new Learner("j", "G", "n/a") );
        historyLesson.addLearner( new Learner("ja", "G", "n/a") );
        historyLesson.addLearner( new Learner("jay", "G", "n/a") );
        historyLesson.addLearner( new Learner("jason", "G", "n/a" ));

        assertEquals( historyLesson.howMany(),3 );

    }

    @Test
    @DisplayName( "SHOULD RETURN THE COUNTER FOR THE ACCEPTED LEARNERS" )
    public void acceptLearners(){

        Lesson mathsLesson = new Lesson( Subjects.valueOf( "mathematics" ));

        Learner aya = new Learner( "aya","sdsd","n/a");
        aya.addSubjects( Subjects.mathematics );
        mathsLesson.addLearner(aya);
        mathsLesson.addLearner(new Learner( "ayabonga","sdsd","n/a"));
        mathsLesson.addLearner(new Learner( "THABANG","sdsd","n/a"));

        assertEquals( 1,mathsLesson.howMany());
        assertEquals( "{aya=10}",mathsLesson.listOfLearners().toString());


    }

    @Test
    @DisplayName( "LESSON SHOULD START" )
    public void startLesson(){

        Lesson mathsLesson = new Lesson( Subjects.valueOf( "mathematics" ) );

        Learner learner1 = new Learner( "ayabonga","sdsd","n/a" );
        learner1.addSubjects( Subjects.mathematics );
        learner1.addSubjects( Subjects.lifesciences );
        learner1.addSubjects( Subjects.history );
        mathsLesson.addLearner(learner1);

        Learner learner2 = new Learner( "ayab","sdsd","n/a" );
        learner2.addSubjects( Subjects.geography );
        learner2.addSubjects( Subjects.mathematics );
        learner2.addSubjects( Subjects.history );
        mathsLesson.addLearner(learner2);

        Learner learner3 = new Learner( "ayabo","sdsd","n/a" );
        learner3.addSubjects( Subjects.business );
        learner3.addSubjects( Subjects.cat );
        learner3.addSubjects( Subjects.physics );
        learner3.addSubjects( Subjects.mathematics );;
        mathsLesson.addLearner(learner3);

        Learner learner4 = new Learner( "ayaj","sdsd","n/a");
        learner4.addSubjects( Subjects.business );
        learner4.addSubjects( Subjects.physics );
        learner4.addSubjects( Subjects.mathematics );
        mathsLesson.addLearner(learner4);

        Learner learner5 = new Learner( "ayad","sdsd","n/a" );
        learner5.addSubjects( Subjects.mathematics );
        learner5.addSubjects( Subjects.geography );
        learner5.addSubjects( Subjects.lifesciences );
        mathsLesson.addLearner(learner5);

        assertEquals( mathsLesson.startLesson(),"The lesson is in progress!.");

    }

    @Test
    @DisplayName( "LESSON SHOULD NOT START" )
    public void startLesson2(){

        Lesson catLesson = new Lesson(Subjects.valueOf("cat"  ) );
        catLesson.addLearner(new Learner( "thabang","sdsd","n/a" ));
        catLesson.addLearner(new Learner( "aya","sdsd","n/a" ));
        catLesson.addLearner(new Learner( "ayab","sdsd","n/a" ));
        catLesson.addLearner(new Learner( "ayad","sdsd","n/a" ));
        catLesson.addLearner(new Learner( "ayabo","sdsd","n/a" ));

        assertEquals( catLesson.startLesson(),"The lesson is canceled!.");
        catLesson.listOfLearners();

    }

    @Test
    public void showAttended(){

        Lesson mathsLesson = new Lesson(Subjects.valueOf( "mathematics" ) );

        mathsLesson.addLearner(new Learner( "aya","aa","n/a" ));
        mathsLesson.addLearner(new Learner( "ayanda","ay","n/a" ));
        mathsLesson.addLearner(new Learner( "ntando","nt","n/a"));
        mathsLesson.addLearner(new Learner( "lunga","ln","n/a" ));
        mathsLesson.addLearner(new Learner( "thabang","ln","n/a" ));

        assertEquals( mathsLesson.listOfLearners().toString(),"{lunga=10, aya=10, ntando=10, ayanda=10}");
    }

    @Test
    @DisplayName( "Should deduct learner's token when requesting notes " )
    public void listOfLearners(){

        Lesson physicsLesson = new Lesson(Subjects.valueOf( "mathematics" )  );
        Learner jackson = new Learner( "jackson","sdsd","n/a");
        jackson.addSubjects( Subjects.valueOf( "mathematics" ));
        jackson.addSubjects( Subjects.geography );
        physicsLesson.addLearner(jackson);
        physicsLesson.addLearner(new Learner( "aya","sdsd","n/a" ));

        physicsLesson.startLesson();

        assertEquals( physicsLesson.listOfLearners().toString(),"{jackson=0, aya=0}");

    }


    @Test
    @DisplayName( "test for each learners subjects" )
    public void subjectReg(){

        Learner unalo = new Learner( "unalo","m","um@gmail.com");

        unalo.addSubjects( Subjects.mathematics );
        unalo.addSubjects( Subjects.business );
        unalo.addSubjects( Subjects.lifesciences );

        assertEquals(unalo.getSubs(), "unalo is registered for the following subjects\n" +
                                      "mathematics\n" +
                                      "business\n" +
                                      "lifesciences\n");
    }
}
