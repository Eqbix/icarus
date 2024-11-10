package controller;

import model.Sale;
import service.SaleService;

import java.util.List;

public class SaleController {
    private SaleService saleService;

    public SaleController() {
        this.saleService = new SaleService();
    }

    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    public void addSale(Sale sale) {
        saleService.addSale(sale);
    }

    public void updateSale(Sale sale) {
        saleService.updateSale(sale);
    }

    public void deleteSale(int id) {
        saleService.deleteSale(id);
    }
}
