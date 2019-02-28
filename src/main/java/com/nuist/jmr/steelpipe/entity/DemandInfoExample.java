package com.nuist.jmr.steelpipe.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemandInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DemandInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkIdIsNull() {
            addCriterion("pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(Integer value) {
            addCriterion("pk_id =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(Integer value) {
            addCriterion("pk_id <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(Integer value) {
            addCriterion("pk_id >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_id >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(Integer value) {
            addCriterion("pk_id <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(Integer value) {
            addCriterion("pk_id <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<Integer> values) {
            addCriterion("pk_id in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<Integer> values) {
            addCriterion("pk_id not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(Integer value1, Integer value2) {
            addCriterion("pk_id between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_id not between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Integer value) {
            addCriterion("product_type_id =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Integer value) {
            addCriterion("product_type_id <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Integer value) {
            addCriterion("product_type_id >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type_id >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Integer value) {
            addCriterion("product_type_id <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_type_id <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Integer> values) {
            addCriterion("product_type_id in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Integer> values) {
            addCriterion("product_type_id not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("product_type_id between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type_id not between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andDemandNumIsNull() {
            addCriterion("demand_num is null");
            return (Criteria) this;
        }

        public Criteria andDemandNumIsNotNull() {
            addCriterion("demand_num is not null");
            return (Criteria) this;
        }

        public Criteria andDemandNumEqualTo(Integer value) {
            addCriterion("demand_num =", value, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumNotEqualTo(Integer value) {
            addCriterion("demand_num <>", value, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumGreaterThan(Integer value) {
            addCriterion("demand_num >", value, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_num >=", value, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumLessThan(Integer value) {
            addCriterion("demand_num <", value, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumLessThanOrEqualTo(Integer value) {
            addCriterion("demand_num <=", value, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumIn(List<Integer> values) {
            addCriterion("demand_num in", values, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumNotIn(List<Integer> values) {
            addCriterion("demand_num not in", values, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumBetween(Integer value1, Integer value2) {
            addCriterion("demand_num between", value1, value2, "demandNum");
            return (Criteria) this;
        }

        public Criteria andDemandNumNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_num not between", value1, value2, "demandNum");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDemandFromIsNull() {
            addCriterion("demand_from is null");
            return (Criteria) this;
        }

        public Criteria andDemandFromIsNotNull() {
            addCriterion("demand_from is not null");
            return (Criteria) this;
        }

        public Criteria andDemandFromEqualTo(Integer value) {
            addCriterion("demand_from =", value, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromNotEqualTo(Integer value) {
            addCriterion("demand_from <>", value, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromGreaterThan(Integer value) {
            addCriterion("demand_from >", value, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_from >=", value, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromLessThan(Integer value) {
            addCriterion("demand_from <", value, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromLessThanOrEqualTo(Integer value) {
            addCriterion("demand_from <=", value, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromIn(List<Integer> values) {
            addCriterion("demand_from in", values, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromNotIn(List<Integer> values) {
            addCriterion("demand_from not in", values, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromBetween(Integer value1, Integer value2) {
            addCriterion("demand_from between", value1, value2, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandFromNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_from not between", value1, value2, "demandFrom");
            return (Criteria) this;
        }

        public Criteria andDemandDescIsNull() {
            addCriterion("demand_desc is null");
            return (Criteria) this;
        }

        public Criteria andDemandDescIsNotNull() {
            addCriterion("demand_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDemandDescEqualTo(String value) {
            addCriterion("demand_desc =", value, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescNotEqualTo(String value) {
            addCriterion("demand_desc <>", value, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescGreaterThan(String value) {
            addCriterion("demand_desc >", value, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescGreaterThanOrEqualTo(String value) {
            addCriterion("demand_desc >=", value, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescLessThan(String value) {
            addCriterion("demand_desc <", value, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescLessThanOrEqualTo(String value) {
            addCriterion("demand_desc <=", value, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescLike(String value) {
            addCriterion("demand_desc like", value, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescNotLike(String value) {
            addCriterion("demand_desc not like", value, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescIn(List<String> values) {
            addCriterion("demand_desc in", values, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescNotIn(List<String> values) {
            addCriterion("demand_desc not in", values, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescBetween(String value1, String value2) {
            addCriterion("demand_desc between", value1, value2, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andDemandDescNotBetween(String value1, String value2) {
            addCriterion("demand_desc not between", value1, value2, "demandDesc");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIsNull() {
            addCriterion("is_confirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIsNotNull() {
            addCriterion("is_confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedEqualTo(Integer value) {
            addCriterion("is_confirmed =", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedNotEqualTo(Integer value) {
            addCriterion("is_confirmed <>", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedGreaterThan(Integer value) {
            addCriterion("is_confirmed >", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_confirmed >=", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedLessThan(Integer value) {
            addCriterion("is_confirmed <", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedLessThanOrEqualTo(Integer value) {
            addCriterion("is_confirmed <=", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIn(List<Integer> values) {
            addCriterion("is_confirmed in", values, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedNotIn(List<Integer> values) {
            addCriterion("is_confirmed not in", values, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedBetween(Integer value1, Integer value2) {
            addCriterion("is_confirmed between", value1, value2, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_confirmed not between", value1, value2, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}