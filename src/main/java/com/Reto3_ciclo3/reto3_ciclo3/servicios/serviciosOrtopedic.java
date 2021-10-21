
package com.Reto3_ciclo3.reto3_ciclo3.servicios;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Ortopedic;
import com.Reto3_ciclo3.reto3_ciclo3.repository.RepositoryOrtopedic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fernanda espinosa
 */

@Service
public class serviciosOrtopedic {
    
    @Autowired
    RepositoryOrtopedic metodosCrud ;
    
    public List <Ortopedic> getAll( ){
        return metodosCrud.getAll();
    }
    
    public Optional <Ortopedic > getOrtopedic(int ortopedicId){
       return metodosCrud. getOrtopedic ( ortopedicId );
    }
    
    public Ortopedic save (Ortopedic  ortopedic ){
        
      if( ortopedic.getId()== null)
      { 
        return metodosCrud.save(ortopedic);
      }
      else {
            Optional<Ortopedic> evt=metodosCrud.getOrtopedic(ortopedic.getId());
            if( evt.isEmpty())
            {
              return metodosCrud.save(ortopedic);
            }
           else
            {
            return ortopedic;
            }
        }
    }       
}
