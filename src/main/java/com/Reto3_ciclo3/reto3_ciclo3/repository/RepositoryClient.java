
package com.Reto3_ciclo3.reto3_ciclo3.repository;

import com.Reto3_ciclo3.reto3_ciclo3.Entidad.Client;
import com.Reto3_ciclo3.reto3_ciclo3.interfaz.InterfaceClient;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryClient {
    
    @Autowired 
    private InterfaceClient crudClient;
    
    public List <Client> getAll(){
        return (List<Client>) crudClient.findAll();
    }
    
    public Optional <Client> getClient(int id){
       return crudClient.findById(id);
    }
    public Client save ( Client client){
        return crudClient.save(client);
    }
}
