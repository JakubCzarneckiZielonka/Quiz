package com.example.quiz;

public class QuestionsList {
    private String question, option1, options2, options3, options4, answer;
    private String userSelectedAnswer;

    public QuestionsList(String question, String option1, String options2, String options3, String options4, String answer, String userSelectedAnswer) {
        this.question = question;
        this.option1 = option1;
        this.options2 = options2;
        this.options3 = options3;
        this.options4 = options4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOptions2() {
        return options2;
    }

    public void setOptions2(String options2) {
        this.options2 = options2;
    }

    public String getOptions3() {
        return options3;
    }

    public void setOptions3(String options3) {
        this.options3 = options3;
    }

    public String getOptions4() {
        return options4;
    }

    public void setOptions4(String options4) {
        this.options4 = options4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}

