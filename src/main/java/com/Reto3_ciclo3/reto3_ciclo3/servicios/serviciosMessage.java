
package com.Reto3_ciclo3.reto3_ciclo3.servicios;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Message;
import com.Reto3_ciclo3.reto3_ciclo3.repository.RepositoryMessage;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosMessage {
    
    @Autowired
    RepositoryMessage metodosCrud ;
    
    public List <Message> getAll( ){
        return metodosCrud.getAll();
    }
    
    public Optional <Message > getMessage (int messageId){
       return metodosCrud. getMessage (messageId);
    }
    
    public Message  save (Message  messages ){
        
      if( messages.getIdMessage ()== null)
        { 
          return metodosCrud.save(messages);
        }
      else {
            Optional<Message> evt=metodosCrud.getMessage(messages.getIdMessage());
            if( evt.isEmpty())
            {
              return metodosCrud.save(messages );
            }
            else
            {
            return messages;
            }
      
      
         }
    
     }
}
