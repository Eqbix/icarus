package service;

import model.Sale;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleService {
    private List<Sale> sales;

    public SaleService() {
        this.sales = new ArrayList<>();
    }

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public List<Sale> getAllSales() {
        return sales;
    }

    public List<Sale> getSalesByCustomer(String customerId) {
        List<Sale> customerSales = new ArrayList<>();
        for (Sale sale : sales) {
            if (sale.getCustomer().getId().equals(customerId)) {
                customerSales.add(sale);
            }
        }
        return customerSales;
    }

    public List<Sale> getSalesByDate(Date date) {
        // Простой пример, можно улучшить с использованием Calendar
        List<Sale> dateSales = new ArrayList<>();
        for (Sale sale : sales) {
            if (sale.getSaleDate().equals(date)) {
                dateSales.add(sale);
            }
        }
        return dateSales;
    }
}
