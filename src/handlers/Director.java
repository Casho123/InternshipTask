package handlers;

import common.Type;

public class Director extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        String position = Director.class.getSimpleName();
        if (canApprove(cost, type)) {
            consolePrinter.isValid(position, id, cost);
            return;
        }

        consolePrinter.isInvalid(id, position);
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        return approvalChecker.approved(500, 1000, 1500, 3500, 6000, cost, type);
    }
}
