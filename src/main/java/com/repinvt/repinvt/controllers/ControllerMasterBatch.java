package com.repinvt.repinvt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repinvt.repinvt.models.MasterBatch;
import com.repinvt.repinvt.services.ServiceMasterBatch;


@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerMasterBatch {
	
	@Autowired
	ServiceMasterBatch ServSMB;
	
	@GetMapping("/masbat/getmasbat")
	public List<MasterBatch> getMasterBatch(){
		System.out.println("testaaa");
        return ServSMB.getMasterBatch();
    }

}
