package models;

import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
public class StandingOrder {
    private int amount;
    private int recipientId;
    private String recipientName;
    private String frequency;

    public StandingOrder(int amount, int recipientId, String recipientName, String frequency) {
        this.amount = amount;
        this.recipientId = recipientId;
        this.recipientName = recipientName;
        this.frequency = frequency;
    }
}
