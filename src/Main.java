import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture( 130445, "Toyota", 100000);
        Voiture voiture2 = new Voiture(120445, "Cherry", 45000);
        Voiture voiture3 = new Voiture(160885, "Ford", 55000);

        // Création  clients
        Client client1 = new Client(1, "Wassef", "Chargui");
        Client client2 = new Client(2, "Yassine", "Mnejja");
        Client client3 = new Client(3,"Khalil","Chiha");

        TreeMap<Client, String> clientsMap = new TreeMap<>();
        clientsMap.put(client1, "Location active");
        clientsMap.put(client2, "Location active");
        clientsMap.put(client3, "Location active");

// Les clients seront triés en fonction de leur code client.
        for (Client client : clientsMap.keySet()) {
            System.out.println(client);


            // Création de l'agence
            Agence agence = new Agence("AgenceLocationdeVoitures");

            try {
                // Ajout de voitures à l'agence
                agence.ajoutVoiture(voiture1);
                agence.ajoutVoiture(voiture2);
                agence.ajoutVoiture(voiture3);

                // Location de voitures par des clients
                agence.loueClientVoiture(client1, voiture1);
                agence.loueClientVoiture(client3, voiture2);
                agence.loueClientVoiture(client2, voiture3);

                // Affichage des clients et des voitures louées
                agence.afficheLesClientsEtLeursListesVoitures();

                // Tri des clients par code croissant
                Map<Client, ListVoitures> clientsTriesParCode = agence.triCodeCroissant();
                System.out.println("Clients triés par code croissant:");
                for (Client clientt : clientsTriesParCode.keySet()) {
                    System.out.println(client);
                }

                // Tri des clients par nom croissant
                Map<Client, ListVoitures> clientsTriesParNom = agence.triNomCroissant();
                System.out.println("Clients triés par nom croissant:");
                for (Client clients : clientsTriesParNom.keySet()) {
                    System.out.println(client);
                }
            } catch (VoitureException e) {
                System.err.println("Erreur : " + e.getMessage());
            }
        }
    }
}