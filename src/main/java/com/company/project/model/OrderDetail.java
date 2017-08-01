package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "product_name")
    private String productName;

    private String requirement;

    private Double height;

    private Double width;

    private Double thickness;

    private Double num;

    private Double area;

    @Column(name = "final_num")
    private Double finalNum;

    private Double price;

    private Double amount;

    @Column(name = "pay_money")
    private Double payMoney;

    @Column(name = "reveived_money")
    private Double reveivedMoney;

    private Byte valid;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return requirement
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * @param requirement
     */
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    /**
     * @return height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return width
     */
    public Double getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * @return thickness
     */
    public Double getThickness() {
        return thickness;
    }

    /**
     * @param thickness
     */
    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    /**
     * @return num
     */
    public Double getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Double num) {
        this.num = num;
    }

    /**
     * @return area
     */
    public Double getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(Double area) {
        this.area = area;
    }

    /**
     * @return final_num
     */
    public Double getFinalNum() {
        return finalNum;
    }

    /**
     * @param finalNum
     */
    public void setFinalNum(Double finalNum) {
        this.finalNum = finalNum;
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return pay_money
     */
    public Double getPayMoney() {
        return payMoney;
    }

    /**
     * @param payMoney
     */
    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    /**
     * @return reveived_money
     */
    public Double getReveivedMoney() {
        return reveivedMoney;
    }

    /**
     * @param reveivedMoney
     */
    public void setReveivedMoney(Double reveivedMoney) {
        this.reveivedMoney = reveivedMoney;
    }

    /**
     * @return valid
     */
    public Byte getValid() {
        return valid;
    }

    /**
     * @param valid
     */
    public void setValid(Byte valid) {
        this.valid = valid;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}