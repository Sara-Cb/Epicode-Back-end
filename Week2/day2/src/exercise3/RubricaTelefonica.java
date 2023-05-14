package exercise3;
import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String telefono) {
        this.rubrica.put(nome, telefono);
    }

    public void eliminaContatto(String nome) {
        this.rubrica.remove(nome);
    }

    public String ricercaPersona(String telefono) {
        for (Map.Entry<String, String> entry : this.rubrica.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String ricercaNumero(String nome) {
        return this.rubrica.get(nome);
    }

//    public void stampaContatti() {
//        for (Map.Entry<String, String> entry : this.rubrica.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }

    public void stampaContatti() {
    	
      for (Map.Entry<String, String> entry : this.rubrica.entrySet()) {
          System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
