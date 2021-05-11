package org.practice.service;

import org.practice.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoryUserService implements UserService{

    private List<User> uList;

    public MemoryUserService(){
        uList = new ArrayList<>();
        uList.add(new User(15291, "Constantin_Kuhlman15@yahoo.com", List.of(7001, 51417, 62289)));
        uList.add(new User(7001, "Keven6@gmail.com", List.of(15291, 51417, 62289, 66380)));
        uList.add(new User(51417, "Margaretta82@gmail.com", List.of(15291, 7001, 9250)));
        uList.add(new User(62289, "Marquise.Borer@hotmail.com", List.of(15291, 7001)));
    }


    public List<User> getuList() {
        return uList;
    }

    public void setuList(List<User> uList) {
        this.uList = uList;
    }



    @Override
    public Optional<User> getUserById(int id) {


        return getuList().stream().filter(it->it.getUserId() == id).findFirst();
    }

}
