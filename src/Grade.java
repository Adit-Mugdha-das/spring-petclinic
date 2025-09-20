public class Grade {
    public String getGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 50) return "C";
        return "F";
    }
}