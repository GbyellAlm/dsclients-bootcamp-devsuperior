package com.gbyellalm.dsclients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gbyellalm.dsclients.entitiy.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
