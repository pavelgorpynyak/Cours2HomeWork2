public class Slizerin extends Hogwarts {
    private int trickery;
    private int resoluteness;
    private int ambitions;
    private int inventiveness;
    private int lustForPower;

    public Slizerin(String studentName, String faculty, int witchcraft, int transgress, int trickery, int resoluteness, int ambitions, int inventiveness, int lustForPower) {
        super(studentName,faculty,witchcraft, transgress);
        this.trickery = trickery;
        this.resoluteness = resoluteness;
        this.ambitions = ambitions;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return "Student name: " + this.getStudentName() + "; Faculty: " + this.getFaculty()
                + "; Witchcraft: " + this.getWitchcraft() + "; Transgress: " + this.getTransgress()
                + "; Trickery: " + this.getTrickery() + "; Resoluteness: " + this.getResoluteness()
                + "; Ambitions: " + this.getAmbitions() + "; Inventiveness: " + getInventiveness()
                + "; lustForPower: " + getLustForPower();
    }

    public int getTrickery() {
        return this.trickery;
    }
    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }
    public int getResoluteness() {
        return this.resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbitions() {
        return this.ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getInventiveness() {
        return this.inventiveness;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public int getLustForPower() {
        return this.lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void compareStudentSkills(Slizerin student) {

        int skillOfFerstStudent = student.getWitchcraft() + student.getTransgress() +
                student.getTrickery() + student.getResoluteness() + student.getAmbitions()
                + student.getInventiveness() + student.getLustForPower();
        int skillOfSecondStudent = this.getWitchcraft() + this.getTransgress() +
                this.getTrickery() + this.getResoluteness() + this.getAmbitions()
                + this.getInventiveness() + this.getLustForPower();
        if (skillOfFerstStudent > skillOfSecondStudent) {
            System.out.println("Winner is first student");
        } else if (skillOfFerstStudent < skillOfSecondStudent) {
            System.out.println("Winner is second student");
        } else {
            System.out.println("Skill of students the same!");
        }
    }
}
