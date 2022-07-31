public class Cogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int creativity;

    public Cogtevran(String studentName, String faculty, int witchcraft, int transgress, int smart, int wise, int creativity) {
        super(studentName,faculty,witchcraft, transgress);
        this.smart = smart;
        this.wise = wise;
        this.creativity = creativity;
    }
    public String toString() {
        return "Student name: " + this.getStudentName() + "; Faculty: " + this.getFaculty()
                + "; Witchcraft: " + this.getWitchcraft() + "; Transgress: " + this.getTransgress()
                + "; Smart: " + this.getSmart() + "; Wise: " + this.getWise()
                + "; Creativity: " + this.getCreativity();
    }


    public int getSmart() {
        return this.smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return this.wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getCreativity() {
        return this.creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compareStudentSkills(Cogtevran student) {

        int skillOfFerstStudent = student.getWitchcraft() + student.getTransgress() +
                student.getSmart() + student.getCreativity() + student.getWise();
        int skillOfSecondStudent = this.getWitchcraft() + this.getTransgress() +
                this.getSmart() + this.getCreativity() + this.getWise();
        if (skillOfFerstStudent > skillOfSecondStudent) {
            System.out.println("Winner is first student");
        } else if (skillOfFerstStudent < skillOfSecondStudent) {
            System.out.println("Winner is second student");
        } else {
            System.out.println("Skill of students the same!");
        }
    }
}
