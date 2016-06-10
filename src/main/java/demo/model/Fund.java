package demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/6/3.
 */
@Data
public class Fund implements Serializable {
    private int id;
    private Date may;
    private double yaolao;
    private double yiliao;
    private double gongs;
    private double shiye;
    private double zfgjj;
}
