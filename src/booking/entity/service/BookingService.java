/*package booking.entity.service;

import booking.entity.Room;

public class BookingService {

    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r : rooms) {
            if (r.isFree()) {
            }
        }
        if (!isFreeRooms) {
            System.out.println("Free rooms in hotel: " + hotel.getName + "is not available");
        }

        bookRoom(client, numberOfPerson, rooms);
    }

    private void bookRoom(Client client, int numberOfPerson, Room[] rooms){
        for (Room room : rooms){
            if(room.getNumberOfPerson()== numberOfPerson){
                System.out.println("Found room for : " +clientName);
                if (client.getBill().getAmount()>=room.getCost()){
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("Room was successfully reserved by :" + client.getName);
                }else{
                    System.out.println("No enough money for reserving a room, client: " +client.getName());
                }
            }else{
                System.out.println("Not found for room for :" +client.getName());
            }
        }
    }


 */