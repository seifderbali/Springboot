package tn.esprit.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.entities.Answer;
import tn.esprit.services.IntAnswer;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("Answer")
@Transactional
public class AnswerController {
    @Autowired
    IntAnswer intAnswer;

    @PostMapping("/Post")
    public void addAnswer(@RequestBody Answer a) {
        intAnswer.addAnswer(a);
    }
    @GetMapping("/Get")
    public List<Answer> getAllAnswer(){
        return intAnswer.getAllAnswer();
    }
    @PutMapping("/Put")
    public void updateAnswer(@RequestBody Answer a){
        intAnswer.updateAnswer(a);
    }
    @DeleteMapping("/Delete/{id}")
    public void deleteAnswer(@PathVariable("id") int id){
        intAnswer.deleteAnswer(id);
    }
    @PostMapping("/AddAnswerToUser/{idu}/{ida}")
    public void addAnswerToUser( @PathVariable("idu") int idUser,@PathVariable("ida") int idAnswer) {
        intAnswer.addAnswerToUser(idUser,idAnswer);
    }
    @GetMapping("/get/{idU}/{idQ}")
    public int calculScoreQuiz(@PathVariable("idU") int idUser,@PathVariable("idQ") int idQuiz) {
        return intAnswer.calculScoreQuiz(idUser, idQuiz);
    }


    }
