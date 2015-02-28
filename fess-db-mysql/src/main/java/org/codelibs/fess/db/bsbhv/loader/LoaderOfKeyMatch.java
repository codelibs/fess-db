package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of KEY_MATCH as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, TERM, QUERY, MAX_SIZE, BOOST, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfKeyMatch {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<KeyMatch> _selectedList;
    protected BehaviorSelector _selector;
    protected KeyMatchBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfKeyMatch ready(List<KeyMatch> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected KeyMatchBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(KeyMatchBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<KeyMatch> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
