package com.example.orderapplication.Service;

import com.example.orderapplication.Entity.Order;
import com.example.orderapplication.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repo;
    public Order createOrder(Order order){
        if(order.getPrice()<=0){
            throw new RuntimeException("Invalid price");
        }
        else {
            return repo.save(order);
        }
    }
    public List<Order> getAllOrders() {
        return repo.findAll();
    }
    public Order getOrderById(Long OrderId){
        return repo.findById(OrderId).orElseThrow(()-> new RuntimeException("Order not found"));
    }
    public Order updateOrder(Long OrderId, Order updateOrder){
        Order existing=getOrderById(OrderId);
        existing.setProductName(updateOrder.getProductName());
        existing.setPrice(updateOrder.getPrice());
        existing.setQuantity(updateOrder.getQuantity());
        return repo.save(existing);
    }
    public void deletedOrder(Long Id){
        repo.deleteById(Id);
    }


}
