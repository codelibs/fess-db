package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.CrawlingSessionInfoCQ;

/**
 * The nest select set-upper of CRAWLING_SESSION_INFO.
 * @author DBFlute(AutoGenerator)
 */
public class CrawlingSessionInfoNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CrawlingSessionInfoCQ _query;
    public CrawlingSessionInfoNss(CrawlingSessionInfoCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * CRAWLING_SESSION by my CRAWLING_SESSION_ID, named 'crawlingSession'.
     */
    public void withCrawlingSession() {
        _query.xdoNss(() -> _query.queryCrawlingSession());
    }
}
