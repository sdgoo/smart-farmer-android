package com.beanu.l2_recycleview.demo.loadmore;

import com.beanu.l2_recycleview.PageModel;
import com.beanu.l2_recycleview.demo.support.FakeLoader;
import com.beanu.l2_recycleview.demo.support.News;

import rx.Observable;

/**
 * Created by Beanu on 2016/12/20
 */

public class DemoLoadMoreModelImpl implements DemoLoadMoreContract.Model {

    @Override
    public Observable<PageModel<News>> loadData(int pageIndex) {
        return FakeLoader.loadNewsList(pageIndex);
    }


}