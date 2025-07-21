import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(Payload.coursePrice());
		
		int count = js.getInt("courses.size()");
	//	System.out.println(count);
		
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
	//	System.out.println(purchaseAmount);
		
	//	String courseTitle = js.get("courses[0].title");
	//	System.out.println(courseTitle);
		
		//Print all titles
	/*	for(int i=0; i<count;i++) {
			String courseTitle = js.get("courses["+i+"].title");
			System.out.println(courseTitle);
			String price = js.get("courses["+i+"].price").toString();
			System.out.println(price);
		}*/
		
		System.out.println("Print RPA title values");
		
		for(int i=0; i<count;i++) {
			String courseTitle = js.get("courses["+i+"].title");
			//System.out.println(courseTitle);
			if(courseTitle.equals("RPA")) {
				String price = js.get("courses["+i+"].price").toString();
				System.out.println("Price "+price);
				String copies = js.get("courses["+i+"].copies").toString();
				System.out.println("Copies "+copies); break;
				
			}
			
		}
		
	}

}

