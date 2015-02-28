package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.DataConfigToLabelTypeMappingCQ;

/**
 * The nest select set-upper of DATA_CONFIG_TO_LABEL_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class DataConfigToLabelTypeMappingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DataConfigToLabelTypeMappingCQ _query;
    public DataConfigToLabelTypeMappingNss(DataConfigToLabelTypeMappingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * DATA_CRAWLING_CONFIG by my DATA_CONFIG_ID, named 'dataCrawlingConfig'.
     */
    public void withDataCrawlingConfig() {
        _query.xdoNss(() -> _query.queryDataCrawlingConfig());
    }
    /**
     * With nested relation columns to select clause. <br>
     * LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     */
    public void withLabelType() {
        _query.xdoNss(() -> _query.queryLabelType());
    }
}
