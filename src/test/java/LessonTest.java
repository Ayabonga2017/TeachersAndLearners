import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonTest {

    @Test
    public void howMany(){

        Learner learner = new Learner("aya","jay","jaya@gmail.com");
        assertEquals(learner.getName(),"aya");
        assertEquals(learner.getSurname(),"jay");
        assertEquals(learner.getEmail(),"jaya@gmail.com");
        learner.setLeanerList();
        assertEquals(learner.howMany(),5);

    }
    @Test
    public void takeLesson(){

        Learner learner = new Learner("aya","jay","jaya@gmail.com");
        assertEquals(learner.getName(),"aya");
        assertEquals(learner.getSurname(),"jay");
        assertEquals(learner.getEmail(),"jaya@gmail.com");
       learner.setLeanerList();
        Lesson lessons = new Lesson(learner.getName(),learner.getSurname(), learner.getEmail());

        assertEquals(lessons.lesson1(learner),"lesson in progress");

    }

}
