package com.anthony.shatdingspringbootmybatisgenerator.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordCallDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordCallDetailsExample() {
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

        public Criteria andSessionSourceIsNull() {
            addCriterion("session_source is null");
            return (Criteria) this;
        }

        public Criteria andSessionSourceIsNotNull() {
            addCriterion("session_source is not null");
            return (Criteria) this;
        }

        public Criteria andSessionSourceEqualTo(Byte value) {
            addCriterion("session_source =", value, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceNotEqualTo(Byte value) {
            addCriterion("session_source <>", value, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceGreaterThan(Byte value) {
            addCriterion("session_source >", value, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("session_source >=", value, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceLessThan(Byte value) {
            addCriterion("session_source <", value, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceLessThanOrEqualTo(Byte value) {
            addCriterion("session_source <=", value, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceIn(List<Byte> values) {
            addCriterion("session_source in", values, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceNotIn(List<Byte> values) {
            addCriterion("session_source not in", values, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceBetween(Byte value1, Byte value2) {
            addCriterion("session_source between", value1, value2, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("session_source not between", value1, value2, "sessionSource");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeIsNull() {
            addCriterion("session_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeIsNotNull() {
            addCriterion("session_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeEqualTo(Date value) {
            addCriterion("session_begin_time =", value, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeNotEqualTo(Date value) {
            addCriterion("session_begin_time <>", value, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeGreaterThan(Date value) {
            addCriterion("session_begin_time >", value, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("session_begin_time >=", value, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeLessThan(Date value) {
            addCriterion("session_begin_time <", value, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("session_begin_time <=", value, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeIn(List<Date> values) {
            addCriterion("session_begin_time in", values, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeNotIn(List<Date> values) {
            addCriterion("session_begin_time not in", values, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeBetween(Date value1, Date value2) {
            addCriterion("session_begin_time between", value1, value2, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andSessionBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("session_begin_time not between", value1, value2, "sessionBeginTime");
            return (Criteria) this;
        }

        public Criteria andExternalNoIsNull() {
            addCriterion("external_no is null");
            return (Criteria) this;
        }

        public Criteria andExternalNoIsNotNull() {
            addCriterion("external_no is not null");
            return (Criteria) this;
        }

        public Criteria andExternalNoEqualTo(String value) {
            addCriterion("external_no =", value, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoNotEqualTo(String value) {
            addCriterion("external_no <>", value, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoGreaterThan(String value) {
            addCriterion("external_no >", value, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoGreaterThanOrEqualTo(String value) {
            addCriterion("external_no >=", value, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoLessThan(String value) {
            addCriterion("external_no <", value, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoLessThanOrEqualTo(String value) {
            addCriterion("external_no <=", value, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoLike(String value) {
            addCriterion("external_no like", value, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoNotLike(String value) {
            addCriterion("external_no not like", value, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoIn(List<String> values) {
            addCriterion("external_no in", values, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoNotIn(List<String> values) {
            addCriterion("external_no not in", values, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoBetween(String value1, String value2) {
            addCriterion("external_no between", value1, value2, "externalNo");
            return (Criteria) this;
        }

        public Criteria andExternalNoNotBetween(String value1, String value2) {
            addCriterion("external_no not between", value1, value2, "externalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoIsNull() {
            addCriterion("internal_no is null");
            return (Criteria) this;
        }

        public Criteria andInternalNoIsNotNull() {
            addCriterion("internal_no is not null");
            return (Criteria) this;
        }

        public Criteria andInternalNoEqualTo(String value) {
            addCriterion("internal_no =", value, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoNotEqualTo(String value) {
            addCriterion("internal_no <>", value, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoGreaterThan(String value) {
            addCriterion("internal_no >", value, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoGreaterThanOrEqualTo(String value) {
            addCriterion("internal_no >=", value, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoLessThan(String value) {
            addCriterion("internal_no <", value, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoLessThanOrEqualTo(String value) {
            addCriterion("internal_no <=", value, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoLike(String value) {
            addCriterion("internal_no like", value, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoNotLike(String value) {
            addCriterion("internal_no not like", value, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoIn(List<String> values) {
            addCriterion("internal_no in", values, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoNotIn(List<String> values) {
            addCriterion("internal_no not in", values, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoBetween(String value1, String value2) {
            addCriterion("internal_no between", value1, value2, "internalNo");
            return (Criteria) this;
        }

        public Criteria andInternalNoNotBetween(String value1, String value2) {
            addCriterion("internal_no not between", value1, value2, "internalNo");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIsNull() {
            addCriterion("seat_number is null");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIsNotNull() {
            addCriterion("seat_number is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNumberEqualTo(String value) {
            addCriterion("seat_number =", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotEqualTo(String value) {
            addCriterion("seat_number <>", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThan(String value) {
            addCriterion("seat_number >", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThanOrEqualTo(String value) {
            addCriterion("seat_number >=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThan(String value) {
            addCriterion("seat_number <", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThanOrEqualTo(String value) {
            addCriterion("seat_number <=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLike(String value) {
            addCriterion("seat_number like", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotLike(String value) {
            addCriterion("seat_number not like", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIn(List<String> values) {
            addCriterion("seat_number in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotIn(List<String> values) {
            addCriterion("seat_number not in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberBetween(String value1, String value2) {
            addCriterion("seat_number between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotBetween(String value1, String value2) {
            addCriterion("seat_number not between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Byte value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Byte value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Byte value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Byte value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Byte value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Byte value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Byte> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Byte> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Byte value1, Byte value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Byte value1, Byte value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andSessionStatusIsNull() {
            addCriterion("session_status is null");
            return (Criteria) this;
        }

        public Criteria andSessionStatusIsNotNull() {
            addCriterion("session_status is not null");
            return (Criteria) this;
        }

        public Criteria andSessionStatusEqualTo(Byte value) {
            addCriterion("session_status =", value, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusNotEqualTo(Byte value) {
            addCriterion("session_status <>", value, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusGreaterThan(Byte value) {
            addCriterion("session_status >", value, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("session_status >=", value, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusLessThan(Byte value) {
            addCriterion("session_status <", value, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusLessThanOrEqualTo(Byte value) {
            addCriterion("session_status <=", value, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusIn(List<Byte> values) {
            addCriterion("session_status in", values, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusNotIn(List<Byte> values) {
            addCriterion("session_status not in", values, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusBetween(Byte value1, Byte value2) {
            addCriterion("session_status between", value1, value2, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("session_status not between", value1, value2, "sessionStatus");
            return (Criteria) this;
        }

        public Criteria andSessionReslutIsNull() {
            addCriterion("session_reslut is null");
            return (Criteria) this;
        }

        public Criteria andSessionReslutIsNotNull() {
            addCriterion("session_reslut is not null");
            return (Criteria) this;
        }

        public Criteria andSessionReslutEqualTo(Byte value) {
            addCriterion("session_reslut =", value, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutNotEqualTo(Byte value) {
            addCriterion("session_reslut <>", value, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutGreaterThan(Byte value) {
            addCriterion("session_reslut >", value, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutGreaterThanOrEqualTo(Byte value) {
            addCriterion("session_reslut >=", value, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutLessThan(Byte value) {
            addCriterion("session_reslut <", value, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutLessThanOrEqualTo(Byte value) {
            addCriterion("session_reslut <=", value, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutIn(List<Byte> values) {
            addCriterion("session_reslut in", values, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutNotIn(List<Byte> values) {
            addCriterion("session_reslut not in", values, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutBetween(Byte value1, Byte value2) {
            addCriterion("session_reslut between", value1, value2, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andSessionReslutNotBetween(Byte value1, Byte value2) {
            addCriterion("session_reslut not between", value1, value2, "sessionReslut");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Long value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Long value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Long value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Long value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Long value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Long> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Long> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Long value1, Long value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Long value1, Long value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andFailureCauseIsNull() {
            addCriterion("failure_cause is null");
            return (Criteria) this;
        }

        public Criteria andFailureCauseIsNotNull() {
            addCriterion("failure_cause is not null");
            return (Criteria) this;
        }

        public Criteria andFailureCauseEqualTo(Byte value) {
            addCriterion("failure_cause =", value, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseNotEqualTo(Byte value) {
            addCriterion("failure_cause <>", value, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseGreaterThan(Byte value) {
            addCriterion("failure_cause >", value, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseGreaterThanOrEqualTo(Byte value) {
            addCriterion("failure_cause >=", value, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseLessThan(Byte value) {
            addCriterion("failure_cause <", value, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseLessThanOrEqualTo(Byte value) {
            addCriterion("failure_cause <=", value, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseIn(List<Byte> values) {
            addCriterion("failure_cause in", values, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseNotIn(List<Byte> values) {
            addCriterion("failure_cause not in", values, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseBetween(Byte value1, Byte value2) {
            addCriterion("failure_cause between", value1, value2, "failureCause");
            return (Criteria) this;
        }

        public Criteria andFailureCauseNotBetween(Byte value1, Byte value2) {
            addCriterion("failure_cause not between", value1, value2, "failureCause");
            return (Criteria) this;
        }

        public Criteria andTaskKeyIsNull() {
            addCriterion("task_key is null");
            return (Criteria) this;
        }

        public Criteria andTaskKeyIsNotNull() {
            addCriterion("task_key is not null");
            return (Criteria) this;
        }

        public Criteria andTaskKeyEqualTo(String value) {
            addCriterion("task_key =", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyNotEqualTo(String value) {
            addCriterion("task_key <>", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyGreaterThan(String value) {
            addCriterion("task_key >", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyGreaterThanOrEqualTo(String value) {
            addCriterion("task_key >=", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyLessThan(String value) {
            addCriterion("task_key <", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyLessThanOrEqualTo(String value) {
            addCriterion("task_key <=", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyLike(String value) {
            addCriterion("task_key like", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyNotLike(String value) {
            addCriterion("task_key not like", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyIn(List<String> values) {
            addCriterion("task_key in", values, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyNotIn(List<String> values) {
            addCriterion("task_key not in", values, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyBetween(String value1, String value2) {
            addCriterion("task_key between", value1, value2, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyNotBetween(String value1, String value2) {
            addCriterion("task_key not between", value1, value2, "taskKey");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIsNull() {
            addCriterion("record_url is null");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIsNotNull() {
            addCriterion("record_url is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUrlEqualTo(String value) {
            addCriterion("record_url =", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotEqualTo(String value) {
            addCriterion("record_url <>", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlGreaterThan(String value) {
            addCriterion("record_url >", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlGreaterThanOrEqualTo(String value) {
            addCriterion("record_url >=", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLessThan(String value) {
            addCriterion("record_url <", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLessThanOrEqualTo(String value) {
            addCriterion("record_url <=", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLike(String value) {
            addCriterion("record_url like", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotLike(String value) {
            addCriterion("record_url not like", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIn(List<String> values) {
            addCriterion("record_url in", values, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotIn(List<String> values) {
            addCriterion("record_url not in", values, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlBetween(String value1, String value2) {
            addCriterion("record_url between", value1, value2, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotBetween(String value1, String value2) {
            addCriterion("record_url not between", value1, value2, "recordUrl");
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