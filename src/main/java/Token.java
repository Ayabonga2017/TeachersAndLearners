public class Token implements Methods{

    int token = 0;
    String lesson;
    String subjects;

    public int attended ( ){

        if ( lesson.equals( "attended" ) ) {

            return this.token = + 3;

        }else if ( lesson.equals( "notAttended" ) ) {

            return this.token;
        }
        return token;
    }

    public int notes ( ){

        if ( subjects.equals( "Registered" )) {
//            Subjects.valueOf( subjects ).getSub( ).equals( subjects );
            return this.token = - 2;

        } else if(subjects.equals( "UnRegistered" )){

            return this.token = - 5;
        }
       return token;
    }
}
