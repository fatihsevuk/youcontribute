package com.fatihsvk.youcontribute.controllers;


import com.fatihsvk.youcontribute.controllers.request.CreateRepositoryRequest;
import com.fatihsvk.youcontribute.service.RepositoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController("/repositories")
public class RepositoryController {

    private final RepositoryService repositoryService;

    public RepositoryController(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody CreateRepositoryRequest request) {
        this.repositoryService.create(request.getUrl());
    }
}
