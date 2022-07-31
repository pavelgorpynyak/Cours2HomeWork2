public class Gryffindor extends Hogwarts {
    private String faculty;
    private int nobility;
    private int honor;
    private int brave;

    public Gryffindor(String studentName, String faculty, int witchcraft, int transgress, int nobility, int honor, int brave) {
        super(studentName, faculty, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public String toString() {
        return "Student name: " + this.getStudentName() + "; Faculty: " + this.getFaculty()
                + "; Witchcraft: " + this.getWitchcraft() + "; Transgress: " + this.getTransgress()
                + "; Nobility: " + this.getNobility() + "; Honor: " + this.getHonor()
                + "; Brave: " + this.getBrave();
    }

    public int getNobility() {
        return this.nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return this.brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public void compareStudentSkills(Gryffindor student) {

        int skillOfFerstStudent = student.getWitchcraft() + student.getTransgress() +
                student.getNobility() + student.getBrave() + student.getHonor();
        int skillOfSecondStudent = this.getWitchcraft() + this.getTransgress() +
                this.getNobility() + this.getBrave() + this.getHonor();
        if (skillOfFerstStudent > skillOfSecondStudent) {
            System.out.println("Winner is first student");
        } else if (skillOfFerstStudent < skillOfSecondStudent) {
            System.out.println("Winner is second student");
        } else {
            System.out.println("Skill of students the same!");
        }
    }
}
