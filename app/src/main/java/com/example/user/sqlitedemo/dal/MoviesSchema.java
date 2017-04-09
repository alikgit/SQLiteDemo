package com.example.user.sqlitedemo.dal;

import android.provider.BaseColumns;

/**
 * Created by User on 08-Apr-17.
 */

public class MoviesSchema {

    private MoviesSchema(){

    }

    public static abstract class MoviesTable{
        public static final String DB_NAME = "Movies";

        public static final String SQL_CREATE =
                "CREATE TABLE IF NOT EXISTS " + DB_NAME +
                "(" + Columns._ID + " INTEGER PRIMARY KEY," +
                        Columns.DB_NAME + " TEXT NOT NULL," +
                        Columns.DESCRIPTION + " TEXT NULL" +
//                        Columns.LATITUDE + " TEXT NULL" +
//                        Columns.LONGITUDE + "TEXT NULL" +
//                        Columns.PICID + "TEXT NULL" +
                        ")";

            public static abstract class Columns implements BaseColumns{
//               public static final int _ID = 0;
            public static final String DB_NAME = "name";
            public static final String DESCRIPTION = "Description";
//            public static final String LATITUDE = "Latitude";
//            public static final String LONGITUDE = "Longitude";
//            public static final String PICID = "PicId";

        }
    }

}
