package com.coupon.project.dataBase.Service;

import com.coupon.project.dataBase.beans.Company;
import com.coupon.project.dataBase.Exceptions.CompanyNotFoundException;

import java.util.List;

public interface CompanyService {

    boolean isCompanyExists(String email, String password) throws CompanyNotFoundException;
    void addCompany(Company company) throws CompanyNotFoundException;
    void updateCompany(Company company) throws CompanyNotFoundException;
    void deleteCompany(int companyID);
    List<Company> getAllCompanies();
    Company getOneCompany(int companyID) throws CompanyNotFoundException;

    void saveAll(List<Company> companies) throws CompanyNotFoundException;
}
