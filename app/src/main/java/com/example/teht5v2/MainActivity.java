package com.example.teht5v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements ekaFragment.kakkaFragment{

    ekaFragment instanssi1;
    ekaFragment instanssi2;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.frame1, ekaFragment.newInstance()).commit();


        this.manager = getSupportFragmentManager();

        instanssi1 = (ekaFragment) this.manager.findFragmentById(R.id.id_eka);
        instanssi2 = (ekaFragment) this.manager.findFragmentById(R.id.id_toka);
    }







    @Override
    public void ButtonPressed(String s, int id) {
        if(id == instanssi1.getId()){
            instanssi2.asetateksti(s,id);
            instanssi1.asetateksti("", id);
        }else
            {
                instanssi1.asetateksti(s, id);
                instanssi2.asetateksti("", id);
            }

    }
}
