package demo.service.imp;

import com.sun.xml.internal.bind.v2.model.core.ID;
import demo.dao.GenricDao;
import demo.service.GenricService;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/5.
 */

public abstract class GenricServiceImp<T extends Serializable, ID extends Number> implements GenricService<T, ID> {
    GenricDao<T, ID> genricDao;

}
