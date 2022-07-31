public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honestess;

    public Puffenduy(String studentName, String faculty,int witchcraft, int transgress,int hardworking, int loyalty, int honestess) {
        super(studentName,faculty, witchcraft, transgress);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honestess = honestess;
    }

    public String toString() {
        return "Student name: " + this.getStudentName() + "; Faculty: " + this.getFaculty()
                + "; Witchcraft: " + this.getWitchcraft() + "; Transgress: " + this.getTransgress()
                + "; Hardworking: " + this.getHardworking() + "; Loyalty: " + this.getLoyalty()
                + "; Honestess: " + this.getHonestess();
    }

    public int getHardworking() {
        return this.hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonestess() {
        return this.honestess;
    }

    public void setBrave(int honestess) {
        this.honestess = honestess;
    }

    public void compareStudentSkills(Puffenduy student) {

        int skillOfFerstStudent = student.getWitchcraft() + student.getTransgress() +
                student.getHardworking() + student.getLoyalty() + student.getHonestess();
        int skillOfSecondStudent = this.getWitchcraft() + this.getTransgress() +
                this.getHardworking() + this.getLoyalty() + this.getHonestess();
        if (skillOfFerstStudent > skillOfSecondStudent) {
            System.out.println("Winner is first student");
        } else if (skillOfFerstStudent < skillOfSecondStudent) {
            System.out.println("Winner is second student");
        } else {
            System.out.println("Skill of students the same!");
        }
    }
}
