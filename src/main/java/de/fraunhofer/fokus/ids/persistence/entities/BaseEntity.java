package de.fraunhofer.fokus.ids.persistence.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public abstract class BaseEntity {

    private Long id;
    @JsonProperty("created_at")
    private Instant createdAt;
    @JsonProperty("updated_at")
    private Instant updatedAt;

    public void createdAt() {
        this.createdAt = this.updatedAt = Instant.now();
    }

    public void updatedAt() {
        this.updatedAt = Instant.now();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() != BaseEntity.class
                && ((BaseEntity)obj).id != null
                && ((BaseEntity)obj).id.equals(this.id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}
