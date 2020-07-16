package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {


		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//System.out.println(SearchCriteria.Laptop);

		///////////////////////////////////////////////////////////
		Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());//"Laptop"
		criteriaLaptop.add(SearchCriteria.Laptop.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);


		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 33);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);


		//////////////////////////////////////////////////////////////////

		Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
		criteriaRefrigerator.add(Refrigerator.HEIGHT.toString(), 200);
		criteriaRefrigerator.add(Refrigerator.WIDTH.toString(), 70);

		appliance = service.find(criteriaRefrigerator);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 7000);

		appliance = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}
