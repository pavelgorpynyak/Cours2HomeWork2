public class Main {
    public static void main(String[] args) {

        Gryffindor garryPotter = new Gryffindor("Garry Potter", "Gryffindor", 95, 94, 95, 95, 99);
        Gryffindor germionaGranger = new Gryffindor("Germiona Granger", "Gryffindor", 85, 90, 93, 92, 97);
        Gryffindor ronWizly = new Gryffindor("Ron Wizly", "Gryffindor", 70, 75, 75, 90, 98);

        Puffenduy zachatiyaSmith = new Puffenduy("Zachatiya Smith", "Puffenduy", 80, 85, 88, 80, 90);
        Puffenduy cedrickDigory = new Puffenduy("Cedrick Digory", "Puffenduy", 81, 83, 78, 82, 88);
        Puffenduy justinFinchFletchly = new Puffenduy("Justin Finch-Fletchly", "Puffenduy", 85, 80, 79, 85, 87);

        Cogtevran joyChang = new Cogtevran("Joy Chang", "Cogtevran", 84, 82, 88, 84, 89);
        Cogtevran padmaPatil = new Cogtevran("Padma Patil", "Cogtevran", 82, 85, 86, 94, 99);
        Cogtevran marcusBelby = new Cogtevran("Marcus Belby", "Cogtevran", 80, 83, 88, 91, 79);

        Slizerin dracoMalphoy = new Slizerin("Draco Malphoy", "Slizerin", 92, 91, 94, 88, 99, 98, 99);
        Slizerin grachamMontegu = new Slizerin("Gracham Montegu", "Slizerin", 90, 85, 92, 87, 96, 94, 97);
        Slizerin gregoryGoil = new Slizerin("Gregory Goil", "Slizerin", 75, 70, 90, 89, 95, 93, 95);

        System.out.println(garryPotter);
        System.out.println(germionaGranger);
        System.out.println(ronWizly);
        System.out.println(zachatiyaSmith);
        System.out.println(cedrickDigory);
        System.out.println(justinFinchFletchly);
        System.out.println(joyChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        System.out.println(dracoMalphoy);
        System.out.println(grachamMontegu);
        System.out.println(gregoryGoil);

        garryPotter.compareStudentSkills(germionaGranger);
        zachatiyaSmith.compareStudentSkills(justinFinchFletchly);
        joyChang.compareStudentSkills(padmaPatil);
        dracoMalphoy.compareStudentSkills(grachamMontegu);
        ronWizly.compareStudentSkills(gregoryGoil);
    }
}