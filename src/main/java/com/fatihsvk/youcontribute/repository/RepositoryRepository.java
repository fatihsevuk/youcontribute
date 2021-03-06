package com.fatihsvk.youcontribute.repository;

import com.fatihsvk.youcontribute.models.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RepositoryRepository extends PagingAndSortingRepository<Repository,Integer> {
    List<Repository> findAll();
}
