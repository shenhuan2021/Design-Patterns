package cn.lifesmile.design.combat2;

import lombok.Data;

import java.util.List;

/**
 * @author shenhuan
 */
@Data
public class Category {

    private Long id;

    private String name;

    private Long pid;

    public Category() {

    }

    public Category(Long id, Long pid, String name) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    public Category(Long id) {
        this.id = id;
    }




    public <T> T execute(CategoryOperation<T> operation) throws Exception {
        return operation.doExecute(this);
    }
}
