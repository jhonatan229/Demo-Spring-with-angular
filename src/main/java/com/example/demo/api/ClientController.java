package com.example.demo.api;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/client")
@RestController
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(@Qualifier("mongodb") ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public void addPerson(@NonNull @RequestBody Client client){
        clientService.addPerson(client);
    }
    @GetMapping
    public List<Client>findAllClients(){
        return clientService.findAllClients();
    }
}
