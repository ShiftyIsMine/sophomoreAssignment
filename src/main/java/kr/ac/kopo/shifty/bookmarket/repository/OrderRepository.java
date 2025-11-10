package kr.ac.kopo.shifty.bookmarket.repository;

import kr.ac.kopo.shifty.bookmarket.domain.Order;

public interface OrderRepository {

    long saveOrder(Order order);
}
