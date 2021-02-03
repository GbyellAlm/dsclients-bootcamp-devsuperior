package com.gbyellalm.dsclients.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gbyellalm.dsclients.dto.ClientDTO;
import com.gbyellalm.dsclients.entitiy.Client;
import com.gbyellalm.dsclients.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)  
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest);
		return list.map(listElement -> new ClientDTO(listElement)); 
	}
}