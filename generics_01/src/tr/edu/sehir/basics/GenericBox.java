package tr.edu.sehir.basics;

public class GenericBox<T> {
        // T stands for "Type"
        private T t;

        public void set(T t) { this.t = t; }
        public T get() { return t; }

    void genericDisplay (T element)
    {
        System.out.println("element is: " + element);
    }


    }


