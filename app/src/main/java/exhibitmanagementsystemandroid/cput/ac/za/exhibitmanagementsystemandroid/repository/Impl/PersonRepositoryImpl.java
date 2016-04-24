package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.repository.Impl;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.Set;

import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.conf.databases.DBConstants;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain.Person;

/**
 * Created by Bonga on 4/23/2016.
 */
public class PersonRepositoryImpl extends SQLiteOpenHelper implements PersonRepository {

    public static final String TABLE_NAME = "PERSON";
    private SQLiteDatabase db;

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_PERSALNUMBER = "persalNumber";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_SURNAME = " surname";

    public PersonRepositoryImpl(Context context) {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }
    // Database creation sql statement
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_PERSALNUMBER + " TEXT  NOT NULL , "
            + COLUMN_NAME + " TEXT NOT NULL , "
            + COLUMN_SURNAME + " TEXT NOT NULL)";

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
    public Person findById(Long id) {
        return null;
    }

    @Override
    public Person save(Person entity) {
        return null;
    }

    @Override
    public Person update(Person entity) {
        return null;
    }

    @Override
    public Person delete(Person entity) {
        return null;
    }

    @Override
    public Set<Person> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
