package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of JOB_LOG as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, JOB_NAME, JOB_STATUS, TARGET, SCRIPT_TYPE, SCRIPT_DATA, SCRIPT_RESULT, START_TIME, END_TIME
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
public class LoaderOfJobLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<JobLog> _selectedList;
    protected BehaviorSelector _selector;
    protected JobLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfJobLog ready(List<JobLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected JobLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(JobLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<JobLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
