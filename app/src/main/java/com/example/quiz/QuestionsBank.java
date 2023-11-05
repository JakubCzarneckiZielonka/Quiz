package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question2 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question3 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question4 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question5 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question6 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }
    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question2 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question3 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question4 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question5 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question6 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question2 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question3 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question4 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question5 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question6 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question2 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question3 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question4 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question5 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");
        final QuestionsList question6 = new QuestionsList("kolor zielony jest jakiego koloru", "czerwonego", "niebieskiego", "turkusowego", "zielonego","zielonego","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName) {
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "html":
                return htmlQuestions();
            default:
                return androidQuestions();
        }
    }
    }

