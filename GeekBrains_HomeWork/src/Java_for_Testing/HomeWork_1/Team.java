package Java_for_Testing.HomeWork_1;

public class Team {
    private String[] teamMembersList;

    public Team(String member_1, String member_2, String member_3, String member_4) {
        this.teamMembersList = new String[]{member_1, member_2, member_3, member_4};
    }

    public String[] getTeamMembers() {
        return teamMembersList;
    }

    public void showResults() {
        for (String member : teamMembersList) {
            System.out.println("Участник " + member + " прошел всю дистанцию");
        }
    }
}