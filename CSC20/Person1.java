public class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Student extends Person1 {
    private int id;

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " " + id;
    }
}

interface List {
    void add(int id, String name);

    void remove(int id);

    void print();
}

class Course implements List {
    private Student[] list;
    private int capacity;
    private int size;

    public Course(int capacity) {
        this.capacity = capacity;
        list = new Student[capacity];
        size = 0;
    }

    @Override
    public void add(int id, String name) {
        if (size < capacity) {
            list[size] = new Student(id, name);
            size++;
        } else {
            System.out.println("Course is full. Cannot add more students.");
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < size; i++) {
            if (list[i].id == id) {
                for (int j = i; j < size - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[size - 1] = null;
                size--;
                System.out.println("Student with ID " + id + " has been removed.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Course c = new Course(2);
        c.add(123, "Jose");
        c.add(789, "Mary");
        c.remove(789);
        c.print();
    }
}