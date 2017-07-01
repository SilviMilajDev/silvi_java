package Experiments.ObjectFiles;


import java.io.Serializable;

public class ProductRecord implements Serializable {
    private int productCode;
    private String composition;
    private String productName;
    private String company;
    private int stockQuantity;
    private int reorderLevel;
    private float unitPrice;

    public ProductRecord(int productCode, String composition, String productName, String company, int stockQuantity, int reorderLevel, float unitPrice) {
        this.productCode = productCode;
        this.composition = composition;
        this.productName = productName;
        this.company = company;
        this.stockQuantity = stockQuantity;
        this.reorderLevel = reorderLevel;
        this.unitPrice = unitPrice;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}