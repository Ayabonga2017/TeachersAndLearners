import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TokenTest {

    Token token = new Token();

    @Test
    public void notesFromRegistered(){
    token.subjects ="Registered";

        assertEquals(token.notes(),-2);
    }
    @Test
    public void notesFromUnRegistered(){
        token.subjects = "UnRegistered" ;
        assertEquals(token.notes(),-5);
    }
    @Test
    public void attended(){
        token.lesson = "attended" ;
        assertEquals(token.attended(),3);
    }
    @Test
    public void notAttended(){
        token.lesson = "notAttended" ;
        assertEquals(token.attended(),0);
    }
}
