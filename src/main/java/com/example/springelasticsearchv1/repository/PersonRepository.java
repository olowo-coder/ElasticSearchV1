package com.example.springelasticsearchv1.repository;

import com.example.springelasticsearchv1.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


public interface PersonRepository extends ElasticsearchRepository<Person, String> {

}
