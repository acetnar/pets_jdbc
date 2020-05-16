import Model.Pet;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        PetDao dao = new PetDao();
        Pet pet = Pet.builder()
                .name("Fafik")
                .age(2)
                .ownerName("Karyna")
                .weight(2.2)
                .pureRace(true)
                .build();
// C- Create
        dao.addToDatabase(pet);
// R- Read
        List<Pet> petList = dao.getAllPets();
        petList.forEach(System.out::println);

// U- Update
Pet petToUpdate = Pet.builder()
        .name("Danone")
        .age(2)
        .ownerName("Karyna")
        .weight(2.0)
        .pureRace(true)
        .id(1L)
        .build();

// D- Delete
        dao.deletePet(1L);

    }
}
