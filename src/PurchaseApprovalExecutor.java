import common.Type;
import handlers.Approver;
import handlers.Director;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(1, 15000, Type.CONSUMABLES);
        manager.approve(2, 5000, Type.PC);
        manager.approve(3, 5000, Type.PC);
        manager.approve(4, 3000, Type.CLERICAL);


        // Checked with a few more examples
//        manager.approve(5, 800, Type.CONSUMABLES);
//        manager.approve(6, 300, Type.CLERICAL);
//        manager.approve(7, 300, Type.GAMING);
//        manager.approve(8, 3000, Type.GADGETS);
//        manager.approve(9, 5000, Type.GAMING);
//        manager.approve(10, 2500, Type.PC);

    }
}
