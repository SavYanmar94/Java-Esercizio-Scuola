public class Docente extends Persona {

    private String materieInsegnate;

    public Docente(String nome, String cognome, int annoNascita, String materieInsegnate) {
        super(nome, cognome, annoNascita);
        setMaterieInsegnate(materieInsegnate);
    }

    public void setAnnoNascita(int annoNascita) {

        boolean ancora = true;
        do {
            if (annoNascita >= 1963 && annoNascita <= 1993) {
                this.annoNascita = annoNascita;
                ancora = false;

            } else {
                System.out.println("il nome deve essere almeno di due caratteri, inserire nuovamente il nome");
                annoNascita = input.nextInt();
            }
        } while (ancora);

    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setMaterieInsegnate(String materieInsegnate) {

        boolean ancora = true;
        do {

            switch (materieInsegnate) {

                case "italiano", "storia", "matematica", "scienze", "disegno", "educazione fisica", "informatica",
                        "inglese", "religione", "geografia":
                    this.materieInsegnate = materieInsegnate;
                    ancora = false;
                    break;

                default:
                    System.out.println("la materia inserita errata, inserire nuovamente la materia");
                    materieInsegnate = input.nextLine();
                    break;

            }

        } while (ancora);

    }

    public String getMaterieInsegnate() {
        return materieInsegnate;
    }

}
