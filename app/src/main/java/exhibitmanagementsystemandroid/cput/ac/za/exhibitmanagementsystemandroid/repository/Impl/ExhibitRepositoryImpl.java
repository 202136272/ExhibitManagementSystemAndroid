package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.repository.Impl;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.Set;

import javax.persistence.Column;

import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.conf.databases.DBConstants;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain.Exhibit;

/**
 * Created by Bonga on 4/23/2016.
 */
public class ExhibitRepositoryImpl extends SQLiteOpenHelper implements ExhibitRepository {

    public static final String TABLE_NAME = "EXHIBIT";
    private SQLiteDatabase db;

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_CASNUMBER = "casNumber";
    public static final String COLUMN_STATION = " station";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_SCENETYPE = "sceneType";


    public ExhibitRepositoryImpl(Context context) {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }
    // Database creation sql statement
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_CASNUMBER + " TEXT  NOT NULL , "
            + COLUMN_STATION + " TEXT NOT NULL , "
            + COLUMN_DESCRIPTION + " TEXT NOT NULL,"
            + COLUMN_SCENETYPE + "TEXT NOT NULL)";


    public void open() throws SQLException {
        db = this.getWritableDatabase();
    }

    public void close() {
        this.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(this.getClass().getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }


    @Override
    public Exhibit findById(Long aLong) {
        return null;
    }

    @Override
    public Exhibit save(Exhibit entity) {
        return null;
    }

    @Override
    public Exhibit update(Exhibit entity) {
        return null;
    }

    @Override
    public Exhibit delete(Exhibit entity) {
        return null;
    }

    @Override
    public Set<Exhibit> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }


}
