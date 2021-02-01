package com.loteria.apirest.repository;

import com.loteria.apirest.models.loteria;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoteriaRepository  extends JpaRepository<loteria, Long> {
    //jparepository possui vários metodos prontos para fazer persistência no banco de dados como:
    //save, delete, findAll, findById entre outros

    //metodo que procura um único dado atraves do id
    loteria findById(long id);

    @Query("SELECT FROM loteria WHERE email = email" )
    List<loteria> buscarPorEmail(@Param("email") String email);

   // List<User> findByEmailAddressAndLastname(String emailAddress, String lastname


}


