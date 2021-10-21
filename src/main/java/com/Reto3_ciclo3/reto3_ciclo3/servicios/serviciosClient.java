
package com.Reto3_ciclo3.reto3_ciclo3.servicios;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Client;
import com.Reto3_ciclo3.reto3_ciclo3.repository.RepositoryClient;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosClient {
    
    @Autowired
    RepositoryClient metodosCrud ;
    
     public List <Client > getAll( ){
        return metodosCrud.getAll();
    }
    
    public Optional <Client > getClient(int clientId ){
       return metodosCrud.  getClient  (clientId );
    }
    
    public Client  save (Client client ){
        
      if( client.getIdClient()== null)
      { 
          return metodosCrud.save(client);
      }
      else {
            Optional<Client> evt=metodosCrud.getClient(client.getIdClient());
            if( evt.isEmpty())
            {
              return metodosCrud.save(client);
            }
            else
            {
            return client ;
            }
      
      
         }
    
     }
    
 }
