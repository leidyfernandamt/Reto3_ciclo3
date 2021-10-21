
package com.Reto3_ciclo3.reto3_ciclo3.controlador;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Category ;

import com.Reto3_ciclo3.reto3_ciclo3.servicios.serviciosCategory ;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/Category")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CategoryWeb {
    
    @Autowired
    private serviciosCategory servicios;
    
    @GetMapping ("/all")
    private List <Category > getCategory (){
       return servicios.getAll();
    } 
    
    @GetMapping ("/{id}")
   public Optional <Category> getCategory(@PathVariable("id")int categoryId){
        return servicios.getCategory(categoryId);
   }
   
   @PostMapping ("/save")
   @ResponseStatus(HttpStatus.CREATED)
   public Category  save (@RequestBody Category category ){
       return servicios.save(category );
   }
}
