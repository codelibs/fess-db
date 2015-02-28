package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of DATA_CONFIG_TO_LABEL_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, DATA_CONFIG_ID, LABEL_TYPE_ID
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
 *     DATA_CRAWLING_CONFIG, LABEL_TYPE
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     dataCrawlingConfig, labelType
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * Long dataConfigId = entity.getDataConfigId();
 * Long labelTypeId = entity.getLabelTypeId();
 * entity.setId(id);
 * entity.setDataConfigId(dataConfigId);
 * entity.setLabelTypeId(labelTypeId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDataConfigToLabelTypeMapping extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _id;

    /** DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG} */
    protected Long _dataConfigId;

    /** LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE} */
    protected Long _labelTypeId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "DATA_CONFIG_TO_LABEL_TYPE_MAPPING";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** DATA_CRAWLING_CONFIG by my DATA_CONFIG_ID, named 'dataCrawlingConfig'. */
    protected OptionalEntity<DataCrawlingConfig> _dataCrawlingConfig;

    /**
     * [get] DATA_CRAWLING_CONFIG by my DATA_CONFIG_ID, named 'dataCrawlingConfig'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'dataCrawlingConfig'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DataCrawlingConfig> getDataCrawlingConfig() {
        if (_dataCrawlingConfig == null) { _dataCrawlingConfig = OptionalEntity.relationEmpty(this, "dataCrawlingConfig"); }
        return _dataCrawlingConfig;
    }

    /**
     * [set] DATA_CRAWLING_CONFIG by my DATA_CONFIG_ID, named 'dataCrawlingConfig'.
     * @param dataCrawlingConfig The entity of foreign property 'dataCrawlingConfig'. (NullAllowed)
     */
    public void setDataCrawlingConfig(OptionalEntity<DataCrawlingConfig> dataCrawlingConfig) {
        _dataCrawlingConfig = dataCrawlingConfig;
    }

    /** LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'. */
    protected OptionalEntity<LabelType> _labelType;

    /**
     * [get] LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'labelType'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<LabelType> getLabelType() {
        if (_labelType == null) { _labelType = OptionalEntity.relationEmpty(this, "labelType"); }
        return _labelType;
    }

    /**
     * [set] LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     * @param labelType The entity of foreign property 'labelType'. (NullAllowed)
     */
    public void setLabelType(OptionalEntity<LabelType> labelType) {
        _labelType = labelType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsDataConfigToLabelTypeMapping) {
            BsDataConfigToLabelTypeMapping other = (BsDataConfigToLabelTypeMapping)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_dataCrawlingConfig != null && _dataCrawlingConfig.isPresent())
        { sb.append(li).append(xbRDS(_dataCrawlingConfig, "dataCrawlingConfig")); }
        if (_labelType != null && _labelType.isPresent())
        { sb.append(li).append(xbRDS(_labelType, "labelType")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_dataConfigId));
        sb.append(dm).append(xfND(_labelTypeId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_dataCrawlingConfig != null && _dataCrawlingConfig.isPresent())
        { sb.append(dm).append("dataCrawlingConfig"); }
        if (_labelType != null && _labelType.isPresent())
        { sb.append(dm).append("labelType"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DataConfigToLabelTypeMapping clone() {
        return (DataConfigToLabelTypeMapping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG} <br>
     * @return The value of the column 'DATA_CONFIG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDataConfigId() {
        checkSpecifiedProperty("dataConfigId");
        return _dataConfigId;
    }

    /**
     * [set] DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG} <br>
     * @param dataConfigId The value of the column 'DATA_CONFIG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDataConfigId(Long dataConfigId) {
        registerModifiedProperty("dataConfigId");
        _dataConfigId = dataConfigId;
    }

    /**
     * [get] LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE} <br>
     * @return The value of the column 'LABEL_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLabelTypeId() {
        checkSpecifiedProperty("labelTypeId");
        return _labelTypeId;
    }

    /**
     * [set] LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE} <br>
     * @param labelTypeId The value of the column 'LABEL_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLabelTypeId(Long labelTypeId) {
        registerModifiedProperty("labelTypeId");
        _labelTypeId = labelTypeId;
    }
}
