package com.jpdacruz.silos.database_room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.jpdacruz.silos.entidades.Operador_Entidad;
import com.jpdacruz.silos.interfaces.Operador_Dao;

// CLASE ABSTRACTA-EN SU CREACION SE PONE QUE SU SUPERCLASE ES ROOMDATABASE

@Database(entities = {Operador_Entidad.class},version = 1)
public abstract class Data_Base_Room extends RoomDatabase {

    public abstract Operador_Dao operador_dao();

    private static volatile Data_Base_Room INSTANCE;

    public static Data_Base_Room getDataBase (final Context context) {
        if (INSTANCE == null) {
            synchronized (Data_Base_Room.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            Data_Base_Room.class, "cubicaje_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
