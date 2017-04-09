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
        String name = getString(getColumnIndex(MoviesSchema.MoviesTable.Columns.DB_NAME));
        String description = getString(getColumnIndex(MoviesSchema.MoviesTable.Columns.DESCRIPTION));
//        String latitude = getString(getColumnIndex(MoviesSchema.MoviesTable.Columns.LATITUDE));
//        String longitude = getString(getColumnIndex(Columns.LONGITUDE));
//        String picId = getString(getColumnIndex(Columns.PICID));
        return new Movie (id, name,description);

    }
}
