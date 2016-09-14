package com.crs.demo.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.crs.demo.base.BaseActivity;
import com.crs.demo.bean.ResponseEntity;
import com.crs.demo.fragments.CarGoodsFragment;

import java.util.ArrayList;

/**
 * Created on 2016/9/14.
 * Author:crs
 * Description:测试fragment
 */
public class testFragmentActivity extends BaseActivity implements CarGoodsFragment.GetNetData {

    private ArrayList<Fragment> fragmentsList;
    private CarGoodsFragment carGoodsFragment;
    private ResponseEntity response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        initFragments();

    }

    private void initFragments() {
        fragmentsList = new ArrayList<>();
        //目的是获取fragment的实例，在创建fragment的时候传递数据
        carGoodsFragment = CarGoodsFragment.newInstance("普通车品", false, "1001", 10);
        fragmentsList.add(carGoodsFragment);
        //设置接口回调传递数据
        carGoodsFragment.getData(this);

    }

    @Override
    public void getCarGoodsData(Bundle bundle) {

    }


    //请求网络接口，获取数据
    public void getCarGoodsData() {
        //请求到数据之后,把数据传递到carGoodsFragment页面中
        carGoodsFragment.getResult(response);
    }
}
