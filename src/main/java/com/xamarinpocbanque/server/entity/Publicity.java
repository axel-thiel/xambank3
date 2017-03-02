package com.xamarinpocbanque.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Publicity {

	@Id
    @SequenceGenerator(name = "xambanque_uid", sequenceName = "xambanque_uid", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "xambanque_uid")
    @Column(name="id")
	private Long id;
	
	
}
