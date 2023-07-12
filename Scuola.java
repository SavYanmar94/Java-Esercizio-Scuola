import java.util.Scanner;
import java.util.ArrayList;

public class Scuola {

    ArrayList<Docente> docenteArrayList = new ArrayList<Docente>();
    ArrayList<Studente> studenteArrayList = new ArrayList<Studente>();
    ArrayList<StudenteBes> studenteBESArrayList = new ArrayList<StudenteBes>();
    ArrayList<DocenteBes> docenteBESArrayList = new ArrayList<DocenteBes>();
    String[] gruppoMaterie = { "italiano", "storia", "matematica", "scienze", "disegno", "educazione fisica",
            "informatica", "inglese", "religione", "geografia" };

    Scanner stringhe = new Scanner(System.in);
    Scanner interi = new Scanner(System.in);

    String nom;
    String cognom;
    int annodiNascit;
    char sezion;
    int clas;
    int scelta;
    String matricol = " ";
    int numeroProgressivo = 0;
    String materieInsegnat;
    boolean condizione = true;

    public String generareMatricola(int annoDiNascit, int numeroProgressivo, char sezion) {
        String matricola = String.format("%02d", annoDiNascit % 100); // Prende le ultime due cifre dell'anno di nascita
        matricola += String.format("%03d", numeroProgressivo); // Aggiunge il numero progressivo con tre cifre (000-999)
        matricola += sezion; // Aggiunge la sezione alla matricola
        return matricola;
    }

    /* public String sostegno(String nome) {
        return "NomeDocente";
    } */

