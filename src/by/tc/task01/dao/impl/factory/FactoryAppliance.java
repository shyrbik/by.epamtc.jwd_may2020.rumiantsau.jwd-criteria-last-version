package by.tc.task01.dao.impl.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public class FactoryAppliance implements Factory{

   public Appliance createAppliance(String applianceName, Map<String, String> paramValue){
      Appliance newAppliance = null;

   //   50 минута на видео
      /*
      Map<String, Appliance> chooseAppliance = new HashMap<>();
      chooseAppliance.put( SearchCriteria.Appliance.LAPTOP.toString(),
              new FactoryLaptop().setApplianceValue(paramValue));
      chooseAppliance.put(SearchCriteria.Appliance.OVEN.toString(),
              new FactoryOven().setApplianceValue(paramValue));
      chooseAppliance.put(SearchCriteria.Appliance.REFRIGERATOR.toString(),
              new FactoryRefrigerator().setApplianceValue(paramValue));
      chooseAppliance.put(SearchCriteria.Appliance.SPEAKERS.toString(),
              new FactorySpeakers().setApplianceValue(paramValue));
      chooseAppliance.put(SearchCriteria.Appliance.TABLETPC.toString(),
              new FactoryTabletPC().setApplianceValue(paramValue));
      chooseAppliance.put(SearchCriteria.Appliance.VACUUMCLEANER.toString(),
              new FactoryVacuumCleaner().setApplianceValue(paramValue));

      newAppliance = chooseAppliance.get(applianceName.toUpperCase());
      */


      //переписать без свитча через Енам и хешмепу Map<String, FactoryAppliance>, заэкстендить фабрики от ФакториЭпллиансе
      //

      switch (applianceName) {
         case "Laptop":
            newAppliance = new FactoryLaptop().setApplianceValue(paramValue);
            break;
         case "Oven":
            newAppliance = new FactoryOven().setApplianceValue(paramValue);
            break;
         case "Refrigerator":
            newAppliance = new FactoryRefrigerator().setApplianceValue(paramValue);
            break;
         case "Speakers":
            newAppliance = new FactorySpeakers().setApplianceValue(paramValue);
            break;
         case "TabletPC":
            newAppliance = new FactoryTabletPC().setApplianceValue(paramValue);
            break;
         case "VacuumCleaner":
            newAppliance = new FactoryVacuumCleaner().setApplianceValue(paramValue);
            break;
         default:
            System.out.println("We dont have such appliance");
            break;
      };

      return newAppliance;
   }

   /*
   public Appliance setApplianceValue(Map<String, String> paramValue) {
      return null;
   }
*/


}
