package handlers;

import common.Type;

public class VicePresident extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        String position = VicePresident.class.getSimpleName();
        if (canApprove(cost, type)) {
            consolePrinter.isValid(position, id, cost);
            return;
        }

        consolePrinter.isInvalid(id, position);
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        return approvalChecker.approved(700, 1500, 2000, 4500, 6500, cost, type);

    }


}
