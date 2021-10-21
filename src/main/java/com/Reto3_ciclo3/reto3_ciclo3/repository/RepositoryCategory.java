
package com.Reto3_ciclo3.reto3_ciclo3.repository;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.Reto3_ciclo3.reto3_ciclo3.interfaz.InterfaceCategory;
import org.springframework.stereotype.Repository;



@Repository
public class RepositoryCategory {
    
     @Autowired 
    private InterfaceCategory crud ;
    
    public List <Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    
    public Optional <Category> getCategory(int id){
       return crud.findById(id);
    }
    public Category save (Category category){
        return crud.save(category);
    }
    
}
    
 
