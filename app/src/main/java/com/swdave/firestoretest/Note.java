package com.swdave.firestoretest;

import com.google.firebase.firestore.Exclude;

public class Note {


    private String documentId;
    private String title;
    private String description;
    private int priority;

    public Note() {
        // public no-arg constructor needed

    }

    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    // @Exclude hides this from Firebase so it doesnt add it to the DB
    @Exclude
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
