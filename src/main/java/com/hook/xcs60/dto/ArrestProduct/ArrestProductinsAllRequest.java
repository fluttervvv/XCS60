package com.hook.xcs60.dto.ArrestProduct;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestProductinsAllRequest {
	
	@JsonProperty("ProductID")
	Long productId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
}
