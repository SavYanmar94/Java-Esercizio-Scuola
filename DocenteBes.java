import java.util.ArrayList;
import java.util.Arrays;

public class DocenteBes extends Persona implements Sostegno {

    private String materieInsegnate;
    public String sostInterfDocente;;
    

    public DocenteBes(String nome, String cognome, int annoNascita, String materieInsegnate) {
        super(nome, cognome, annoNascita);
        setMaterieInsegnate(materieInsegnate);
        sostInterfDocente = sostegno();
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

    public String sostegno() {
        ArrayList<String> listaStudentiBES = new ArrayList<String>();
        boolean ancora = true;

        do{ 
            System.out.print("Digitare nome studente BES da assegnare: ");
            String nomeStudenteBES = input.nextLine(); 
            listaStudentiBES.add(nomeStudenteBES); 

            System.out.println("Vuoi inserire un altro studente? (S/N)");

            char nuovoStudenteBES = input.nextLine().toUpperCase().charAt(0);

        if(nuovoStudenteBES == 'S' && listaStudentiBES.size() < 3) {
            
        }else if (nuovoStudenteBES == 'S' && listaStudentiBES.size() >= 3) {

        System.out.println("Numero studenti max assegnato può essere 3 !");
            ancora = false;

        } else {

            ancora = false;
        }
        } while(ancora);

        String nomi = Arrays.toString(listaStudentiBES.toArray()).replace("[", " ").replace("]", ", "); // sostituiamo le parentesi quadre con le virgole.
        return "Gli studenti assegnati al docente sono: " + nomi;

    }


}
