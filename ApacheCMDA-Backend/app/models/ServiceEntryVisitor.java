package models;

import java.util.*;

/**
 * Created by wangziming on 4/27/16.
 */

public class ServiceEntryVisitor implements ServiceVisitor{


    public User visit(User user) {
        return user;
    }
    public void visit(ClimateService climateService) {
        System.out.println("Visiting " + climateService.toString());
    }
    public void visit(ServiceEntry serviceEntry) {
        System.out.println("Visiting " + serviceEntry.toString());
    }

}
