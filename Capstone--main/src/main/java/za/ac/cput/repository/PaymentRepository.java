/* PaymentRepository.java
PaymentRepository model class
Author: Owen jr Makene (223219665)
Date: 20 March 2026
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.List;

public interface PaymentRepository extends IRepository<Payment, String> {
    List<Payment> getAll();
}
