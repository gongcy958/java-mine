package com.yy.domain;

/**
 * @author gongcy
 * @date 2023/9/12 5:20 下午
 * @Description
 */
public class EnExercise {

    private Integer id;
    private Integer exerciseType;
    private String originWord;
    private String answerWord;
    private String wordNote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(Integer exerciseType) {
        this.exerciseType = exerciseType;
    }

    public String getOriginWord() {
        return originWord;
    }

    public void setOriginWord(String originWord) {
        this.originWord = originWord;
    }

    public String getAnswerWord() {
        return answerWord;
    }

    public void setAnswerWord(String answerWord) {
        this.answerWord = answerWord;
    }

    public String getWordNote() {
        return wordNote;
    }

    public void setWordNote(String wordNote) {
        this.wordNote = wordNote;
    }

    public EnExercise(Integer id, Integer exerciseType, String originWord, String answer, String wordNote) {
        this.id = id;
        this.exerciseType = exerciseType;
        this.originWord = originWord;
        this.answerWord = answer;
        this.wordNote = wordNote;
    }
}
