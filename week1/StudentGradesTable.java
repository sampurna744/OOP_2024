public class StudentGradesTable {
    public static void main(String[] args) {
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        // Student data
        printStudentRow("Joe", 43, 7);
        printStudentRow("William", 50, 8);
        printStudentRow("Mary Sue", 39, 10);
        // Add more students as needed

    }

    public static void main(String[] args) {
        
    } static void printStudentRow(String name, int labPoints, int bonusPoints) {
        int totalPoints = labPoints + bonusPoints;
        System.out.println(name +"\t"+labPoints + "\t" + bonusPoints + "\t" + totalPoints);
    }
    
    }

