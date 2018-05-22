package com.cppc.backend.counter;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.util.Date;

@RedisHash
public class Visit {
    @Id
    private String id;

    private int count;

    private Date startAt;

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "id='" + id + '\'' +
                ", count=" + count +
                ", startAt=" + startAt +
                '}';
    }
}
