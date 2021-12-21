package com.reto45.sa.g26.mercader.reto.repository.crud;


import com.reto45.sa.g26.mercader.reto.model.User;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author desaextremo
 */
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    List<User> findBybirthtDay(Date date);
    Optional <User> findByEmailAndPassword(String email,String password);
    
    //Reto 5
    List<User> findByMonthBirthtDay(String monthBirthtDay);
}
