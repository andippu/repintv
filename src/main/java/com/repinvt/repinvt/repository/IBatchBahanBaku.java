package com.repinvt.repinvt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.repinvt.repinvt.models.BatchBahanBaku;
import com.repinvt.repinvt.models.BatchBahanBakuCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBatchBahanBaku extends JpaRepository <BatchBahanBaku,BatchBahanBakuCompKey> {

}
