package com.example.tp4ex1.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.tp4ex1.R;

/**
 * une instance de MenuSeasonFragment contient ici juste un label
 */
public class MenuSeasonFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque MenuSeasonFragment instancié
    private int page;
    private ViewPager viewPager;

    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static MenuSeasonFragment newInstance(int position, ViewPager vp) {
        MenuSeasonFragment fragment = new MenuSeasonFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        fragment.setArguments(args);
        fragment.viewPager = vp;
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        View.OnClickListener listenerP = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        };

        View.OnClickListener listenerE = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        };

        View.OnClickListener listenerA = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        };

        View.OnClickListener listenerH = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        };

        ImageView imgP = (ImageView) view.findViewById(R.id.imageViewP);
        imgP.setImageResource(R.drawable.printemps);
        imgP.setOnClickListener(listenerP);

        ImageView imgE = (ImageView) view.findViewById(R.id.imageViewE);
        imgE.setImageResource(R.drawable.ete);
        imgE.setOnClickListener(listenerE);

        ImageView imgA = (ImageView) view.findViewById(R.id.imageViewA);
        imgA.setImageResource(R.drawable.automne);
        imgA.setOnClickListener(listenerA);

        ImageView imgH = (ImageView) view.findViewById(R.id.imageViewH);
        imgH.setImageResource(R.drawable.hiver);
        imgH.setOnClickListener(listenerH);

        return view;
    }
}