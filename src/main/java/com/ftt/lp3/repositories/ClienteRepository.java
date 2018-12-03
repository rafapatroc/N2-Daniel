package com.ftt.lp3.repositories;
//f0858ba0-6457-4586-b15d-4a9c34d5a1ef
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ftt.lp3.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
