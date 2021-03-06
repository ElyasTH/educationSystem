package com.example.educationsystem;

public abstract class Question {
    private int lessonId;
    private  int questionId;
    private String question;
    private float score;
    private String questionType;
    private static int questionCount = 10000;

    public Question(int lessonId, int questionId, float score, String question, String  questionType) {
        this.lessonId = lessonId;
        if (questionId == 0){
            if (questionCount == 0) questionCount = 10000;
            this.questionId = questionCount;
            questionCount++;
        }
        else this.questionId = questionId;
        this.score = score;
        this.question = question;
        this.questionType = questionType;
    }

    public int getLessonId() {
        return lessonId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public float getScore() {
        return score;
    }

    public String getQuestionType() {
        return questionType;
    }

    public static void loadLastId(){
        questionCount = Database.getLastId("questions");
        questionCount++;
    }
}
