package com.example.user.sqlitedemo;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.sqlitedemo.dal.MoviesDbOpenHelper;
import com.example.user.sqlitedemo.dal.MoviesStore;
import com.example.user.sqlitedemo.models.Movie;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText etName,etElementId;
    EditText etDescription;
    TextView textViewInfo1,textViewInfoTop,textViewInfoTop2;
    private MoviesStore moviesStore;

    SQLiteDatabase db;

    private int lastElement;
    private int elementId = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MoviesDbOpenHelper moviesDbOpenHelper = new MoviesDbOpenHelper(this);
        moviesStore = new MoviesStore(moviesDbOpenHelper.getWritableDatabase());

        etName = (EditText)findViewById(R.id.etName);
        etElementId = (EditText)findViewById(R.id.etElementId);

        etDescription = (EditText)findViewById(R.id.etDescription);
        textViewInfo1 = (TextView) findViewById(R.id.tvInfo1);
        textViewInfoTop = (TextView) findViewById(R.id.tvInfoTop);
        textViewInfoTop2 = (TextView) findViewById(R.id.tvInfoTop2);

        showDbInformation();
    }
    public void onSave(View view) {
        String name = etName.getText().toString();
        String description = etDescription.getText().toString();

        Movie movie = new Movie(0,name,description);
        moviesStore.addMovie(movie);
        textViewInfoTop.setText(String.valueOf(moviesStore.getMovies().size()));
        textViewInfo1.setText(Arrays.toString(moviesStore.getMovies().toArray()));
    }
    public void showMovies(View view) {
        Log.d("MainActivityMovies", Arrays.toString(moviesStore.getMovies().toArray()));
        showDbInformation();
    }

    public void onDeleteButtonPressed(View view) {
        moviesStore.deleteAllMovie();
        showDbInformation();
    }

    public void addAction1(View view) {

        lastElement = moviesStore.getMovies().size()-1;
        if(lastElement!=-1)
            textViewInfoTop2.setText(moviesStore.getMovies().get(lastElement).toString());
        else textViewInfoTop2.setText("");
    }

    public void addAction2(View view) {

        showDbInformation();
    }

    public void addAction3(View view) {
        int id = Integer.parseInt(etElementId.getText().toString());
        if(id!=0)
        moviesStore.deleteLastMovie(id);
        showDbInformation();
    }
    public void showDbInformation(){
        textViewInfo1.setText(Arrays.toString(moviesStore.getMovies().toArray()));
        textViewInfoTop.setText(String.valueOf(moviesStore.getMovies().size()));
    }
}

