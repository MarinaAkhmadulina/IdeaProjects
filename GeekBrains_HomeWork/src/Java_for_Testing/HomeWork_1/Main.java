package Java_for_Testing.HomeWork_1;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Петр", "Василий", "Екатерина", "Надежда");
        Course course = new Course();
        course.doIt(team);
        System.out.println("---------- РЕЗУЛЬТАТЫ ----------");
        team.showResults();
    }
}