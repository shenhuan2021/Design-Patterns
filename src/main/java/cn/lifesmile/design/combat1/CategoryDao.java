package cn.lifesmile.design.combat1;


import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author shawn
 */
public class CategoryDao {

    public Category selectById(Long id) {
        return DateCache.data.get(id);
    }


    public Category removeById(Long id) {
        return DateCache.data.remove(id);
    }


    public List<Category> selectChildren(Long id){
        Map<Long, Category> data = DateCache.data;
        List<Category> categories = new ArrayList<>();
        data.forEach((k,v)->{

            Long pid = v.getPid();
            if (id.equals(pid)) {
                categories.add(v);
            }
        });
        return categories;
    }
}
