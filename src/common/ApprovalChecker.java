package common;

// Class with 1 method that negates the use of a switch statement in every Approver class.

public class ApprovalChecker {

    public boolean approved(double consumablesLimit, double clericalLimit, double gadgetsLimit, double gamingCLimit, double pcLimit, double cost, Type type) {
        boolean result = false;

        switch (type) {
            case CONSUMABLES:
                if (cost <= consumablesLimit) {
                    result = true;
                }
                break;
            case CLERICAL:
                if (cost <= clericalLimit) {
                    result = true;
                }
                break;
            case GADGETS:
                if (cost <= gadgetsLimit) {
                    result = true;
                }
                break;
            case GAMING:
                if (cost <= gamingCLimit) {
                    result = true;
                }
                break;
            case PC:
                if (cost <= pcLimit) {
                    result = true;
                }
                break;
            default:
                break;
        }

        return result;


    }
}
