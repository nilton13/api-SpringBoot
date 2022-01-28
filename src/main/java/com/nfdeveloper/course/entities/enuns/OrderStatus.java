package com.nfdeveloper.course.entities.enuns;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	DELIVERED(2),
	PAID(3),
	SHIPPED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order status Code");
	}
}
