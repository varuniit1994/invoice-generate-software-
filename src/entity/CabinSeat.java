package entity;

import java.math.BigDecimal;

public class CabinSeat {
	private  Integer perMonthPrice;
	private  Integer freeConferenceRoomTime;
	private  Integer cabinSeatGst;
	
	public CabinSeat(Integer perMonthPrice, Integer freeConferenceRoomTime, Integer cabinSeatGst) {
		super();
		this.perMonthPrice = perMonthPrice;
		this.freeConferenceRoomTime = freeConferenceRoomTime;
		this.cabinSeatGst = cabinSeatGst;
	}

	
	public CabinSeat() {
		super();
		this.perMonthPrice = 10000;
		this.freeConferenceRoomTime = 10;
		this.cabinSeatGst = 18;
	}


	@Override
	public String toString() {
		return "CabinSeat [perMonthPrice=" + perMonthPrice + ", freeConferenceRoomTime=" + freeConferenceRoomTime
				+ ", cabinSeatGst=" + cabinSeatGst + "]";
	}

	public Integer getPerMonthPrice() {
		return perMonthPrice;
	}

	public void setPerMonthPrice(Integer perMonthPrice) {
		this.perMonthPrice = perMonthPrice;
	}

	public Integer getFreeConferenceRoomTime() {
		return freeConferenceRoomTime;
	}

	public void setFreeConferenceRoomTime(Integer freeConferenceRoomTime) {
		this.freeConferenceRoomTime = freeConferenceRoomTime;
	}

	public Integer getCabinSeatGst() {
		return cabinSeatGst;
	}

	public void setCabinSeatGst(Integer cabinSeatGst) {
		this.cabinSeatGst = cabinSeatGst;
	}

	
	

}
