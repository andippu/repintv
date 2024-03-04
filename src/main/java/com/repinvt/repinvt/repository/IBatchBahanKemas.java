package com.repinvt.repinvt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.repinvt.repinvt.models.BatchBahanKemas;
import com.repinvt.repinvt.models.BatchBahanKemasCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBatchBahanKemas extends JpaRepository <BatchBahanKemas,BatchBahanKemasCompKey>{

}
