package org.launchcode.java.studios.quizzes;


import java.util.ArrayList;
import java.util.Arrays;

public class Checkbox extends Question{

    String answer;
    ArrayList<String> inputAnswerArr;

    public Checkbox(String aQuestion, ArrayList<String> aChoices, String aCorrectAnswer) {
        super(aQuestion, aChoices);
        answer = aCorrectAnswer;
        setQuestionType("Checkbox");
    }

    @Override
    public void askQuestion() {
        System.out.println(getQuestion());
        System.out.println("Choose all that apply: Separate answers with comma (,): ");
        System.out.println(getChoices());
    }

    public void answerToArrayList(String inputAnswer) {
        String[] answerArr = inputAnswer.split(",");
        inputAnswerArr= (ArrayList<String>) Arrays.asList(answerArr);

    }
}
