/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author ASUS
 */
public class ItemDto {
    private String code;
    private String description;
    private String packSize;
    private Double unitPrice;
    private Integer qoh;
    
    //To add this kind of constructors --> Ctrl + Space
    public ItemDto() {
    }

    public ItemDto(String code, String description, String packSize, Double unitPrice, Integer qoh) {
        this.code = code;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }
    
    
    //To add this kind of code --> Right click --> Encapsulate fields
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }
    
    //Right click --> Insert code --> toString()
    @Override
    public String toString() {
        return "ItemDto{" + "code=" + code + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
        
}
