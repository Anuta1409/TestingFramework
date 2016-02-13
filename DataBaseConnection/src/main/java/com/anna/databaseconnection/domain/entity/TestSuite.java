/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anna.databaseconnection.domain.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Anna
 */
@Entity
@Table(name = "test_suite")
@NamedQueries({
    @NamedQuery(name = "TestSuite.findAll", query = "SELECT t FROM TestSuite t"),
    @NamedQuery(name = "TestSuite.findById", query = "SELECT t FROM TestSuite t WHERE t.id = :id"),
    @NamedQuery(name = "TestSuite.findByTestSuiteName", query = "SELECT t FROM TestSuite t WHERE t.testSuiteName = :testSuiteName"),
    @NamedQuery(name = "TestSuite.findByMethodName", query = "SELECT t FROM TestSuite t WHERE t.methodName = :methodName")})
public class TestSuite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "test_suite_name")
    private String testSuiteName;
    @Basic(optional = false)
    @Column(name = "method_name")
    private String methodName;

    public TestSuite() {
    }

    public TestSuite(Integer id) {
        this.id = id;
    }

    public TestSuite(Integer id, String testSuiteName, String methodName) {
        this.id = id;
        this.testSuiteName = testSuiteName;
        this.methodName = methodName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestSuiteName() {
        return testSuiteName;
    }

    public void setTestSuiteName(String testSuiteName) {
        this.testSuiteName = testSuiteName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestSuite)) {
            return false;
        }
        TestSuite other = (TestSuite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.anna.databaseconnection.domain.entity.TestSuite[ id=" + id + " ]";
    }
    
}
