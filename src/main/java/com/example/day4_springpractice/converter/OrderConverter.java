package com.example.day4_springpractice.converter;

import com.example.day4_springpractice.dto.OrderDTO;
import com.example.day4_springpractice.model.Orders;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Component
public class OrderConverter {

    public OrderDTO convertEntityToDto(Orders order){
        ModelMapper modelMapper = new ModelMapper();
        OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);
        return orderDTO;
    }

    public Orders convertDtoToEntity(OrderDTO orderDTO){
        ModelMapper modelMapper = new ModelMapper();
        Orders order = modelMapper.map(orderDTO, Orders.class);
        return order;
    }
}
