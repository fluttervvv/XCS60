package com.hook.xcs60.dto.ArrestProductDetail;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestProductDetailgetByConRequest {
	
	@JsonProperty("ProductDetailID")
	Long productDetailId;

	public Long getProductDetailId() {
		return productDetailId;
	}

	public void setProductDetailId(Long productDetailId) {
		this.productDetailId = productDetailId;
	}
}
