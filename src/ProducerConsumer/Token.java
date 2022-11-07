package ProducerConsumer;

import java.util.UUID;

public class Token {

    private UUID id;
    private int number;
    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Token [id=" + id + ", number=" + number + ", description=" + description + "]";
    }
}
