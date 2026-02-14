package Lab_03_Tasks;

public class Programmer {
    int programmerID;
    String programmerName;
    String preferredLanguage;
    int problemsSolved;

    Programmer() {
        programmerID = 0;
        programmerName = "Unknown Name";
        preferredLanguage = "Unknown Language";
        problemsSolved = 0;
    }

    Programmer(int ID, String name, String language, int probSolved) {
        this.programmerID = ID;
        this.programmerName = name;
        this.preferredLanguage = language;
        this.problemsSolved = probSolved;
    }

    void updateSolvedProblems(int newProblems) {
        if(newProblems > 0) {
            problemsSolved += newProblems;
            System.out.println("Updated Solved Problems: " + problemsSolved);
        }
        else {
            System.out.println("Solved Problems Cannot Be Updated!");
        }
    }

    void displayProgrammerDetails() {
        System.out.println("Programmer ID: " + programmerID);
        System.out.println("Programmer Name: " + programmerName);
        System.out.println("Preferred Language: " + preferredLanguage);
        System.out.println("Problems Solved: " + problemsSolved);
    }

    public static void main(String[] args) {
        System.out.println("\nDefault Details:");
        Programmer programmer1 = new Programmer();
        programmer1.displayProgrammerDetails();

        System.out.println("\nInitial Details:");
        Programmer programmer2 = new Programmer(101, "Moiz", "C++", 250);
        programmer2.displayProgrammerDetails();
        Programmer programmer3 = new Programmer(202, "Ahmed", "Python", 175);
        programmer3.displayProgrammerDetails();

        programmer2.updateSolvedProblems(150);
        programmer3.updateSolvedProblems(50);

        System.out.println("\nUpdated Details:");
        programmer2.displayProgrammerDetails();
        programmer3.displayProgrammerDetails();
    }
}