public class Tokens {

    int token = 0;
    boolean lesson;
    String subjects;

    public int attended ( ){

        if ( lesson == true ) {

            this.token = + 3;
        }
        return token;
    }

    public int notes ( ){

        if ( subjects.equals( "Registered" )) {

            Subjects.valueOf( subjects ).getSub( ).equals( subjects );
            return  this.token = - 2;

        } else if(subjects.equals( "UnRegistered" )){

            return this.token = - 5;
        }
       return token;
    }
}
