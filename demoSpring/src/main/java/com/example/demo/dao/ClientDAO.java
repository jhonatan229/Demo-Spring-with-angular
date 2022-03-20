package com.example.demo.dao;

import com.example.demo.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("mongodbDAO")
public interface ClientDAO extends MongoRepository<Client, String> {
}
