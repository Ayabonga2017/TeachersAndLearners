import net.teachers.learners.Learner;
import net.teachers.learners.Lesson;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonTest {

    @Test
    public void howMany(){

        Learner learner = new Learner("aya","jay","jaya@gmail.com","physics");
        Lesson lesson = new Lesson( learner.getName(),learner.getSurname(),learner.getName(),learner.getSub() );

        assertEquals(learner.getName(),"aya");
        assertEquals(learner.getSurname(),"jay");
        assertEquals(learner.getEmail(),"jaya@gmail.com");
        lesson.setLeanerList();
        assertEquals(lesson.howMany(),5);


    }
    @Test
    public void takeLesson(){

        Learner learner = new Learner("lunga","lunga","jaya@gmail.com","history");
        Lesson lesson = new Lesson( learner.getName(),learner.getSurname(),learner.getName(),learner.getSub() );
        assertEquals(learner.getName(),"lunga");
        assertEquals(learner.getSurname(),"lunga");
        assertEquals(learner.getEmail(),"jaya@gmail.com");
        assertEquals( learner.getSub(),"history" );
        lesson.setLeanerList();

        assertEquals(lesson.lesson1(),"lesson in progress");

    }
}
