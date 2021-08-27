package Java_for_Testing.HomeWork_1;

public class Course {
    private String[] course;

    public Course() {
        this.course = new String[]{"run", "swim", "bike"};
    }

    public void doIt(Team team) {
        for (String type : course) {
            for (String member : team.getTeamMembers()) {
                System.out.println("Участник " + member + " начал испытание " + type);
            }
        }
    }
}