package com.example.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ORDER")
class Order {

    @Id
    @GeneratedValue
    private Long id;
    private String descriptions;
    private Status status;

    public Order() {
    }

    public Order(String descriptions, Status status) {
        this.descriptions = descriptions;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.descriptions, this.status);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Order))
            return false;
        Order order = (Order) obj;

        return Objects.equals(this.id, order.id) &&
                Objects.equals(this.descriptions, order.descriptions)
                && this.status == order.status;
    }

    @Override
    public String toString() {
        return "Order{id=" + this.id + ", description='" +
                this.descriptions + "', status=" + this.status + '}';
    }
}
