package demo.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/6/5.
 */
public interface GenricDao<T extends Serializable,ID extends Number> {
    void create(T model);
    void remove(ID id);
    void modify(T model);
    T search(ID id);
    T search(String statement, Object parameter);
    List<T> list();
    List<T> list(String statement, Object parameter);

}
