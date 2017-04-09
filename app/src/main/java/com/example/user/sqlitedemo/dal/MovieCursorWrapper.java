package com.example.user.sqlitedemo.dal;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.user.sqlitedemo.models.Movie;
import com.example.user.sqlitedemo.dal.MoviesSchema.MoviesTable.Columns;


/**
 * Created by User on 08-Apr-17.
 */

public class MovieCursorWrapper extends CursorWrapper{
    public MovieCursorWrapper(Cursor cursor){
        super(cursor);
    }

    public Movie getMovie(){

        int id = getInt(getColumnIndex(Columns._ID));
        String name = getString(getColumnIndex(MoviesSchema.MoviesTable.Columns.NAME));
        String description = getString(getColumnIndex(Columns.DESCRIPTION));
        return new Movie (id, name,description);

    }
}
