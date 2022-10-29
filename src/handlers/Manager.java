package handlers;

import common.Type;

public class Manager extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        String position = Manager.class.getSimpleName();
        if (canApprove(cost, type)) {
            consolePrinter.isValid(position, id, cost);
            return;
        }

        consolePrinter.isInvalid(id, position);
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        return approvalChecker.approved(300, 500, 1000, 3000, 5000, cost, type);

    }
}
