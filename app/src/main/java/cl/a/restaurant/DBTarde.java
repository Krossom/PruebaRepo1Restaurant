package cl.a.restaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBTarde extends SQLiteOpenHelper {

    private static final String NOMBRE_DB = "cursotarde";
    private static final int VERSION_DB = 1;
    private static final String TABLA_MENU ="CREATE TABLE MENU(ID TEXT PRIMARY KEY,NOMBRE TEXT,DESCRIPCION TEXT, PRECIO TEXT)";
    public DBTarde(Context context) {
        super(context, NOMBRE_DB, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL(TABLA_MENU);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLA_MENU);
        db.execSQL(TABLA_MENU);
    }

    public void agregarMenu(String id, String nombre, String descripcion, String precio){
        SQLiteDatabase db = getWritableDatabase();
        if (db != null){
            db.execSQL("INSERT INTO MENU VALUES('"+id+"','"+nombre+"','"+descripcion+"','"+precio+"')");
            db.close();
        }
    }
}
