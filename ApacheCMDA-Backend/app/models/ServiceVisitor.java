package models;

/**
 * Created by wangziming on 4/27/16.
 */
public interface ServiceVisitor {
    User visit(User user);
    void visit(ClimateService climateService);
    void visit(ServiceEntry serviceEntry);
}
