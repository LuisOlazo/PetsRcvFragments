package com.luis.petsrcv;

import java.util.ArrayList;
import java.util.List;

public class PetDataset {


    private static PetDataset instance;
    private List<PetModel> favoritePets;
    private List<PetModel> allPets;

    private PetDataset() {
        favoritePets = new ArrayList<>();
        allPets = new ArrayList<>();
        loadPets();
    }

    public static PetDataset getInstance() {
        if (instance == null) instance = new PetDataset();
        return instance;
    }

    private void loadPets() {
        allPets.clear();
        allPets.add(new PetModel(1, R.drawable.pet1, "Max", 3));
        allPets.add(new PetModel(2, R.drawable.pet2, "Luna", 4));
        allPets.add(new PetModel(3, R.drawable.pet3, "Rocky", 5));
        allPets.add(new PetModel(4, R.drawable.pet4, "Coco", 2));
        allPets.add(new PetModel(5, R.drawable.pet5, "Bella", 1));
        allPets.add(new PetModel(6, R.drawable.pet6, "Simba", 3));
        allPets.add(new PetModel(7, R.drawable.pet7, "Nina", 1));
        allPets.add(new PetModel(8, R.drawable.pet8, "Toby", 7));
        allPets.add(new PetModel(9, R.drawable.pet9, "Lola", 2));
        allPets.add(new PetModel(10, R.drawable.pet10, "Zeus", 6));
    }

    public List<PetModel> get() {
        return new ArrayList<>(allPets);
    }

    public List<PetModel> getFavoritePets() {
        return new ArrayList<>(favoritePets);
    }

    public void addToFavorites(PetModel pet) {
        if (!favoritePets.contains(pet)) favoritePets.add(pet);
        else favoritePets.remove(pet);
    }

}
