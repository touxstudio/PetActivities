package org.coursera.mypentagram;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import static org.coursera.mypentagram.R.id.fab;
import static org.coursera.mypentagram.R.id.rvPets;

public class Favorites extends AppCompatActivity {

    ArrayList<Pets> pets;
    private RecyclerView petList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        petList = (RecyclerView) findViewById(rvPets);
        //Recycler View como LinerLayout
        LinearLayoutManager llm = new LinearLayoutManager(this);
        //GridLayoutManager llm = new GridLayoutManager(this, 2);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        petList.setLayoutManager(llm);

        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logoo);


        arrayInit();
        adapterInit();
    }


    public void adapterInit(){
        PetAdapter adapter = new PetAdapter(pets, this);
        petList.setAdapter(adapter);
    }


    public void arrayInit(){

        pets = new ArrayList<Pets>();

        pets.add(new Pets("Tuka", R.drawable.image5, 9));
        pets.add(new Pets("Bilma", R.drawable.image4, 7));
        pets.add(new Pets("Urkia", R.drawable.image3, 5 ));
        pets.add(new Pets("Yako", R.drawable.image2, 4));
        pets.add(new Pets("Flow", R.drawable.image1, 3 ));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_user) {
            Toast.makeText(Favorites.this, "1", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.action_favorites){
            Toast.makeText(Favorites.this, "2", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.action_settings){
            Toast.makeText(Favorites.this, "3", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }



}
