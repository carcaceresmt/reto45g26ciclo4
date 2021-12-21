package com.reto45.sa.g26.mercader.reto.repository;


import com.reto45.sa.g26.mercader.reto.model.Gadget;
import com.reto45.sa.g26.mercader.reto.repository.crud.GadgetCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author desaextremo
 */
@Repository
public class GadgetRepository {
    @Autowired
    private GadgetCrudRepository gatgetCrudRepository;

    public List< Gadget> getAll() {
        return gatgetCrudRepository.findAll();
    }

    public Optional<Gadget> getGadget(int productId) {
        return gatgetCrudRepository.findById(productId);
    }
    
    public Gadget create(Gadget gadget) {
        return gatgetCrudRepository.save(gadget);
    }

    public void update(Gadget product) {
        gatgetCrudRepository.save(product);
    }
    
    public void delete(Gadget product) {
        gatgetCrudRepository.delete(product);
    }  
    
    public List<Gadget> gadgetsByPrice(double precio){
        return gatgetCrudRepository.findByPriceLessThanEqual(precio);
    }
    
    public List<Gadget> gadgetsByCategory(String categoria){
        return gatgetCrudRepository.findByCategory(categoria);
    }
    
    public List<Gadget> gadgetsByName(String nombre){
        return gatgetCrudRepository.findByNameLike(nombre);
    }
    
    public List<Gadget> findByDescriptionLike(String description){
        return gatgetCrudRepository.findByDescriptionLike(description);
    }
}
