package com.example.ciclocomputadorgps.controlador;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ciclocomputadorgps.Actividad;
import com.example.ciclocomputadorgps.R;
import com.example.ciclocomputadorgps.aplicacion;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Historial#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Historial extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Historial() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Historial.
     */
    // TODO: Rename and change types and number of parameters
    public static Historial newInstance(String param1, String param2) {
        Historial fragment = new Historial();
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
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_historial, container, false);


        return view;
    }

    public void irActividad(View view){
        Intent intent = new Intent(getActivity(), Actividad.class);
        getActivity().startActivity(intent);
    }

}