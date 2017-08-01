package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "delivery_date")
    private Date deliveryDate;

    @Column(name = "customer_id")
    private Integer customerId;

    private String title;

    @Column(name = "install_link")
    private String installLink;

    @Column(name = "install_address")
    private String installAddress;

    @Column(name = "total_money")
    private Double totalMoney;

    @Column(name = "preferential_money")
    private Double preferentialMoney;

    @Column(name = "final_money")
    private Double finalMoney;

    @Column(name = "unreceived_money")
    private Double unreceivedMoney;

    private String remark;

    private Byte valid;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String status;

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
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return order_date
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return delivery_date
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * @param deliveryDate
     */
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * @return customer_id
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return install_link
     */
    public String getInstallLink() {
        return installLink;
    }

    /**
     * @param installLink
     */
    public void setInstallLink(String installLink) {
        this.installLink = installLink;
    }

    /**
     * @return install_address
     */
    public String getInstallAddress() {
        return installAddress;
    }

    /**
     * @param installAddress
     */
    public void setInstallAddress(String installAddress) {
        this.installAddress = installAddress;
    }

    /**
     * @return total_money
     */
    public Double getTotalMoney() {
        return totalMoney;
    }

    /**
     * @param totalMoney
     */
    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * @return preferential_money
     */
    public Double getPreferentialMoney() {
        return preferentialMoney;
    }

    /**
     * @param preferentialMoney
     */
    public void setPreferentialMoney(Double preferentialMoney) {
        this.preferentialMoney = preferentialMoney;
    }

    /**
     * @return final_money
     */
    public Double getFinalMoney() {
        return finalMoney;
    }

    /**
     * @param finalMoney
     */
    public void setFinalMoney(Double finalMoney) {
        this.finalMoney = finalMoney;
    }

    /**
     * @return unreceived_money
     */
    public Double getUnreceivedMoney() {
        return unreceivedMoney;
    }

    /**
     * @param unreceivedMoney
     */
    public void setUnreceivedMoney(Double unreceivedMoney) {
        this.unreceivedMoney = unreceivedMoney;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
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

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}