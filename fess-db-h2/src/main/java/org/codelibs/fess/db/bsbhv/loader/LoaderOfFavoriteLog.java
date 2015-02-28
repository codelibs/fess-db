package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of FAVORITE_LOG as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, USER_ID, URL, CREATED_TIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER_INFO
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     userInfo
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfFavoriteLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<FavoriteLog> _selectedList;
    protected BehaviorSelector _selector;
    protected FavoriteLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFavoriteLog ready(List<FavoriteLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FavoriteLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FavoriteLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUserInfo _foreignUserInfoLoader;
    public LoaderOfUserInfo pulloutUserInfo() {
        if (_foreignUserInfoLoader == null)
        { _foreignUserInfoLoader = new LoaderOfUserInfo().ready(myBhv().pulloutUserInfo(_selectedList), _selector); }
        return _foreignUserInfoLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<FavoriteLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
