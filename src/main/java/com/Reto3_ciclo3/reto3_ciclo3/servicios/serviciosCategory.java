
package com.Reto3_ciclo3.reto3_ciclo3.servicios;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Category;
import com.Reto3_ciclo3.reto3_ciclo3.repository.RepositoryCategory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






@Service
public class serviciosCategory {
   
    @Autowired
    RepositoryCategory metodosCrud ;
    
    public List <Category > getAll( ){
        return metodosCrud.getAll();
    }
    
    public Optional <Category > getCategory (int categoryId ){
       return metodosCrud. getCategory (categoryId);
    }
    
    public Category  save (Category  category ){
        
      if( category.getId()== null)
      { 
          return metodosCrud.save(category);
      }
      else {
            Optional<Category> evt=metodosCrud.getCategory(category.getId());
            if( evt.isEmpty())
            {
              return metodosCrud.save(category );
            }
            else
            {
            return category ;
            }
      
      
         }
     
     }
    
 }
