package tn.esprit.services;



import tn.esprit.entities.Answer;

import java.util.List;

public interface IntAnswer {
    public void addAnswer(Answer a);
    public List<Answer> getAllAnswer();
    public void updateAnswer(Answer a);
    public void deleteAnswer(int id);
    public void addAnswerToUser( int idUser,int idAnswer);
    public int calculScoreQuiz( int idUser,int idQuiz);


}
