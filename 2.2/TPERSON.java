abstract class Person {
    String name, address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract void ToString();
}

class Students extends Person {
    int numCourses;
    int grades[];

    Students(String name, String address, int numCourses, int grades[]) {
        super(name, address);
        this.numCourses = numCourses;
        this.grades = grades;
    }

    void ToString() {
        System.out.println("Name : " + super.name);
        System.out.println("Address : " + super.address);
        System.out.println("Number of courses enrolled in : " + numCourses);
        System.out.println("Grades in " + numCourses + " courses : ");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }
}

class Teachers extends Person {
    int numCourses;

    Teachers(String name, String address, int numCourses) {
        super(name, address);
        this.numCourses = numCourses;
    }

    void ToString() {
        System.out.println("Name : " + super.name);
        System.out.println("Address : " + super.address);
        System.out.println("Number of courses taken so far : " + numCourses);
    }
}

class TPERSON {
    public static void main(String args[]) {
        Students[] s = new Students[2];
        int grade1[] = { 97, 98, 99, 100, 94 };
        int grade2[] = { 92, 90, 91, 78, 100 };
        s[0] = new Students("Students1", "def street", 5, grade1);
        s[1] = new Students("Students2", "xyz street", 5, grade2);

        System.out.println("Students Details :");
        System.out.println();
        s[0].ToString();
        System.out.println();
        s[1].ToString();

        Teachers[] t = new Teachers[2];
        t[0] = new Teachers("Teachers1", "abc street", 10);
        t[1] = new Teachers("Teachers2", "mno street", 15);

        System.out.println();
        System.out.println("Teachers Details :");
        System.out.println();
        t[0].ToString();
        System.out.println();
        t[1].ToString();
    }
}