class InvalidScore extends Exception {
    private double x;

    InvalidScore(int x) {
        this.x = x;
    }

    public String toString() {
        return "Invalid score " + this.x + ", score cannot be negative and must be smaller than 100";
    }
}

class Student {
    String name;
    int roll, score;

    Student(String name, int roll, int score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }

    public String toString() {
        return "Name: " + this.name + ", Roll: " + this.roll + ", Score: " + this.score;
    }
}

class Score {
    public static void main(String[] args) {
        Student studentList[] = new Student[3];
        studentList[0] = new Student("Aditya", 6, 101);
        studentList[1] = new Student("Raj", 10, -3);
        studentList[2] = new Student("Shourya Gupta", 28, 92);
        for (int i = 0; i < 3; i++) {
            try {
                if (studentList[i].score < 0 || studentList[i].score > 100) {
                    throw new InvalidScore(studentList[i].score);
                }
                System.out.println(studentList[i]);
            } catch (InvalidScore e) {
                System.out.println(e);
            }
        }
    }
}