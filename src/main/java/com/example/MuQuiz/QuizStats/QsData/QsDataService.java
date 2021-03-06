package com.example.MuQuiz.QuizStats.QsData;

import com.example.MuQuiz.questionsPage.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QsDataService {

    @Autowired
    private QsDataRepository qsDataRepository;


    public QsDataService() {
    }

    public void postQuestionsDataToDB(int numOfQuestions, QuestionsService questionsService, Long answer, Integer score, Long quizId) {
        QsData qsData = new QsData();

        qsData.setNumOfQuestionInQuiz(numOfQuestions);
        qsData.setQuizId(quizId);
        qsData.setScore(score);
        qsData.setUserAnswer(answer);
        qsData.setCorrectAnswer(questionsService.getCorrectAnswer());
        qsData.setTypeQuestion(questionsService.getTypeQuestion());
        if (questionsService.getMovieList() == null) {
            System.out.println("size " + questionsService.getActorList().size());
            qsData.setAnswerAltOne(questionsService.getActorList().get(0).getId());
            qsData.setAnswerAltTwo(questionsService.getActorList().get(1).getId());
            qsData.setAnswerAltThree(questionsService.getActorList().get(2).getId());
            qsData.setAnswerAltFour(questionsService.getActorList().get(3).getId());
        } else if (questionsService.getActorList() == null) {
            System.out.println("size " + questionsService.getMovieList().size());
            qsData.setAnswerAltOne(questionsService.getMovieList().get(0).getId());
            qsData.setAnswerAltTwo(questionsService.getMovieList().get(1).getId());
            qsData.setAnswerAltThree(questionsService.getMovieList().get(2).getId());
            qsData.setAnswerAltFour(questionsService.getMovieList().get(3).getId());
        }
        qsDataRepository.save(qsData);
    }

    public void postQuestionsDataToDB(int numOfQuestions, QuestionsService questionsService, Long answer, Long quizId) {
        QsData qsData = new QsData();

        qsData.setNumOfQuestionInQuiz(numOfQuestions);
        qsData.setQuizId(quizId);
        qsData.setUserAnswer(answer);
        qsData.setCorrectAnswer(questionsService.getCorrectAnswer());
        qsData.setTypeQuestion(questionsService.getTypeQuestion());
        if (questionsService.getMovieList() == null) {
            System.out.println("size " + questionsService.getActorList().size());
            qsData.setAnswerAltOne(questionsService.getActorList().get(0).getId());
            qsData.setAnswerAltTwo(questionsService.getActorList().get(1).getId());
            qsData.setAnswerAltThree(questionsService.getActorList().get(2).getId());
            qsData.setAnswerAltFour(questionsService.getActorList().get(3).getId());
        } else if (questionsService.getActorList() == null) {
            System.out.println("size " + questionsService.getMovieList().size());
            qsData.setAnswerAltOne(questionsService.getMovieList().get(0).getId());
            qsData.setAnswerAltTwo(questionsService.getMovieList().get(1).getId());
            qsData.setAnswerAltThree(questionsService.getMovieList().get(2).getId());
            qsData.setAnswerAltFour(questionsService.getMovieList().get(3).getId());
        }
        qsDataRepository.save(qsData);
    }
}
