package com.kit.quizeapp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Quize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titel;

    @ManyToMany
    private List<Question> question;

    // Default constructor without parameters
    public Quize() {
    }

    // Constructor without 'id' parameter
    public Quize(String titel, List<Question> question) {
        this.titel = titel;
        this.question = question;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    // toString method

    @Override
    public String toString() {
        return "Quize [id=" + id + ", titel=" + titel + ", question=" + question + "]";
    }
}
