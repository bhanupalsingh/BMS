package com.bms.model;

import java.util.concurrent.atomic.AtomicInteger;

import com.bms.constants.SeatStatus;

public class Seat {
	private int id;
	private int rowNo;
	private int colNo;
	private SeatStatus seatStatus;
	
	private static AtomicInteger ao = new AtomicInteger(0);

	public Seat(int rowNo, int colNo, SeatStatus seatStatus) {
		this.setId();
		this.rowNo = rowNo;
		this.colNo = colNo;
		this.seatStatus = seatStatus;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = ao.incrementAndGet();
	}
	public int getRowNo() {
		return rowNo;
	}
	public void setRowNo(int rowNo) {
		this.rowNo = rowNo;
	}
	public int getColNo() {
		return colNo;
	}
	public void setColNo(int colNo) {
		this.colNo = colNo;
	}
	public SeatStatus getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(SeatStatus seatStatus) {
		this.seatStatus = seatStatus;
	}
	
	
	

}
