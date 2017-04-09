package com.example.user.sqlitedemo.dal;

import android.provider.BaseColumns;

/**
 * Created by User on 08-Apr-17.
 */

public class MoviesSchema {

    private MoviesSchema(){

    }


    public static abstract class MoviesTable{
        public static final String NAME = "Movies";

        public static final String SQL_CREATE =
                "CREATE TABLE IF NOT EXISTS " + NAME +
                "(" + Columns._ID + " INTEGER PRIMARY KEY," +
                        Columns.NAME + " TEXT NOT NULL," +
                        Columns.DESCRIPTION + " TEXT NULL" +
                        ")";

            public static abstract class Columns implements BaseColumns{
            public static final String NAME = "name";
            public static final String DESCRIPTION = "Description";

        }
    }

}
