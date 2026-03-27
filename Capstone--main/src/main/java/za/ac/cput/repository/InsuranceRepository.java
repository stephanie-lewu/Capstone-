/*
Insurance.java
Insurance entity class
Author: Thandeka Malande (222857005)
Date: 18 March 2026
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Insurance;
import java.util.List;

public interface InsuranceRepository extends IRepository<Insurance, String> {
    List<Insurance> getAll();
}
