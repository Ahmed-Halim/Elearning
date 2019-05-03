package elearning;

import java.util.ArrayList;

public class Quiz {
    int quizId;
    String name;
    ArrayList <String> questions;
    ArrayList <String> answers;

    public Quiz() {
        questions = new ArrayList <>();
        answers = new ArrayList <>();
    }
    
    public Quiz(int quizId, String name, ArrayList<String> questions, ArrayList<String> answers) {
        this.quizId = quizId;
        this.name = name;
        this.questions = questions;
        this.answers = answers;
    }

    private int generateId() {
        return 1;
    }
    
    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Quiz{" + "quizId=" + quizId + ", name=" + name + ", questions=" + questions + ", answers=" + answers + '}';
    }
   
    public void addQuestion(String question) {
        this.questions.add(question);
    }
    
    public void addAnswer(String answer) {
        this.answers.add(answer);
    }
    
}
