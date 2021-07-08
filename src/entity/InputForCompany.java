package entity;

import java.math.BigDecimal;

public class InputForCompany {

	Integer openSeatCount;
	Integer cabinSeatCount;
	Integer hourOfConferenceRoomUsages;
	Integer mealCount;
	OpenSeat openSeat;
	CabinSeat cabinSeat;
	ConferenceRoom conferenceRoom;
	Meal meal;
	
	public InputForCompany(Integer openSeatCount, Integer cabinSeatCount, Integer hourOfConferenceRoomUsages,
			Integer mealCount, OpenSeat openSeat, CabinSeat cabinSeat, ConferenceRoom conferenceRoom, Meal meal) {
		super();
		this.openSeatCount = openSeatCount;
		this.cabinSeatCount = cabinSeatCount;
		this.hourOfConferenceRoomUsages = hourOfConferenceRoomUsages;
		this.mealCount = mealCount;
		this.openSeat = openSeat;
		this.cabinSeat = cabinSeat;
		this.conferenceRoom = conferenceRoom;
		this.meal = meal;
	}


	public InputForCompany() {
		super();
	}
	public Integer getOpenSeatCount() {
		return openSeatCount;
	}
	@Override
	public String toString() {
		return "InputForCompany [openSeatCount=" + openSeatCount + ", cabinSeatCount=" + cabinSeatCount
				+ ", hourOfConferenceRoomUsages=" + hourOfConferenceRoomUsages + ", mealCount=" + mealCount + "]";
	}
	public void setOpenSeatCount(Integer openSeatCount) {
		this.openSeatCount = openSeatCount;
	}
	public Integer getCabinSeatCount() {
		return cabinSeatCount;
	}
	public void setCabinSeatCount(Integer cabinSeatCount) {
		this.cabinSeatCount = cabinSeatCount;
	}
	public Integer getHourOfConferenceRoomUsages() {
		return hourOfConferenceRoomUsages;
	}
	public void setHourOfConferenceRoomUsages(Integer hourOfConferenceRoomUsages) {
		this.hourOfConferenceRoomUsages = hourOfConferenceRoomUsages;
	}
	public Integer getMealCount() {
		return mealCount;
	}
	public void setMealCount(Integer mealCount) {
		this.mealCount = mealCount;
	}
	
	public OpenSeat getOpenSeat() {
		return openSeat;
	}


	public void setOpenSeat(OpenSeat openSeat) {
		this.openSeat = openSeat;
	}


	public CabinSeat getCabinSeat() {
		return cabinSeat;
	}


	public void setCabinSeat(CabinSeat cabinSeat) {
		this.cabinSeat = cabinSeat;
	}


	public ConferenceRoom getConferenceRoom() {
		return conferenceRoom;
	}


	public void setConferenceRoom(ConferenceRoom conferenceRoom) {
		this.conferenceRoom = conferenceRoom;
	}


	public Meal getMeal() {
		return meal;
	}


	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	
	public void calculateTotalOutput()
	{
		BigDecimal openSeatCost= BigDecimal.valueOf(this.openSeat.getPerMonthPrice()*this.getOpenSeatCount());
		BigDecimal openSeatGstCost=BigDecimal.valueOf((openSeatCost.doubleValue()*this.openSeat.getOpenSeatGst())/100);	
		BigDecimal openSeatTotalCost=openSeatCost.add(openSeatGstCost);
		System.out.println("Open Seat Total Bill : "+ openSeatTotalCost);
		System.out.println("Open Seat Total Gst :"+openSeatGstCost);
		
		BigDecimal cabinSeatCost=BigDecimal.valueOf(this.cabinSeat.getPerMonthPrice()* this.getCabinSeatCount());
		BigDecimal cabinSeatGstCost=BigDecimal.valueOf((cabinSeatCost.doubleValue()*this.cabinSeat.getCabinSeatGst())/100);
		BigDecimal cabinSeatTotalCost=cabinSeatCost.add(cabinSeatGstCost);
		System.out.println("Cabin Seat Total Bill : "+ cabinSeatTotalCost);
		System.out.println("Cabin Seat Total Gst :"+cabinSeatGstCost);
		
		BigDecimal mealCost=BigDecimal.valueOf(this.getMealCount()*this.meal.getPerMealCost());
		BigDecimal mealGstCost=BigDecimal.valueOf((mealCost.doubleValue()*this.meal.getMealGST())/100);
		BigDecimal mealTotalCost=mealCost.add(mealGstCost);
		System.out.println("Meal Total Bill : "+ mealTotalCost);
		System.out.println("Meal Total Gst :"+mealGstCost);
		
		BigDecimal conferenceRoomCost = BigDecimal.ZERO;
		Integer freeConferenceRoomHourCount=this.getCabinSeat().getFreeConferenceRoomTime()*this.getCabinSeatCount()+this.getOpenSeat().getFreeConferenceRoomTime()*this.getOpenSeatCount();
		Integer extraCount=this.getHourOfConferenceRoomUsages()-freeConferenceRoomHourCount;
		if(extraCount>0)
		{
			conferenceRoomCost=BigDecimal.valueOf( this.getConferenceRoom().getPerHourCost()*extraCount);
		}
		BigDecimal conferenceRooGstCost=BigDecimal.valueOf((conferenceRoomCost.doubleValue()*this.getConferenceRoom().getConferenceRoomGst())/100);
		BigDecimal conferenceTotalCost=conferenceRoomCost.add(conferenceRooGstCost);
		System.out.println("Conference Room Total Bill : "+ conferenceTotalCost);
		System.out.println("Conference Room Total Gst :"+conferenceRooGstCost);
				
		BigDecimal totalBill=conferenceTotalCost.add(mealTotalCost).add(cabinSeatTotalCost).add(openSeatTotalCost);
		BigDecimal totalGSTBill=openSeatGstCost.add(cabinSeatGstCost).add(mealGstCost).add(conferenceRooGstCost);
		System.out.println("Total Bill : "+ totalBill);
		System.out.println("Total Gst :"+totalGSTBill);
		
	}

	
}
