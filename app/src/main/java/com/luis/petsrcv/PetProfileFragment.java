package com.luis.petsrcv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PetProfileFragment extends Fragment {
    private final PetDataset dataset = PetDataset.getInstance();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public PetProfileFragment() {
    }

    public static PetProfileFragment newInstance(String param1, String param2) {
        PetProfileFragment fragment = new PetProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pet_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        List<PetModel> list = dataset.profilePet();
        PetModel firstItem = list.get(0);
        ImageView profileImage = view.findViewById(R.id.ivProfilePhoto);
        TextView profileName = view.findViewById(R.id.tvPetName);
        profileName.setText(firstItem.getName());
        profileImage.setImageResource(firstItem.getImageResId());
        RecyclerView rcvPetProfile = view.findViewById(R.id.rcvPetProfile);
        PetProfileAdapter profileAdapter = new PetProfileAdapter();
        profileAdapter.setList(dataset.profilePet());
        rcvPetProfile.setAdapter(profileAdapter);
    }

}