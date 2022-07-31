public class Hogwarts {

    private String studentName;
    private String faculty;
    private int witchcraft;
    private int transgress;

    public Hogwarts( String studentName,String faculty, int witchcraft, int transgress) {
        this.studentName = studentName;
        this.faculty = faculty;
        this.transgress = transgress;
        this.witchcraft = witchcraft;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getWitchcraft() {
        return this.witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return this.transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
    public void compareStudentSkills(Hogwarts student) {

        int skillOfFerstStudent = student.getWitchcraft() + student.getTransgress();
        int skillOfSecondStudent = this.getWitchcraft() + this.getTransgress();
        if (skillOfFerstStudent > skillOfSecondStudent) {
            System.out.println("Winner is first student");
        } else if (skillOfFerstStudent < skillOfSecondStudent) {
            System.out.println("Winner is second student");
        } else {
            System.out.println("Skill of students the same!");
        }
    }
}
