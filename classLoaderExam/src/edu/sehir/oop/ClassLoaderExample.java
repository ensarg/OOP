package edu.sehir.oop;

public class ClassLoaderExample {

    public static void main(String[] args) throws  SecurityException, IllegalArgumentException {

        ClassLoaderFinalExam clfe = new ClassLoaderFinalExam();
        clfe.testClassLoader("edu.sehir.oop.ExamClass");
    }

}
