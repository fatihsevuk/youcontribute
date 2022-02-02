package com.fatihsvk.youcontribute.controllers;


import com.fatihsvk.youcontribute.controllers.requests.CreateRepositoryRequest;
import com.fatihsvk.youcontribute.controllers.resources.RepositoryResource;
import com.fatihsvk.youcontribute.service.RepositoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/repositories")
public class RepositoryController {

    private final RepositoryService repositoryService;

    public RepositoryController(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody CreateRepositoryRequest request) {
        this.repositoryService.create(request.getOrganization(),request.getRepository());
    }

    @GetMapping
    public List<RepositoryResource> list() {
        return RepositoryResource.createFor(this.repositoryService.list());

    }



}
