package entity;
public class InputService 
{
	OpenSeat os;
	CabinSeat cs;
	ConferenceRoom cr;
	Meal ml;

	public InputService(OpenSeat os, CabinSeat cs, ConferenceRoom cr,Meal ml) {
		super();
		this.os = os;
		this.cs = cs;
		this.cr = cr;
		this.ml = ml;
	}

	public InputService() {
		super();
		this.os = new OpenSeat();;
		this.cs = new CabinSeat();
		this.cr = new ConferenceRoom();
		this.ml = new Meal();
	}

	public void caculateForComapny(Integer openSeatCount, Integer cabinSeatCount ,Integer hourOfConferenceRoomUsages, Integer mealCount)
	{
		InputForCompany inputforCompany=new InputForCompany(openSeatCount,cabinSeatCount,hourOfConferenceRoomUsages,mealCount,this.os,this.cs,this.cr,this.ml);
		inputforCompany.calculateTotalOutput();
		
	}
	
}
