package panda.domain.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "packages")
public class Package extends BaseEntity{

    private String description;
    private Double weight;
    private String shippingAddress;
    private Status status;
    private LocalDate estimatedDeliveryTime;
    private User recipient;

    public Package() {
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "weight", nullable = false)
    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Column(name = "shipping_address", nullable = false)
    public String getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Column(name = "estimated_delivery_time")
    public LocalDate getEstimatedDeliveryTime() {
        return this.estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(LocalDate estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "recipient_id",referencedColumnName = "id", nullable = false)
    public User getRecipient() {
        return this.recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
}
