package entity;

import java.math.BigDecimal;

public class OpenSeat {
	private  Integer perMonthPrice;
	private  Integer freeConferenceRoomTime;
	private  Integer openSeatGst;
	
	public OpenSeat(Integer perMonthPrice, Integer freeConferenceRoomTime, Integer openSeatGst) {
		super();
		this.perMonthPrice = perMonthPrice;
		this.freeConferenceRoomTime = freeConferenceRoomTime;
		this.openSeatGst = openSeatGst;
	}
	
	public OpenSeat() {
		super();
		this.perMonthPrice=5000;
		this.freeConferenceRoomTime=5;
		this.openSeatGst=18;
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
	public Integer getOpenSeatGst() {
		return openSeatGst;
	}
	public void setOpenSeatGst(Integer openSeatGst) {
		this.openSeatGst = openSeatGst;
	}

	@Override
	public String toString() {
		return "OpenSeat [perMonthPrice=" + perMonthPrice + ", freeConferenceRoomTime=" + freeConferenceRoomTime
				+ ", openSeatGst=" + openSeatGst + "]";
	}
	
}
