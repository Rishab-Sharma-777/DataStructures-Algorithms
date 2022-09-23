public class GradingSystem {
    public static void main(String args[]) {

        int marks = 70;
        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("Very Good");

        } else if (marks > 70) {
            System.out.println("Meet Expectations");

        } else if (marks > 60) {
            System.out.println("Fair");

        } else if (marks <= 50) {
            System.out.println("Fail");
        }
    }
}
