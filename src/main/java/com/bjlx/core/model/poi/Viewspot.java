package com.bjlx.core.model.poi;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Viewspot {
	
	/**
	 * 主键
	 */
	@NotBlank
	@Id
	private ObjectId id;

}
