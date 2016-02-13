package com.anna.webtestingframe.web.domain;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "test_cases")
@NamedQueries({
    @NamedQuery(name = "TestCases.findAll", query = "SELECT t FROM TestCases t"),
    @NamedQuery(name = "TestCases.findById", query = "SELECT t FROM TestCases t WHERE t.id = :id"),
    @NamedQuery(name = "TestCases.findByTestCaseName", query = "SELECT t FROM TestCases t WHERE t.testCaseName = :testCaseName"),
    @NamedQuery(name = "TestCases.findByTestSuiteId", query = "SELECT t FROM TestCases t WHERE t.testSuiteId = :testSuiteId")})
public class TestCases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "test_case_name")
    private String testCaseName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "test_suite_id")
    private int testSuiteId;

    public TestCases() {
    }

    public TestCases(Integer id) {
        this.id = id;
    }

    public TestCases(Integer id, String testCaseName, int testSuiteId) {
        this.id = id;
        this.testCaseName = testCaseName;
        this.testSuiteId = testSuiteId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public int getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(int testSuiteId) {
        this.testSuiteId = testSuiteId;
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
        if (!(object instanceof TestCases)) {
            return false;
        }
        TestCases other = (TestCases) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.anna.webtestingframe.web.domain.TestCases[ id=" + id + " ]";
    }
    
}
