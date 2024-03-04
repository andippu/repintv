package com.repinvt.repinvt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repinvt.repinvt.models.MasterBatch;
import com.repinvt.repinvt.repository.IMasterBatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServiceMasterBatch {
	
	@Autowired
	IMasterBatch RepoSMB;
	
	public List<MasterBatch> getMasterBatch(){
		return RepoSMB.findAll();
    }
	
	public List<MasterBatch> getMasterBatchByDate(String dt){
        return RepoSMB.getMasterBatchByDate(dt);
    }
}
