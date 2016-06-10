package demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/3.
 */
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String pass;
}