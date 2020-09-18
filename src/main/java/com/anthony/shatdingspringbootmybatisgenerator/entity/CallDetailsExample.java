package com.anthony.shatdingspringbootmybatisgenerator.entity;

import java.util.ArrayList;
import java.util.List;

public class CallDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallDetailsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andSessionKeyIsNull() {
            addCriterion("session_key is null");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIsNotNull() {
            addCriterion("session_key is not null");
            return (Criteria) this;
        }

        public Criteria andSessionKeyEqualTo(String value) {
            addCriterion("session_key =", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotEqualTo(String value) {
            addCriterion("session_key <>", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyGreaterThan(String value) {
            addCriterion("session_key >", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("session_key >=", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLessThan(String value) {
            addCriterion("session_key <", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLessThanOrEqualTo(String value) {
            addCriterion("session_key <=", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLike(String value) {
            addCriterion("session_key like", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotLike(String value) {
            addCriterion("session_key not like", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIn(List<String> values) {
            addCriterion("session_key in", values, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotIn(List<String> values) {
            addCriterion("session_key not in", values, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyBetween(String value1, String value2) {
            addCriterion("session_key between", value1, value2, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotBetween(String value1, String value2) {
            addCriterion("session_key not between", value1, value2, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Long value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Long value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Long value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Long value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Long value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Long> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Long> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Long value1, Long value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Long value1, Long value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andSideIsNull() {
            addCriterion("side is null");
            return (Criteria) this;
        }

        public Criteria andSideIsNotNull() {
            addCriterion("side is not null");
            return (Criteria) this;
        }

        public Criteria andSideEqualTo(Byte value) {
            addCriterion("side =", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotEqualTo(Byte value) {
            addCriterion("side <>", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideGreaterThan(Byte value) {
            addCriterion("side >", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideGreaterThanOrEqualTo(Byte value) {
            addCriterion("side >=", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideLessThan(Byte value) {
            addCriterion("side <", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideLessThanOrEqualTo(Byte value) {
            addCriterion("side <=", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideIn(List<Byte> values) {
            addCriterion("side in", values, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotIn(List<Byte> values) {
            addCriterion("side not in", values, "side");
            return (Criteria) this;
        }

        public Criteria andSideBetween(Byte value1, Byte value2) {
            addCriterion("side between", value1, value2, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotBetween(Byte value1, Byte value2) {
            addCriterion("side not between", value1, value2, "side");
            return (Criteria) this;
        }

        public Criteria andSideIndexIsNull() {
            addCriterion("side_index is null");
            return (Criteria) this;
        }

        public Criteria andSideIndexIsNotNull() {
            addCriterion("side_index is not null");
            return (Criteria) this;
        }

        public Criteria andSideIndexEqualTo(Short value) {
            addCriterion("side_index =", value, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexNotEqualTo(Short value) {
            addCriterion("side_index <>", value, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexGreaterThan(Short value) {
            addCriterion("side_index >", value, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexGreaterThanOrEqualTo(Short value) {
            addCriterion("side_index >=", value, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexLessThan(Short value) {
            addCriterion("side_index <", value, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexLessThanOrEqualTo(Short value) {
            addCriterion("side_index <=", value, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexIn(List<Short> values) {
            addCriterion("side_index in", values, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexNotIn(List<Short> values) {
            addCriterion("side_index not in", values, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexBetween(Short value1, Short value2) {
            addCriterion("side_index between", value1, value2, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSideIndexNotBetween(Short value1, Short value2) {
            addCriterion("side_index not between", value1, value2, "sideIndex");
            return (Criteria) this;
        }

        public Criteria andSessionActIsNull() {
            addCriterion("session_act is null");
            return (Criteria) this;
        }

        public Criteria andSessionActIsNotNull() {
            addCriterion("session_act is not null");
            return (Criteria) this;
        }

        public Criteria andSessionActEqualTo(Byte value) {
            addCriterion("session_act =", value, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActNotEqualTo(Byte value) {
            addCriterion("session_act <>", value, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActGreaterThan(Byte value) {
            addCriterion("session_act >", value, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActGreaterThanOrEqualTo(Byte value) {
            addCriterion("session_act >=", value, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActLessThan(Byte value) {
            addCriterion("session_act <", value, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActLessThanOrEqualTo(Byte value) {
            addCriterion("session_act <=", value, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActIn(List<Byte> values) {
            addCriterion("session_act in", values, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActNotIn(List<Byte> values) {
            addCriterion("session_act not in", values, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActBetween(Byte value1, Byte value2) {
            addCriterion("session_act between", value1, value2, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andSessionActNotBetween(Byte value1, Byte value2) {
            addCriterion("session_act not between", value1, value2, "sessionAct");
            return (Criteria) this;
        }

        public Criteria andReslutTextIsNull() {
            addCriterion("reslut_text is null");
            return (Criteria) this;
        }

        public Criteria andReslutTextIsNotNull() {
            addCriterion("reslut_text is not null");
            return (Criteria) this;
        }

        public Criteria andReslutTextEqualTo(String value) {
            addCriterion("reslut_text =", value, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextNotEqualTo(String value) {
            addCriterion("reslut_text <>", value, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextGreaterThan(String value) {
            addCriterion("reslut_text >", value, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextGreaterThanOrEqualTo(String value) {
            addCriterion("reslut_text >=", value, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextLessThan(String value) {
            addCriterion("reslut_text <", value, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextLessThanOrEqualTo(String value) {
            addCriterion("reslut_text <=", value, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextLike(String value) {
            addCriterion("reslut_text like", value, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextNotLike(String value) {
            addCriterion("reslut_text not like", value, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextIn(List<String> values) {
            addCriterion("reslut_text in", values, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextNotIn(List<String> values) {
            addCriterion("reslut_text not in", values, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextBetween(String value1, String value2) {
            addCriterion("reslut_text between", value1, value2, "reslutText");
            return (Criteria) this;
        }

        public Criteria andReslutTextNotBetween(String value1, String value2) {
            addCriterion("reslut_text not between", value1, value2, "reslutText");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIsNull() {
            addCriterion("elapsed_time is null");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIsNotNull() {
            addCriterion("elapsed_time is not null");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeEqualTo(Integer value) {
            addCriterion("elapsed_time =", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotEqualTo(Integer value) {
            addCriterion("elapsed_time <>", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeGreaterThan(Integer value) {
            addCriterion("elapsed_time >", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("elapsed_time >=", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeLessThan(Integer value) {
            addCriterion("elapsed_time <", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("elapsed_time <=", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIn(List<Integer> values) {
            addCriterion("elapsed_time in", values, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotIn(List<Integer> values) {
            addCriterion("elapsed_time not in", values, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeBetween(Integer value1, Integer value2) {
            addCriterion("elapsed_time between", value1, value2, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("elapsed_time not between", value1, value2, "elapsedTime");
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