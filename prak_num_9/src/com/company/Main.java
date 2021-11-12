package com.company;

public class Main {

    public static void main(String[] args) {
        Student[] st = new Student[5];
        st[0] = new Student("Jane", "Doe", 12345, 3.6);
        st[1] = new Student("John", "Smith", 23456, 2.5);
        st[2] = new Student("Mary", "Watson", 5, 3.5);
        st[3] = new Student("Olivia", "Bering", 34567, 3.9);
        st[4] = new Student("Pete", "Latimer", 12346, 2.9);

        for (int i = 0; i<5; i++){
            System.out.println(st[i]);}
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.sortingByGPA(st);

        System.out.println("\n");
        for (int i = 0; i<5; i++){
            System.out.println(st[i]);}
    }
}
