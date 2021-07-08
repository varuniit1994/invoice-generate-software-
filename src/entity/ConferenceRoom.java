package entity;

public class ConferenceRoom {
    private Integer perHourCost;
    private Integer conferenceRoomGst;
    
	public ConferenceRoom(Integer perHourCost, Integer conferenceRoomGst) {
		super();
		this.perHourCost = perHourCost;
		this.conferenceRoomGst = conferenceRoomGst;
	}
	
	public ConferenceRoom() {
		super();
		this.perHourCost = 200;
		this.conferenceRoomGst = 18;
	}

	@Override
	public String toString() {
		return "ConferenceRoom [perHourCost=" + perHourCost + ", conferenceRoomGst=" + conferenceRoomGst + "]";
	}

	public Integer getPerHourCost() {
		return perHourCost;
	}
	public void setPerHourCost(Integer perHourCost) {
		this.perHourCost = perHourCost;
	}
	public Integer getConferenceRoomGst() {
		return conferenceRoomGst;
	}
	public void setConferenceRoomGst(Integer conferenceRoomGst) {
		this.conferenceRoomGst = conferenceRoomGst;
	}
}
