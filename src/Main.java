public class Main {
    public static void main(String[] args) {
        PartyGuestList partyGuestList = new PartyGuestList();

        //Agregamos invitados a la lista
        partyGuestList.addGuest("Edinson");
        partyGuestList.addGuest("Anderson");
        partyGuestList.addGuest("Emilio");

        //Utilizamos los metodos de la clase PartyGuestList para realizar las operaciones sobre el set
        System.out.println("Esta Edinson en la lista de los invitados?: " + partyGuestList.isGuestInList("Edinson"));
        System.out.println("Esta Ana en la lista de los invitados?: " + partyGuestList.isGuestInList("Ana"));

        partyGuestList.removeGuest("Anderson");
        System.out.println("Numero total de invitados: " + partyGuestList.getTotalGuests());
        System.out.println("La lista de invitados esta vacia?: " + partyGuestList.isGuestListEmpty());
    }
}