package com.example.teht5v2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ekaFragment extends Fragment {
    private kakkaFragment mListener;

    public interface kakkaFragment {
        // TODO: Update argument type and name
        void ButtonPressed(String s, int id);
    }

    public void asetateksti(String txt, int id)
    {
        textviewi.setText(txt);
        editteksi.setText("");

    }





    public ekaFragment() {
        // Required empty public constructor
    }


    public static ekaFragment newInstance() {
        ekaFragment fragment = new ekaFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    Button buttoni;
    TextView textviewi;
    EditText editteksi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_eka, container, false);
        buttoni = v.findViewById(R.id.button1);
        textviewi = v.findViewById(R.id.textview);
        editteksi = v.findViewById(R.id.edittext);
        buttoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.ButtonPressed(editteksi.getText().toString(),getId());

            }
        });
        return v;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof kakkaFragment) {
            mListener = (kakkaFragment) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



}
