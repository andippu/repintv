package com.repinvt.repinvt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.repinvt.repinvt.models.MasterBatch;
import com.repinvt.repinvt.models.MasterBatchCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IMasterBatch extends JpaRepository<MasterBatch,MasterBatchCompKey> {
	
	@Query(value = "SELECT * FROM MASTER_BATCH S WHERE TO_CHAR(S.MBT_TGL_BATCH,'Mon dd yyyy')=?1",nativeQuery = true)
	public List<MasterBatch> getMasterBatchByDate(String dt);

}
