package com.fatihsvk.youcontribute.controllers.requests;

import lombok.Data;

@Data
public class CreateRepositoryRequest {
    private String organization;
    private String repository;
}
