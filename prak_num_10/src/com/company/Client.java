package com.company;

public class Client {
    public Chair chair;

    void sit(){
        System.out.println("Реакция стула:");
    }

    void setChair(Chair chair){
        this.chair = chair;
    }
}
