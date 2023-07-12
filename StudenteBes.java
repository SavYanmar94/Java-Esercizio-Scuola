
public class StudenteBes extends Persona implements Sostegno {

    private int classe;
    private char sezione;
    //private String matricola;
    public String sostInterfStudente;

    public StudenteBes(String nome, String cognome, int annoNascita, int classe, char sezione, String matricola) {
        super(nome, cognome, annoNascita);
        setClasse(classe);
        setSezione(sezione);
        //setMatricola(matricola);
        setAnnoNascita(annoNascita);
        sostInterfStudente = sostegno();
    }

    public void setAnnoNascita(int annoNascita) {

        boolean ancora = true;
        do {
            if (annoNascita < 2017) {
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

    public void setClasse(int classe) {

        boolean ancora = true;
        do {
            if (classe >= 1 && classe <= 5) {
                this.classe = classe;
                ancora = false;

            } else {
                System.out.println("");
                annoNascita = input.nextInt();
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

    /* public void setMatricola(String matricola) {

        boolean ancora = true;
        do {
            if (matricola.length() == 6) {
                this.matricola = matricola;
                ancora = false;

            } else {
                System.out.println("la classe deve essere compresa ra 1 e 5 ");
                matricola = input.nextLine();
            }
        } while (ancora);

    }

    public String getMatricola() {
        return matricola;
    } */
/* 
   // private String docenteAssegnato;

    //public String sostegno(String nome) {
        return (nome);

    }
 */
   /*  public void setDocenteAssegnato(String docenteAssegnato) {

        boolean ancora = true;
        do{
            if(docenteAssegnato.length() >= 1){
                this.docenteAssegnato = docenteAssegnato;
                ancora = false;

            }else{
                System.out.println("la classe deve essere compresa ra 1 e 5 ");
                classe = input.nextInt();
                input.nextLine(); 
            }
        }while(ancora);

    }

     public String getDocenteAssegnato(){ 
        return docenteAssegnato;
    } */


    public String sostegno() {
        System.out.print("Chi è il docente di riferimento? ");
        String DocenteNome = input.nextLine();

        return "Il docente di riferimento è " + DocenteNome;
    }

    
    }


