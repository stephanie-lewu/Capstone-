package za.ac.cput.test;

import za.ac.cput.domain.Branch;
import za.ac.cput.factory.BranchFactory;

public class BranchTest {
    public static void main(String[] args) {

        //builder test
        System.out.println("Builder Test");

        Branch builderBranch = new Branch.Builder()
                .setBranchID(1)
                .setBranchName("Main Branch")
                .setAddress("926 Davey St")
                .setCity("Cape Town")
                .setManagerName("Alice")
                .build();

        System.out.println(builderBranch);
        builderBranch.listAvailableCarsAtBranch();

        //factory test
        System.out.println("\nFactory Test");

        Branch factoryBranch = BranchFactory.createBranch(
                2, "West Branch", "475 Parker Ave", "Durban", "Vusi"
        );

        System.out.println(factoryBranch);
        factoryBranch.listAvailableCarsAtBranch();
    }
}