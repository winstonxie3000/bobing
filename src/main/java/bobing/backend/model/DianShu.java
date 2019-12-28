package bobing.backend.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

/**
 *  博饼结果的点数集合
 */
@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
public class DianShu extends IdEntity implements Comparable<DianShu>{

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public int compareTo(DianShu anotherDianShu) {
        long id = this.getId();
        long anotherId = anotherDianShu.getId();
        return (id < anotherId ? -1 : (id == anotherId ? 0 : 1));
    }
}