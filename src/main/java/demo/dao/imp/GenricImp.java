package demo.dao.imp;

import demo.dao.GenricDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Administrator on 2016/6/5.
 */
public class GenricImp<T extends Serializable, ID extends Number> implements GenricDao<T, ID> {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Resource
    private SqlSession sqlSession;
    private String namespace;

    public GenricImp() {
        Class<T> modelClass;
        modelClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        namespace = modelClass.getSimpleName().toLowerCase();

    }

    public void create(T model) {
        sqlSession.insert(namespace + ".create", model);

    }

    public void remove(ID id) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSession.delete(namespace + ".remove", id);

    }

    public void modify(T model) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSession.update(namespace + ".modify", model);
    }

    public T search(ID id) {
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession.selectOne(namespace + ".search");
    }

    public T search(String statement, Object parameter) {
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession.selectOne(statement, parameter);
    }

    public List<T> list() {
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession.selectList(namespace + ".list");
    }

    public List<T> list(String statement, Object parameter) {
        return sqlSession.selectList(statement, parameter);
    }
}
