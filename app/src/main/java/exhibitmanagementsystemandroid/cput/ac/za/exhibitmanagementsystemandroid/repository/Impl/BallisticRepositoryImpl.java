package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.repository.Impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.lang.reflect.Type;
import java.util.Set;

import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.conf.databases.DBConstants;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain.Ballistic;

/**
 * Created by Bonga on 4/23/2016.
 */
public class BallisticRepositoryImpl extends SQLiteOpenHelper implements BallisticRepository {

    public static final String TABLE_NAME = "BALLISTIC";
    private SQLiteDatabase db;

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_REFERENCE = "reference";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_TYPE = "type";

    public BallisticRepositoryImpl(Context context) {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }
    // Database creation sql statement
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_REFERENCE + " TEXT  NOT NULL , "
            + COLUMN_NAME + " TEXT NOT NULL , "
            + COLUMN_TYPE + " TEXT NOT NULL);";

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
    public Ballistic findById(Long aLong) {
        return null;
    }

    @Override
    public Ballistic save(Ballistic entity) {
        open();
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, entity.getId());
        values.put(COLUMN_REFERENCE, entity.getReference());
        values.put(COLUMN_NAME, entity.getName());
        values.put(COLUMN_TYPE, entity.getType());

        long id = db.insertOrThrow(TABLE_NAME, null, values);

        Ballistic insertedEntity = new Ballistic.Builder()
                .copy(entity)
                .id(new Long(id))
                .build();

        return insertedEntity;
    }

    @Override
    public Ballistic update(Ballistic entity) {
        return null;
    }

    @Override
    public Ballistic delete(Ballistic entity) {
        return null;
    }

    @Override
    public Set<Ballistic> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
