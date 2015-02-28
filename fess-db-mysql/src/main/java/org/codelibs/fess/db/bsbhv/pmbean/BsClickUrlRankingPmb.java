package org.codelibs.fess.db.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.paging.SimplePagingBean;
import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.codelibs.fess.db.allcommon.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.customize.*;

/**
 * The base class for typed parameter-bean of ClickUrlRanking. <br>
 * This is related to "<span style="color: #AD4747">selectClickUrlRanking</span>" on ClickLogBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsClickUrlRankingPmb extends SimplePagingBean implements EntityHandlingPmb<ClickLogBhv, ClickUrlRanking>, AutoPagingHandlingPmb<ClickLogBhv, ClickUrlRanking>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of fromRequestedTime. */
    protected java.time.LocalDateTime _fromRequestedTime;

    /** The parameter of toRequestedTime. */
    protected java.time.LocalDateTime _toRequestedTime;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of ClickUrlRanking. <br>
     * This is related to "<span style="color: #AD4747">selectClickUrlRanking</span>" on ClickLogBhv.
     */
    public BsClickUrlRankingPmb() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectClickUrlRanking"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<ClickUrlRanking> getEntityType() { return ClickUrlRanking.class; }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }
    
    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_fromRequestedTime);
        sb.append(dm).append(_toRequestedTime);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] fromRequestedTime <br>
     * @return The value of fromRequestedTime. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDateTime getFromRequestedTime() {
        return _fromRequestedTime;
    }

    /**
     * [set] fromRequestedTime <br>
     * @param fromRequestedTime The value of fromRequestedTime. (NullAllowed)
     */
    public void setFromRequestedTime(java.time.LocalDateTime fromRequestedTime) {
        _fromRequestedTime = fromRequestedTime;
    }

    /**
     * [get] toRequestedTime <br>
     * @return The value of toRequestedTime. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDateTime getToRequestedTime() {
        return _toRequestedTime;
    }

    /**
     * [set] toRequestedTime <br>
     * @param toRequestedTime The value of toRequestedTime. (NullAllowed)
     */
    public void setToRequestedTime(java.time.LocalDateTime toRequestedTime) {
        _toRequestedTime = toRequestedTime;
    }
}
