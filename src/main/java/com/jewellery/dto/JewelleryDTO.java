package com.jewellery.dto;

public class JewelleryDTO {

    private int jewelleryId;
    private String jewelleryName;
    private double price;
    private double weight;
    private String material;
    private String imageUrl;
    private int stockQuantity;

    public JewelleryDTO() {

    }

    public JewelleryDTO(int jewelleryId, String jewelleryName, double price, double weight,
            String material, String imageUrl, int stockQuantity) {

        this.jewelleryId = jewelleryId;
        this.jewelleryName = jewelleryName;
        this.price = price;
        this.weight = weight;
        this.material = material;
        this.imageUrl = imageUrl;
        this.stockQuantity = stockQuantity;
    }

    public int getJewelleryId() {
        return jewelleryId;
    }

    public void setJewelleryId(int jewelleryId) {
        this.jewelleryId = jewelleryId;
    }

    public String getJewelleryName() {
        return jewelleryName;
    }

    public void setJewelleryName(String jewelleryName) {
        this.jewelleryName = jewelleryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "JewelleryDTO [jewelleryId=" + jewelleryId + ", jewelleryName=" + jewelleryName
                + ", price=" + price + ", weight=" + weight + ", material=" + material
                + ", stockQuantity=" + stockQuantity + "]";
    }
}
