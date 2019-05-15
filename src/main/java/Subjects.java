
public enum Subjects {

    LIFESCIENCES ("LIFESCIENCES"),
    GEOGRAPHY("GEOGRAPHY"),
    MATHEMATICS("MATHEMATICS"),
    PHYSICS("PHYSICS"),
    HISTORY("HISTORY"),
    BUSINESS("BUSINESS"),
    CAT("CAT");


    String sub;

    Subjects (String sub ){
        this.sub =sub;
    }

    public String getSub(){

        return sub;
    }
}
