package com.example.demo.service;

import com.example.demo.dao.ClientDAO;
import com.example.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mongodb")
public class ClientService {

    private final ClientDAO clientDAO;
    @Autowired
    public ClientService(@Qualifier("mongodbDAO") ClientDAO personMongodbDAO) {
        this.clientDAO = personMongodbDAO;
    }
    public void addPerson(Client client) {
        clientDAO.save(client);
    }
    public List<Client> findAllClients(){
        return clientDAO.findAll();
    }
}
