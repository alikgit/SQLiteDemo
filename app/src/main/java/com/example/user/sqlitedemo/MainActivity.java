package com.example.user.sqlitedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.user.sqlitedemo.dal.MoviesDbOpenHelper;
import com.example.user.sqlitedemo.dal.MoviesStore;
import com.example.user.sqlitedemo.models.Movie;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etDescription;
    private MoviesStore moviesStore;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MoviesDbOpenHelper moviesDbOpenHelper = new MoviesDbOpenHelper(this);
        moviesStore = new MoviesStore(moviesDbOpenHelper.getWritableDatabase());

        etName = (EditText)findViewById(R.id.etName);
        etDescription = (EditText)findViewById(R.id.etDescription);
    }
    public void onSave(View view) {
        String name = etName.getText().toString();
        String description = etDescription.getText().toString();

        Movie movie = new Movie(0,name,description);

        moviesStore.addMovie(movie);
    }
    public void showMovies(View view) {
        Log.d("MainActivityMovies", Arrays.toString(moviesStore.getMovies().toArray()));
    }
}

