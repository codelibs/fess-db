package org.codelibs.fess.db.allcommon;

import java.util.*;

import org.dbflute.jdbc.Classification;
import org.dbflute.jdbc.ClassificationCodeType;
import org.dbflute.jdbc.ClassificationMeta;
import org.dbflute.jdbc.ClassificationUndefinedHandlingType;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface CDef extends Classification {

    /** The empty array for no sisters. */
    String[] EMPTY_SISTERS = new String[]{};

    /** The empty map for no sub-items. */
    @SuppressWarnings("unchecked")
    Map<String, Object> EMPTY_SUB_ITEM_MAP = (Map<String, Object>)Collections.EMPTY_MAP;

    /**
     * Processing Type
     */
    public enum ProcessType implements CDef {
        /** Crawling: Process When Crawling */
        Crawling("C", "Crawling", EMPTY_SISTERS)
        ,
        /** Displaying: Process When Displaying */
        Displaying("D", "Displaying", EMPTY_SISTERS)
        ,
        /** Both: Process When Crawling/Displaying */
        Both("B", "Both", EMPTY_SISTERS)
        ;
        private static final Map<String, ProcessType> _codeValueMap = new HashMap<String, ProcessType>();
        static {
            for (ProcessType value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private ProcessType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.ProcessType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ProcessType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof ProcessType) { return (ProcessType)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ProcessType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<ProcessType> listAll() {
            return new ArrayList<ProcessType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<ProcessType> groupOf(String groupName) {
            return new ArrayList<ProcessType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * Access Type
     */
    public enum AccessType implements CDef {
        /** Web: Web */
        Web("W", "Web", EMPTY_SISTERS)
        ,
        /** Xml: Xml */
        Xml("X", "Xml", EMPTY_SISTERS)
        ,
        /** Json: Json */
        Json("J", "Json", EMPTY_SISTERS)
        ,
        /** Others: Others */
        Others("O", "Others", EMPTY_SISTERS)
        ;
        private static final Map<String, AccessType> _codeValueMap = new HashMap<String, AccessType>();
        static {
            for (AccessType value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private AccessType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.AccessType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AccessType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AccessType) { return (AccessType)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AccessType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<AccessType> listAll() {
            return new ArrayList<AccessType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<AccessType> groupOf(String groupName) {
            return new ArrayList<AccessType>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** Processing Type */
        ProcessType
        ,
        /** Access Type */
        AccessType
        ;
        public String classificationName() {
            return name(); // same as definition name
        }

        public Classification codeOf(Object code) {
            if ("ProcessType".equals(name())) { return CDef.ProcessType.codeOf(code); }
            if ("AccessType".equals(name())) { return CDef.AccessType.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification nameOf(String name) {
            if ("ProcessType".equals(name())) { return CDef.ProcessType.valueOf(name); }
            if ("AccessType".equals(name())) { return CDef.AccessType.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listAll() {
            if ("ProcessType".equals(name())) { return toClassificationList(CDef.ProcessType.listAll()); }
            if ("AccessType".equals(name())) { return toClassificationList(CDef.AccessType.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> groupOf(String groupName) {
            if ("ProcessType".equals(name())) { return toClassificationList(CDef.ProcessType.groupOf(groupName)); }
            if ("AccessType".equals(name())) { return toClassificationList(CDef.AccessType.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<Classification> toClassificationList(List<?> clsList) {
            return (List<Classification>)clsList;
        }

        public ClassificationCodeType codeType() {
            if ("ProcessType".equals(name())) { return ClassificationCodeType.String; }
            if ("AccessType".equals(name())) { return ClassificationCodeType.String; }
            return ClassificationCodeType.String; // as default
        }

        public ClassificationUndefinedHandlingType undefinedHandlingType() {
            if ("ProcessType".equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if ("AccessType".equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            return ClassificationUndefinedHandlingType.LOGGING; // as default
        }
    }
}
