package com.example.user.sqlitedemo.dal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.user.sqlitedemo.models.Movie;

import java.util.ArrayList;
import java.util.List;
import com.example.user.sqlitedemo.dal.MoviesSchema.MoviesTable;

/**
 * Created by User on 08-Apr-17.
 */

public class MoviesStore {

//    private List<Movie> movies;
    private SQLiteDatabase database;

    public MoviesStore (SQLiteDatabase sqLiteDatabase){
        this.database = sqLiteDatabase;
    }

    public MoviesStore() {
//        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
//        movies.add(movie);
        database.insert(MoviesTable.NAME,null,getContentValuesFromMovie(movie));
    }

    public void updateMovie(Movie movie){

    }

    public List<Movie> getMovies(){
       Cursor cursor = database.query(MoviesTable.NAME,null,null,null,null,null,null);
        MovieCursorWrapper movieCursor = new MovieCursorWrapper(cursor);

        List<Movie> movies = new ArrayList<>();

        if (!movieCursor.isAfterLast())

           try {


            movieCursor.moveToFirst();
        while (!movieCursor.isAfterLast()) {
            Movie movie = movieCursor.getMovie();
            movies.add(movie);
            movieCursor.moveToNext();
        } }
               finally {
                   movieCursor.close();
               }

        return movies;
    }
    private ContentValues getContentValuesFromMovie (Movie movie){
        ContentValues contentValues = new ContentValues();
        contentValues.put(MoviesTable.Columns.NAME, movie.getName());
        contentValues.put(MoviesTable.Columns.DESCRIPTION,movie.getDescription());

        return  contentValues;
    }
}
