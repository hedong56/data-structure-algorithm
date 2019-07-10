package com.accdays.keyword;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/10 15:47
 * @updateDate 2019/7/10 15:47
 **/
public interface UserService {

    int updatePerson();

    /**
    * @description  default 方法,已经有默认的实现体，可以在子类中不必实现。
    * @return      int
    * @author      hedong
    * @date        2019/7/10 15:52
    **/
    default int addPerson(){
        return 0;
    }

}


class UserServiceImpl implements UserService{

    @Override
    public int updatePerson() {
        return 0;
    }
}
