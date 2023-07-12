public class Studente extends Persona {

    private int classe;
    private char sezione;
    
    

    public Studente(String nome, String cognome, int annoNascita, int classe, char sezione) {
        super(nome, cognome, annoNascita);
        setClasse(classe);
        setSezione(sezione);
        setAnnoNascita(annoNascita);
        
    }

    public void setAnnoNascita(int annoNascita) {

        boolean ancora = true;
        do {
            if (annoNascita < 2017) {
                this.annoNascita = annoNascita;
                ancora = false;

            } else {
                System.out.println("Questo studente non può iscriversi alla scuola");

            }
        } while (ancora);

    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setClasse(int classe) {

        boolean ancora = true;
        do {
            if (classe >= 1 && classe <= 5) {
                this.classe = classe;
                ancora = false;

            } else {
                System.out.println("");
                classe = input.nextInt();
            }
        } while (ancora);

    }

    public int getClasse() {
        return classe;
    }

    public void setSezione(char sezione) {

        boolean ancora = true;
        do {
            if (sezione == 'A' || sezione == 'B' || sezione == 'C' || sezione == 'D' || sezione == 'E') {
                this.sezione = sezione;
                ancora = false;

            } else {
                System.out.println("La sezione deve essere compresa tra 'A ed E'");
                sezione = input.nextLine().toUpperCase().charAt(0);
            }
        } while (ancora);

    }

    public char getSezione() {
        return sezione;
    }

}
