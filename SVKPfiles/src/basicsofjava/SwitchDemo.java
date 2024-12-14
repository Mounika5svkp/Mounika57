package basicsofjava;

public class SwitchDemo {

	public static void main(String[] args) {
		String day ="monday";
		switch (day)
		{
		case"monday":
		case "MONDAY":
		System.out.println("attend the meetings");
		break;
		case"tuesday":
		case "TUESDAY":
			System.out.println("work on project task");
			break;
		case"wednesday":
		case"WEDNESDAY":
			System.out.println("submit the prograss report");
			break;
		case"thursday":
		case "THURSDAY":
				System.out.println("client call review");
		break;
		case "friday":
		case "FRIDAY":
			System.out.println("Warp up weekly task");
			break;
		case "saturday":
		case "SATURDAY":
		case "sunday":
		case "SUNDAY":
			System.out.println("enjoy the weekend");
			default:
			{
				System.out.println("invaild day");
			}
		}
	}
}
	
		
		
		


