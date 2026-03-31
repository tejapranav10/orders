package com.example.orderapplication.Controller;

import com.example.orderapplication.Entity.Order;
import com.example.orderapplication.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    //orders
    @Autowired
    private OrderService service;
    @PostMapping
    public Order create(@RequestBody Order order){
        return service.createOrder(order);
    }
    @GetMapping
    public List<Order> getAll() {
        return service.getAllOrders();
    }
    @GetMapping("/{Id}")
    public Order getByID(@PathVariable Long Id){
        return service.getOrderById(Id);
    }
    @PutMapping("/{id}")
    public Order update(@PathVariable Long Id, @RequestBody Order order){
        return service.updateOrder(Id, order);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deletedOrder(id);
        return "Order deleted successfully";
    }

}
