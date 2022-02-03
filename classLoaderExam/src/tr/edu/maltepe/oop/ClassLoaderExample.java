package tr.edu.maltepe.oop;

public class ClassLoaderExample {

    public static void main(String[] args) throws  SecurityException, IllegalArgumentException {

        ClassLoaderFinalExam clfe = new ClassLoaderFinalExam();
        clfe.testClassLoader("tr.edu.maltepe.oop.ExamClass");
    }

}
