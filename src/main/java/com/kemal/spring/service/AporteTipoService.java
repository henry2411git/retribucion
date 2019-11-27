package com.kemal.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kemal.spring.domain.AporteTipo;
import com.kemal.spring.domain.AporteTipoRepository;
@Service
public class AporteTipoService {
	@Autowired
	AporteTipoRepository dao;
	
	public void save(AporteTipo aporteTipo) {
		dao.save(aporteTipo);
	}
}
