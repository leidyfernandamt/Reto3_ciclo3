package com.Reto3_ciclo3.reto3_ciclo3.servicios;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Reservation;
import com.Reto3_ciclo3.reto3_ciclo3.repository.RepositoryReservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosReservation {
    
    @Autowired
    RepositoryReservation metodosCrud ;
    
    public List <Reservation> getAll( ){
        return metodosCrud.getAll();
    }
    
    public Optional <Reservation > getReservation(int reservationId){
       return metodosCrud. getReservation (reservationId);
    }
    
    public Reservation save (Reservation  reservations ){
        
      if( reservations.getIdReservation ()== null)
      { 
          return metodosCrud.save(reservations);
      }
      else {
            Optional<Reservation> evt=metodosCrud.getReservation(reservations.getIdReservation());
            if( evt.isEmpty())
            {
              return metodosCrud.save(reservations );
            }
             else
            {
            return reservations;
            }
      
      
         }
    

     }
 }