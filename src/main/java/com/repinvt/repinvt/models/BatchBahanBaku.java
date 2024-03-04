package com.repinvt.repinvt.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BATCH_BAHAN_BAKU")
@IdClass(BatchBahanBakuCompKey.class)
public class BatchBahanBaku {
	
	@Id
    @Column(name="BBB_MBT_NO_BATCH",length=12, nullable = false)
    private String bbbMbtNoBatch;
	
	@Id
    @Column(name="BBB_MBT_TGL_BATCH")
	private Date bbbMbtTglBatch;
	
	@Id
    @Column(name="BBB_BB_CODE",length=12)
    private String bbbBbCode;
    
	@Column(name="BBB_NO")
	private Integer bbbBbNo;
	
	@Column(name="BBB_UNIT")
	private Integer bbbUnit;
	
	@Column(name="BBB_SAT_CODE",length=4)
    private String bbbSatCode;
	
	@Column(name="BBB_HARGA_SAT")
	private Integer bbbHargaSat;
	
	@Column(name="BBB_TOTAL")
	private Integer bbbTotal;
	
	@Column(name="BBB_CHGUSER",length=40)
    private String bbbChguser;
	
	@Column (name="BBB_CHGDATE")
    private Date bbbChgdate;
}
