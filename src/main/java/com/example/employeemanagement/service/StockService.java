package com.example.employeemanagement.service;

import org.springframework.stereotype.Service;

import com.example.employeemanagement.model.Stock;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {
    private final List<Stock> stocks = new ArrayList<>();
    private long nextId = 1;

    public List<Stock> getAllStocks() {
        return stocks;
    }

    public Stock getStockById(Long id) {
        return stocks.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    public Stock createStock(Stock stock) {
        stock.setId(nextId++);
        stocks.add(stock);
        return stock;
    }
}
