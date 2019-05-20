import net.teachers.learners.Learner;
import net.teachers.learners.Lesson;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonTest {

    @Test
    public void howMany(){

        Lesson historyLesson = new Lesson( "history" );

        historyLesson.addLearner( new Learner( "aya","sdsd","n/a","history"));
        historyLesson.addLearner( new Learner("j", "G", "n/a", "history") );
        historyLesson.addLearner( new Learner("j", "G", "n/a", "history") );
        historyLesson.addLearner( new Learner("j", "G", "n/a", "history") );
        historyLesson.addLearner( new Learner("j", "G", "n/a", "history") );

        assertEquals( historyLesson.howMany(),5 );


    }
    @Test
    public void takeLesson(){

//        Learner learner = new Learner("lunga","lunga","jaya@gmail.com","history");
//        Learner learner1 = new Learner("aya","lunga","jaya@gmail.com","history");
//        Learner learner2 = new Learner("ntando","lunga","jaya@gmail.com","history");
//        Learner learner3 = new Learner("sfsf","lunga","jaya@gmail.com","history");
//        Learner learner4 = new Learner("ksksk","lunga","jaya@gmail.com","history");
//
//        Lesson lesson = new Lesson(learner );
//        Lesson lesson1 = new Lesson( learner1.getName(),learner1.getSurname(),learner1.getName(),learner1.getSub() );
//        Lesson lesson2 = new Lesson( learner2.getName(),learner2.getSurname(),learner2.getName(),learner2.getSub() );
//        Lesson lesson3 = new Lesson( learner3.getName(),learner3.getSurname(),learner3.getName(),learner3.getSub() );
//        Lesson lesson4 = new Lesson( learner4.getName(),learner4.getSurname(),learner4.getName(),learner4.getSub() );
//
//        assertEquals(learner.getName(),"lunga");
//        assertEquals(learner.getSurname(),"lunga");
//        assertEquals(learner.getEmail(),"jaya@gmail.com");
//        assertEquals( learner.getSub(),"history" );
//        lesson.setLeanerList();
//        lesson1.setLeanerList();
//        lesson2.setLeanerList( );
//        lesson3.setLeanerList( );
//        lesson4.setLeanerList( );
//
//        assertEquals(lesson1(),"lesson in progress");

    }
    @Test
    public void acceptLearners(){

        Lesson mathsLesson = new Lesson( "history" );
        Learner learner=new Learner( "aya","sdsd","n/a","geograpy" );

        mathsLesson.addLearner( new Learner( "aya","sdsd","n/a","history"));
        assertEquals( mathsLesson.accept(learner.getSub()),"learner has been accepted");
    }
}
