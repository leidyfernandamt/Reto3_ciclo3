
package com.Reto3_ciclo3.reto3_ciclo3.repository;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Reservation;
import com.Reto3_ciclo3.reto3_ciclo3.interfaz.InterfaceReservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositoryReservation {
      @Autowired 
    private InterfaceReservation crudReservation;
    
     public List <Reservation> getAll(){
        return (List<Reservation>) crudReservation.findAll();
    }
    
    public Optional <Reservation> getReservation(int id){
       return crudReservation.findById(id);
    }
    public Reservation save (Reservation reservation){
        return crudReservation.save(reservation);
    }
    
}
