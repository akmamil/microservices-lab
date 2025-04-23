package project.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    public Order() {}

    public Order(String description) {
        this.description = description;
    }

}
