// Class Name - Noun 
// Class - Complex Data Type , User Define Data Type
// S O L I D
//class Student extends Object{
class A {
    A() {

    }

    A(int x) {

    }
}

class Student {
    String collegeLoc;
    static String collegeName; // CLass Member (Bind with class)
    // static Student.collegeName
    // Members
    // Data Members
    // Instance Members (Bind with object)
    int id;
    String name;
    int marks[] = new int[3];
    // to init static things use static block
    // static block call when class is loaded.
    static {
        int e = 10;
        System.out.println("I Call First, when class is Loaded.." + e);

        // id = 1001;
        collegeName = "DIT";
    }
    String course;
    {
        System.out.println("Init Block " + id + " " + name);
    }

    /*
     * Constructor - Call when object is created
     * Used to init Instance Variables
     */
    Student() {
        collegeLoc = "Delhi";
        // id = 1001;
        // name = "";
        // course = "Java";
        // marks[0] = 90;
        // marks[1] = 88;
        // marks[2] = 77;
        // System.out.println("I call when object is created");
        // System.out.println(id);
        // System.out.println(name);
    }

    void Student() {
        System.out.println("I am a Method , I am not Constructor");
    }

    // Local
    Student(int id, String name, int[] marks, String course) {
        this();
        // Student();
        // this();
        // Instance Var = Local Var
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.course = course;

    }

    // Method Members
    void print() {
        // this - keyword
        // it hold the current calling object reference
        // amit -reference comes here and it goes in this keyword
        System.out.println("College Loc " + collegeLoc);
        System.out.println("Id " + this.id);
        System.out.println("Name " + name.toString());
        for (int mark : marks) {
            System.out.println(mark);
        }
        // System.out.println("Marks " + marks.toString());
        System.out.println("Course " + course);
    }
}

class ClassExample {
    public static void main(String[] args) {
        Student shyam = new Student();
        Student amit; // amit - Variable
        amit = new Student(1001, "Amit", new int[] { 90, 88, 77 }, "JS"); // creating object and calling default
        System.out.println(amit); // constructor
        amit.print();
        System.out.println("*************************");
        Student ram = new Student(1002, "Ram", new int[] { 88, 90, 55 }, "Java");
        ram.print();
        ram = null; // GC will collect this

        int x; // x - variable
        x = 10; // Init
    }
}