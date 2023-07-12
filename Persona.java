import java.util.Scanner;

public abstract class Persona {

    private String nome;
    private String cognome;
    protected int annoNascita;

    Scanner input = new Scanner(System.in);

    public Persona(String nome, String cognome, int annoNascita) {
        setNome(nome);
        setCognome(cognome);
        setAnnoNascita(annoNascita);
    }

    public void setNome(String nome) {

        boolean ancora = true;
        do {
            if (!nome.isEmpty()) {
                this.nome = nome;
                ancora = false;

            } else {
                System.out.println("il nome deve essere almeno di due caratteri, inserire nuovamente il nome");
                nome = input.nextLine();
            }
        } while (ancora);

    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {

        boolean ancora = true;
        do {
            if (!cognome.isEmpty()) {
                this.cognome = cognome;
                ancora = false;

            } else {
                System.out.println("il nome deve essere almeno di due caratteri, inserire nuovamente il nome");
                cognome = input.nextLine();
            }
        } while (ancora);

    }

    public String getCognome() {
        return cognome;
    }

    public abstract void setAnnoNascita(int annoNascita);

    public abstract int getAnnoNascita();

}
