package com.jpdacruz.silos.interfaces;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


// SE CREA LA INTERFACE DAO, QUE VA A TENER LOS METODOS (QUERY) DE CONSULTA
import com.jpdacruz.silos.entidades.Operador_Entidad;

@Dao
public interface Operador_Dao {

    @Insert
    void insert(Operador_Entidad operador);

    @Update
    void update(Operador_Entidad operador);

    @Query("DELETE FROM operadores")
    void deleteAll();

    @Query("SELECT * FROM operadores")
    void getAll();

}
