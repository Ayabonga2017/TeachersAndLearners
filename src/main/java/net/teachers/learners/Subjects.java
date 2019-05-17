package net.teachers.learners;

public enum Subjects {

    lifesciences ("lifesciences"),
    geograpy("geograpy"),
    mathematics("mathematics"),
    physics("physics"),
    history("history"),
    business("business"),
    cat("cat");

    String subject;

    Subjects (String s) {
        this.subject =s;
    }

    public String getSub(){
        return subject;
    }
}