    public void operazioni() {

        while (condizione) {

            System.out.println("Digita 1 per registrare i dati della figura scolastica desiderata");
            System.out.println("Digita 2 per stampare i dati della figura scolastica desiderata");
            System.out.println("Digita 3 per terminare");

            scelta = interi.nextInt();
            interi.nextLine();

            switch (scelta) {

                case 1:
                    int figura;
                    System.out.println("Digita la figura di cui inserire le informazioni");
                    System.out.println("1.Studente , 2.Docente , 3.Studente BES, 4.Docente BES");
                    figura = interi.nextInt();

                    switch (figura) {

                        case 1:
                            System.out.println("Digita il nome dello studente");
                            nom = stringhe.nextLine();
                            System.out.println("Digita il cognome dello studente");
                            cognom = stringhe.nextLine();
                            System.out.println("Digita l'anno di nascita (prima del 2017) ");
                            annodiNascit = interi.nextInt();

                            if (annodiNascit < 2017) {

                                System.out.println("Digita la classe dello studente(da 1 a 5)");
                                clas = interi.nextInt();
                                System.out.println("Digita la sezione dello studente (da A a E)");
                                sezion = stringhe.next().toUpperCase().charAt(0);
                                studenteArrayList.add(new Studente(nom, cognom, annodiNascit, clas, sezion));

                            } else {

                                System.out.println("lo studente deve essere nato prima del 2017 per fare l'iscrizione");
                                break;
                            }

                            break;

                        case 2:
                            System.out.println("Digita il nome del docente");
                            nom = stringhe.nextLine();
                            System.out.println("Digita il cognome del docente");
                            cognom = stringhe.nextLine();
                            System.out.println("Digita l'anno di nascita(tra 1963 e 1993)");
                            annodiNascit = interi.nextInt();

                            if (annodiNascit > 1963 && annodiNascit < 1993) {
                                System.out.println(
                                        "Controlla la materia insegnata tra una di queste e digita il numero corrispondente");
                                for (int i = 0; i < gruppoMaterie.length; i++) {
                                    System.out.println("-" + gruppoMaterie[i]);
                                }
                                materieInsegnat = stringhe.nextLine();
                                docenteArrayList.add(new Docente(nom, cognom, annodiNascit, materieInsegnat));

                            } else {

                                System.out.println(
                                        "il docente deve essere nato tra il 1963 e 1993 per fare l'iscrizione");
                                break;
                            }
                            break;

                        case 3:
                            System.out.println("Digita il nome dello studente BES");
                            nom = stringhe.nextLine();
                            System.out.println("Digita il cognome dello studente BES");
                            cognom = stringhe.nextLine();
                            System.out.println("Digita l'anno di nascita(prima del 2017)");
                            annodiNascit = interi.nextInt();

                            if (annodiNascit < 2017) {
                                System.out.println("Digita la classe dello studente BES(da 1 a 5)");
                                clas = interi.nextInt();
                                System.out.println("Digita la sezione dello studente BES (da A a E)");
                                sezion = stringhe.next().toUpperCase().charAt(0);

                                
                                studenteBESArrayList.add(new StudenteBes(nom, cognom, annodiNascit, clas, sezion, matricol));
                                // Creazione dello studente BES

                        /*         // Assegnazione del docente BES
                                String docenteAssegnato = sostegno(nom); // Chiamata al metodo sostegno(nom) per
                                                                         // ottenere il docente assegnato
                                studenteBES.setDocenteAssegnato(docenteAssegnato); // Imposta il docente assegnato allo
                                    */                                                // studente BES

                                // Aggiungi lo studente BES all'ArrayList
                                

                            } else {

                                System.out.println("lo studente deve essere nato prima del 2017 per fare l'iscrizione");
                                break;
                            }

                            break;

                        case 4:
                            System.out.println("Digita il nome del docente BES");
                            nom = stringhe.nextLine();
                            System.out.println("Digita il cognome del docente BES");
                            cognom = stringhe.nextLine();
                            System.out.println("Digita l'anno di nascita");
                            annodiNascit = interi.nextInt();

                            if (annodiNascit > 1963 && annodiNascit < 1993) {
                                System.out.println("Digita la materia insegnata dal docente");
                                for (int i = 0; i < gruppoMaterie.length; i++) {
                                    System.out.println((i + 1) + "." + gruppoMaterie[i]);
                                }

                                materieInsegnat = stringhe.nextLine();
                                docenteBESArrayList.add(new DocenteBes(nom, cognom, annodiNascit, materieInsegnat));

                            } else {
                                System.out.println(
                                        "il docente deve essere nato tra il 1963 e 1993 per fare l'iscrizione");
                                break;

                            }

                            break;

                    }

                    break;

                case 2:
                    int sceltaStampa;
                    System.out.println("Digita la figura di cui vuoi stampare le informazioni");
                    System.out.println("1.Studente , 2.Docente , 3.Studente BES, 4.Docente BES");
                    sceltaStampa = interi.nextInt();

                    switch (sceltaStampa) {

                        case 1:

                            for (Studente stampa : studenteArrayList) {

                                System.out.print("" + (studenteArrayList.indexOf(stampa) + 1) + ". ");

                                System.out.println("Nome: " + stampa.getNome());
                                System.out.println("Cognome: " + stampa.getCognome());
                                System.out.println("Anno di nascita: " + stampa.getAnnoNascita());
                                System.out.println("Sezione: " + stampa.getSezione());
                                System.out.println("Classe: " + stampa.getClasse());
                                System.out.println(
                                        "Matricola: " + generareMatricola(annodiNascit, numeroProgressivo, sezion));
                                numeroProgressivo++; // Incrementa il numero progressivo per ogni nuovo studente
                                matricol = generareMatricola(annodiNascit, numeroProgressivo, sezion);
                                studenteArrayList.add(new Studente(nom, cognom, annodiNascit, clas, sezion));
                                System.out.println(" ------------ ");

                            }

                            break;

                        case 2:

                            for (Docente stampa : docenteArrayList) {

                                System.out.print("" + (docenteArrayList.indexOf(stampa) + 1) + ". ");

                                System.out.println("Nome: " + stampa.getNome());
                                System.out.println("Cognome: " + stampa.getCognome());
                                System.out.println("Anno di nascita: " + stampa.getAnnoNascita());
                                System.out.println("Materie Insegnate: " + stampa.getMaterieInsegnate());

                                System.out.println(" ------------ ");

                            }

                            break;

                        case 3:

                            for (StudenteBes stampa : studenteBESArrayList) {

                                System.out.print("" + (studenteBESArrayList.indexOf(stampa) + 1) + ". ");

                                System.out.println("Nome: " + stampa.getNome());
                                System.out.println("Cognome: " + stampa.getCognome());
                                System.out.println("Anno di nascita: " + stampa.getAnnoNascita());
                                System.out.println("Sezione: " + stampa.getSezione());
                                System.out.println("Classe: " + stampa.getClasse());
                                numeroProgressivo++; // Incrementa il numero progressivo per ogni nuovo studente
                                matricol = generareMatricola(annodiNascit, numeroProgressivo, sezion);
                                studenteArrayList.add(new Studente(nom, cognom, annodiNascit, clas, sezion));
                                System.out.println("Matricola: " + generareMatricola(annodiNascit, numeroProgressivo, sezion));
                                System.out.println(stampa.sostInterfStudente);

                                System.out.println(" *********** ");

                            }

                            break;

                        case 4:

                            for (DocenteBes stampa : docenteBESArrayList) {

                                System.out.print("" + (docenteBESArrayList.indexOf(stampa) + 1) + ". ");

                                System.out.println("Nome: " + stampa.getNome());
                                System.out.println("Cognome: " + stampa.getCognome());
                                System.out.println("Anno di nascita: " + stampa.getAnnoNascita());
                                System.out.println("Materie Insegnate: " + stampa.getMaterieInsegnate());
                                System.out.println(stampa.sostInterfDocente);
                                // System.out.println("Al docente è stato assegnato lo studente: " +
                                // stampa.getStudenteBES().getNome() + " " +
                                // stampa.getStudenteBES().getCognome());

                                System.out.println(" ************ ");

                            }

                            break;

                        default:
                            System.out.println("Numero inserito errato, inserisci il numero corretto");
                            sceltaStampa = interi.nextInt();
                            break;

                    }
                    break;

                case 3:

                    System.out.println("sto uscendo...");
                    stringhe.close();
                    interi.close();

                    condizione = false;
                    System.exit(0);
                    break;

                default:
                    System.out.println("Numero inserito errato, inserisci il numero corretto");
                    scelta = interi.nextInt();
                    break;

            }
        }

    }

    /* public void assegnaDocenteBes() {
        double random = 0;
        int valore = 0;
        int contatore = 0;

        for (DocenteBes d : docenteBESArrayList) {
            System.out.println("Docente Bes: " + d.getNome());
            random = (Math.random() * 4);

            for (int i = valore; i < studenteBESArrayList.size(); i++) {
                System.out.println("Studente Bes assegnato: " + studenteBESArrayList.get(i).getNome());
                contatore++;
                if (contatore == random) {
                    contatore = 0;
                    valore = i;
                    break;
                }

            }

        }

    } */
}
